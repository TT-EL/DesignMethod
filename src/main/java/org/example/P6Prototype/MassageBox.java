package org.example.P6Prototype;

import org.example.P6Prototype.framework.Product;

public class MassageBox extends Product {

    private final char docChar;

    public MassageBox(char docChar) {
        this.docChar = docChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length; i++) {
            System.out.print(docChar);
        }
        System.out.println();

        System.out.println(docChar + " " + s + " " + docChar);

        for (int i = 0; i < length; i++) {
            System.out.print(docChar);
        }
        System.out.println();
    }
}
