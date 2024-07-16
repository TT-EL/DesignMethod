package org.example.P3TemplateMethod;

public abstract class AbstractDisplay {
    public abstract void open(); // 交给子类实现的抽象方法 (1) open

    public abstract void print(); // 交给子类实现的抽象方法 (2) print

    public abstract void close(); // 交给子类实现的抽象方法 (3) close

    public final void display() { // 本抽象类实现的方法，定义了处理流程
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
