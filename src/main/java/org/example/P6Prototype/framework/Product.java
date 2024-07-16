package org.example.P6Prototype.framework;

public abstract class Product implements Cloneable{
    public abstract void use(String s);

    // 这里做的改动是习题6-1的内容
    // 将Product从接口改为抽象类，此方法作为实现的默认方法
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
