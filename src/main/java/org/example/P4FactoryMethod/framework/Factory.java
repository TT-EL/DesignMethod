package org.example.P4FactoryMethod.framework;

public abstract class Factory {

    // 声明了用于 生成产品 的抽象方法，交给子类实现
    public abstract Product createProduct(String owner);

    // 声明了用于 注册产品 的抽象方法，交给子类实现
    public abstract void registerProduct(Product p);

    // 定义工厂的职责：调用create方法生成 Product（抽象类） 实例
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
