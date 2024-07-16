package org.example.P17Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomGenerator();
        // 生成两个观察者实例
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        // 注册观察者
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);

        numberGenerator.execute();
    }
}
