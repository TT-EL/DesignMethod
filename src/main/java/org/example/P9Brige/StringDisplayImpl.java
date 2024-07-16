package org.example.P9Brige;

public class StringDisplayImpl extends DisplayImpl{

    private final String s;

    private final int width;

    public StringDisplayImpl(String s) {
        this.s = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


}
