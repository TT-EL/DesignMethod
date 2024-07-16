package org.example.P10Strategy;

import java.util.Random;
import java.util.Timer;

/**
 * 习题10-1 随机出手势的类
 */
public class RandomStrategy implements Strategy{

    private final Random random;

    public RandomStrategy() {
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        // 什么也不做
        return;
    }
}
