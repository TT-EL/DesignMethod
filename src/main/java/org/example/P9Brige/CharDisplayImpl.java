package org.example.P9Brige;

/**
 * 习题9-3
 */
public class CharDisplayImpl extends DisplayImpl{

    private final char start;
    private final char c;
    private final char end;

    public CharDisplayImpl(char start, char c, char end) {
        this.start = start;
        this.c = c;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(c);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
