package org.example.P2Adapter.BaseDelegate;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Display");
        p.printWeak();
        p.printStrong();
    }
}
