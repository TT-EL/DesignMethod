package org.example.P20Flyweight;

/**
 * 表示多个BigChar组成的大型字符串类
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String str, boolean share) {
        bigChars = new BigChar[str.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < str.length(); i++) {
            if(share) {
                bigChars[i] = factory.getBigChar(str.charAt(i));
            } else {
                bigChars[i] = new BigChar(str.charAt(i));
            }

        }
    }

    public void print() {
        for (BigChar bigChar : bigChars) {
            bigChar.print();
        }
    }
}
