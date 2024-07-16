package org.example.P8AbstractFactory.factory;

public abstract class Link extends Item{

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

    // 这里没有实现父类的抽象方法，所以Link也是抽象类
}
