package org.example.P10Strategy;

/**
 * 表示出拳手势
 */
public class Hand {
    public static final int HAND_VALUE_STO = 0; // 表示石头的值
    public static final int HAND_VALUE_SEO = 1; // 表示剪刀的值
    public static final int HAND_VALUE_PAA = 2; // 表示布的值

    public static final Hand[] hand = {
            new Hand(HAND_VALUE_STO),
            new Hand(HAND_VALUE_SEO),
            new Hand(HAND_VALUE_PAA),
    };

    private static final String[] name = {"石头", "剪刀", "布"};

    private final int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     * 计算this和hand的比较结果
     *
     * @param hand 传入的手势
     * @return 0:平手 1:this > hand  -1:this < hand
     */
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
