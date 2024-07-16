package org.example.P12Decorator;

public class SideBorder extends Border{

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    /**
     * 在这里，调用display（被装饰物）的getColumns方法可以得到列数
     * @return
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows(); // 左右边框的行数即为装饰物的行数
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
