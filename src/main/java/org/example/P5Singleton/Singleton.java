package org.example.P5Singleton;

public class Singleton {

    // 私有且静态
    private static final Singleton instance = new Singleton();

    // 私有构造函数
    private Singleton() {
        System.out.println("Generate a singleton");
    }

    // 公开的获取实例函数
    public static Singleton getInstance() {
        return instance;
    }
}
