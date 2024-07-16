package org.example.P20Flyweight;

public class Main {
    public static BigString[] bigStrings = new BigString[1000];
    public static void main(String[] args) {
//        BigString bigString = new BigString("12343", true);
//        bigString.print();
//        printMemoryUsed();

        // 测试共享和非共享时
        testAllocation(true);
        testAllocation(false);

    }

    public static void testAllocation(boolean shared) {
        for (int i = 0; i < 1000; i++) {
            bigStrings[i] = new BigString("12343", shared);
        }
        printMemoryUsed(shared);
    }

    public static void printMemoryUsed(boolean shared) {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(shared + " Used memo: " + used);
    }
}
