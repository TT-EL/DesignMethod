package org.example.P20Flyweight;

import java.util.HashMap;

/**
 * 生成 BigChar 的工厂类
 */
public class BigCharFactory {

    private static final BigCharFactory instance = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return instance;
    }

    // 管理已生成的BigChar实例
    private final HashMap<Character, BigChar> pool = new HashMap<>();

    // 生成（共享）BigChar 实例
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put(charName, bigChar);
        }

        return bigChar;
    }
}
