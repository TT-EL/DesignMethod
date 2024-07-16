package org.example.P14Chain;

public class Main {
    public static void main(String[] args) {
        // 生成一系列解决方案
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 形成责任链
        // 这里setNext(Support s) 之后的返回值为设置的那个support，所以可以继续接着设置Next
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 制造大量问题
        for (int i = 0; i < 500; i+=33) {
            alice.support(new Trouble(i));
        }
    }
}
