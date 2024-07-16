package org.example.P20Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 表示大型字符的类
 */
public class BigChar {
    // 字符名称
    private char charName;

    // 大型字符由对应的字符组成（# . '\n'）
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/yson/code/DesignMethod/src/main/java/org/example/P20Flyweight/Font/big" + charName + ".txt"));
            String line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }

            bufferedReader.close();
            this.fontData = buffer.toString();

        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
