package org.example.P3TemplateMethod;

public class Main {
    public static void main(String[] args) {
        // 生成一个持有字符 'c' 的 CharDisplay 实例
        AbstractDisplay ad1 = new CharDisplay('c');

        // 生成一个持有字符串 "Hello World" 的 StringDisplay 实例
        AbstractDisplay ad2 = new StringDisplay("Hello World");

        ad1.display();

        ad2.display();
    }
}
