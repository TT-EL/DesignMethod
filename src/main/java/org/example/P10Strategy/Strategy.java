package org.example.P10Strategy;

/**
 * 定义猜拳策略的抽象接口
 */
public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
