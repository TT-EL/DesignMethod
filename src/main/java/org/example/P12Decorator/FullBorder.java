package org.example.P12Decorator;

public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1; // 字符数为被装饰物的字符数加上两侧边框的字符数
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1; // 行数为字符串行数加上 上下两行
    }

    @Override
    public String getRowText(int row) {
        // 顶行和未行对应的上下边框
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char c, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(c);
        }

        return builder.toString();
    }
}
