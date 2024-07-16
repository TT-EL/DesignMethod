package org.example.P9Brige;

/**
 * 类的功能层次的最上层
 */
public class Display {

    /**
     * 连接功能层次和实现层次的桥梁
     */
    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 声明为final，不允许子类修改
     */
    public final void display() {
        open();
        print();
        close();
    }
}
