package org.example.P9Brige;

/**
 * 类的功能层次，继承了Display类，新增了multipleDisplay功能
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multipleDisplay(int times) {
        open();

        for (int i = 0; i < times; i++) {
            print();
        }

        close();
    }
}
