package org.example.P10Strategy;

public class Main {
    public static void main(String[] args) {
        // 新建两位选手，让其进行10000局比赛
        int seed1 = 316;
        int seed2 = 25;

        Player p1 = new Player("Tom", new WinningStrategy(seed1));
        Player p2 = new Player("Cook", new ProbStrategy(seed2));

        // fight(p1, p2);


        // 习题9-1
        Player p3 = new Player("Jay", new RandomStrategy());
        fight(p2, p3);
    }

    public static void fight(Player p1, Player p2) {
        for (int i = 0; i < 10000; i++) {
            Hand hand1 = p1.nextHand();
            Hand hand2 = p2.nextHand();

            if(hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + p1);
                p1.win();
                p2.lose();
            } else if(hand2.isStrongerThan(hand1)) {
                System.out.println("Winner: " + p2);
                p2.win();
                p1.lose();
            } else {
                System.out.println("Even");
                p1.even();
                p2.even();
            }

            System.out.println("Total result:");
            System.out.println(p1);
            System.out.println(p2);
        }
    }
}
