package org.example.P10Strategy;

/**
 * 表示猜拳玩家的类，每个玩家有各自的猜拳策略
 */
public class Player {
    private String name;

    private Strategy strategy;

    private int wonCount;

    private int loseCount;

    private int gameCount;

    private int evenCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 求下一局要出的手势
     *
     * @return 下一局要出的手势
     */
    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        wonCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    /**
     * 平局
     */
    public void even() {
        evenCount++;
        gameCount++;
    }

    @Override
    public String toString() {

        return "[" + name + ":" +
                gameCount + " games, " +
                wonCount + " win, " +
                loseCount + " lose, " +
                evenCount + " even " +
                "]";
    }
}
