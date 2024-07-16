package org.example.P9Brige;

import java.util.Random;

/**
 * 习题9-1
 */
public class RandomDisplay extends Display{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random random = new Random();
        int t = random.nextInt(times);

        open();
        for (int i = 0; i < t; i++) {
            print();
        }
        close();
    }
}
