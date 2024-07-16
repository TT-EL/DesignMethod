package org.example.P9Brige;

/**
 * 习题9-3
 */
public class IncreaseDisplay extends CountDisplay{

    private final int increase;

    public IncreaseDisplay(DisplayImpl impl, int increase) {
        super(impl);
        this.increase = increase;
    }

    public void increaseDisplay() {
        for (int i = 0; i < increase; i++) {
            multipleDisplay(i);
        }
    }
}
