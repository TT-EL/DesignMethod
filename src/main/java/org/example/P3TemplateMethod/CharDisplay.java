package org.example.P3TemplateMethod;

public class CharDisplay extends AbstractDisplay{

    private char ch; // 需要显示的字符

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        // 打开时输出
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 关闭时输出
        System.out.println(">>");
    }
}
