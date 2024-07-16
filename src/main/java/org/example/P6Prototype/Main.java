package org.example.P6Prototype;

import org.example.P6Prototype.framework.Manager;
import org.example.P6Prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 实例化 Manager
        Manager manager = new Manager();

        // 实例化继承了Product接口的类
        UnderlinePen underlinePen = new UnderlinePen('~');
        MassageBox massageBox = new MassageBox('#');
        MassageBox massageBox2 = new MassageBox('/');
        manager.register("strong message", underlinePen); // 注册到manager中
        manager.register("warning box", massageBox); // 注册到manager中
        manager.register("slash box", massageBox2); // 注册到manager中

        // 调用 use 方法
        Product p1 = manager.create("strong message");
        p1.use("Hello, World.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World.");

    }
}
