package org.example.P8AbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{

    // Link 和 Tray 组合形成的集合
    protected List<Item> trays = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    // 用于增加 Item 元素
    public void add(Item item) {
        trays.add(item);
    }

    // Tray 类也没有实现父类的抽象方法，所以Tray类也是抽象类
}
