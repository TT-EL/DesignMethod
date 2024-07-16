package org.example.P4FactoryMethod.idcard;

import org.example.P4FactoryMethod.framework.Product;

public class IDCard extends Product {

    private final String owner;

    private final int id;

    // 无法从外部包newIDCard实例，必须通过 IDFactory 创建实例
    public IDCard(String owner, int id) {
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.printf("[%d] %s: Use card!\n", id, owner);
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
