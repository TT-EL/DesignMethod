package org.example.P10Strategy;

import java.util.Random;

/**
 * WinningStrategy策略是：
 * 上一局赢了，则下一局继续出相同的手势
 * 上一局输了，则下一局随机出一个手势
 */
public class WinningStrategy implements Strategy {

    private final Random random;

    private boolean won = false; // 记录上一局赢了没

    private Hand preHand; // 记录上一局的手势

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        // 上局没赢
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }

        // 赢了就继续出和上一局相同的手势
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
