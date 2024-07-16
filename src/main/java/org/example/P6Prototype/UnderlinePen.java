package org.example.P6Prototype;

import org.example.P6Prototype.framework.Product;

public class UnderlinePen extends Product {

    private final char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        System.out.println("\"" + s +"\"");

        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
    }
}
