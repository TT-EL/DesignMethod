package org.example.P8AbstractFactory.factory;

// 抽象的零件：元素，作为Link和Tray类的父类
public abstract class Item {

    protected String caption; // 表示元素的标题(包内和子类可访问)

    /**
     * HTML元素
     * @param caption 元素的标题
     */
    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML(); // 抽象方法，返回HTML内容
}
