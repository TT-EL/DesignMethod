package org.example.P5Singleton;

public class TicketMaker {

    private static final TicketMaker instance = new TicketMaker(1000);
    private int ticket;

    private TicketMaker(int ticket) {
        this.ticket = ticket;
    }

    public static TicketMaker getInstance() {
        return instance;
    }

    // 添加 synchronized 关键字，使其在多线程情况下也能正常输出
    public synchronized int getNextTicketID() {
        return ticket++;
    }
}
