package org.example.P12Decorator;

/**
 * 装饰边框（Border）与被装饰物（Display）具有了相同的方法
 * <p>并且在Border抽象类内，还内置了一个Display对象，这个对象不仅是StringDisplay，也可以是Border的子类</p>
 */
public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
