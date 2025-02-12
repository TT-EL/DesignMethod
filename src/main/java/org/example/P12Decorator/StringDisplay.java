package org.example.P12Decorator;

public class StringDisplay extends Display {

    private final String text;

    public StringDisplay(String text) {
        this.text = text;
    }

    @Override
    public int getColumns() {
        return text.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return text;
        } else {
            return null;
        }
    }
}
