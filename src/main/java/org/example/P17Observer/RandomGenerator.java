package org.example.P17Observer;

import java.util.Random;

/**
 * 随机数值生成器
 */
public class RandomGenerator extends NumberGenerator{

    private final Random random = new Random();

    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(100);
            notifyObservers();
        }
    }
}
