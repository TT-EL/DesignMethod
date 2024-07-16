package org.example.P2Adapter.BaseExtend;

public class Banner {
    private final String text;

    public Banner(String text) {
        this.text = text;
    }

    public void showWithParen() {
        System.out.println("(" + text + ")");
    }

    public void showWithAster() {
        System.out.println("*" + text + "*");
    }
}
