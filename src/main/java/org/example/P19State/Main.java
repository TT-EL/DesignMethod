package org.example.P19State;

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("StateMethod");
        for (int i = 0; i < 24; i++) {
            frame.setClock(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
