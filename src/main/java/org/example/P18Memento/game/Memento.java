package org.example.P18Memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {
    Integer money;

    List<String> fruits;

    public Memento(Integer money) {
        this.money = money;
        fruits = new ArrayList<>();
    }

    public Integer getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits () {
        return new ArrayList<>(fruits);
    }
}
