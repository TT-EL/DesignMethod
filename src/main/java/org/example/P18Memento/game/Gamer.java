package org.example.P18Memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;

    private List<String> fruits = new ArrayList<>();

    private final Random random = new Random();

    private final static String[] fruitInstance = {
            "橙子", "香蕉", "苹果", "柿子",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    /**
     * 模拟投骰子进行游戏
     */
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Money increase.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Money decrease.");
        } else if (dice == 6) {
            String fruit = getFruit();
            System.out.println("Gain a fruit " + fruit);
            fruits.add(fruit);
        } else {
            System.out.println("Nothing happen");
        }
    }

    /**
     * 创建快照
     *
     * @return 快照对象
     */
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String f : fruits) {
            if (f.startsWith("好吃的")) {
                memento.addFruit(f);
            }
        }

        return memento;
    }

    /**
     * 恢复快照状态
     *
     * @param memento 快照
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    /**
     * 随机生成水果实例
     *
     * @return 水果实例（String类型）
     */
    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }

        return prefix + fruitInstance[random.nextInt(fruitInstance.length)];
    }
}
