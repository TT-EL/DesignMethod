package org.example.P10Strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {

    private final Random random;

    private int preHandValue = 0; // 上一局出的手势

    private int currentHandValue = 0; // 这一局出的手势

    private int[][] history = {
            {1, 1, 1,},
            {1, 1, 1,},
            {1, 1, 1,},
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        // 基于当前出的手势的过去的胜利次数生成一个 0-胜利数的随机数
        int bet = random.nextInt(getSum(currentHandValue)); // 随机数

        // 下一局要出的手势
        int handValue = 0;

        if (bet < history[currentHandValue][0]) {
            handValue = 0; // 随机数落在 0<= bet <history[c][0]这个区间
        } else if (bet < history[currentHandValue][1]) {
            handValue = 1; // 随机数落在 history[c][0]<= bet <history[c][1]这个区间
        } else {
            handValue = 2; // 随机数落在 history[c][1]<= bet <sum(history[c][])这个区间
        }

        preHandValue = currentHandValue;
        currentHandValue = handValue;

        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }

        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            // 当前的手势获胜了
            history[preHandValue][currentHandValue]++;
        } else { // 没获胜
            history[preHandValue][(currentHandValue + 1) % 3]++; //如果出XX手势可以获胜
            history[preHandValue][(currentHandValue + 2) % 3]++; //如果出XX手势可以获胜
        }
    }
}
