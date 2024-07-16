package org.example.P4FactoryMethod;

import org.example.P4FactoryMethod.framework.Factory;
import org.example.P4FactoryMethod.framework.Product;
import org.example.P4FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Tom");
        Product card2 = factory.create("Tim");
        Product card3 = factory.create("Cook");

        card1.use();
        card2.use();
        card3.use();
    }
}
