package org.example.P23Interpreter;

import java.util.StringTokenizer;

public class Context {

    // Token 在这里是“语法标记”的意思，可以认为每个空格分隔的字符串为一个token
    private StringTokenizer tokenizer;

    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     * 获取并前进到下一个标记
     *
     * @return 下一个标记
     */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }

        return currentToken;
    }

    /**
     * 获取当前标记，不移动
     *
     * @return 当前标记
     */
    public String currentToken() {
        return currentToken;
    }

    /**
     * 跳过指定标记
     *
     * @param token 指定的标记
     * @throws ParseException
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }

        nextToken();
    }

    /**
     * 解析当前位置的数字标记
     * @return 数值
     * @throws ParseException
     */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: "+ e);
        }

        return number;
    }

}
