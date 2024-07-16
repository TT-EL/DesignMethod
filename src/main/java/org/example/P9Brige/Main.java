package org.example.P9Brige;

public class Main {
    public static void main(String[] args) {
        // 保存 Display 实例，Display不是抽象类，可以实例化
        Display d1 = new Display(new StringDisplayImpl("Hello World"));

        // 保存子类实例，但不拥有子类的扩展功能
        Display d2 = new CountDisplay(new StringDisplayImpl("你好，世界"));

        // 拥有新功能的子类的实例化对象
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hi"));

        d1.display();
        d2.display();
        d3.display();

        // d1.multipleDisplay(5); // 非法
        // d2.multipleDisplay(5); // 非法
        d3.multipleDisplay(5);

        // 习题9-1
        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("你好，世界"));
        randomDisplay.randomDisplay(5);

        // 习题9-2
        Display fileDisplay = new Display(new FileDisplayImpl("/Users/yson/code/DesignMethod/src/main/java/org/example/P9Brige/test.txt"));
        fileDisplay.display();

        /**
         * 习题9-3
         * 在功能层次新增继承CountDisplay的类，新增increaseDisplay功能
         * 在实现层次新增CharDisplayImpl类
         */
        IncreaseDisplay increaseDisplay = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 5);
        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDisplayImpl('｜', '#', '-'), 10);
        increaseDisplay.increaseDisplay();
        increaseDisplay2.increaseDisplay();


    }
}
