package org.example.P5Singleton;

public class Main {
    public static void main(String[] args) {
        // 验证获取的两个实例是否相等
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if(instance1 == instance2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        // P47 练习5-2
        TicketMaker ticketMaker = TicketMaker.getInstance();
        System.out.println(ticketMaker.getNextTicketID());
        System.out.println(ticketMaker.getNextTicketID());
        System.out.println(ticketMaker.getNextTicketID());
    }

}
