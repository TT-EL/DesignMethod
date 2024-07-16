package org.example.P12Decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, World");
        b1.show();
        Display b2 = new SideBorder(b1, '6');
        b2.show();
        Display b3 = new FullBorder(b2);
        b3.show();

        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello, World")
                                        ), '*'
                                )

                        )
                ), '/'
        );
        b4.show();

        // 习题12-2
        MultipleStringDisplay multipleStringDisplay = new MultipleStringDisplay();
        multipleStringDisplay.add("Good morning");
        multipleStringDisplay.add("Hi");
        multipleStringDisplay.add("Good evening!");

        Display d1 = new SideBorder(multipleStringDisplay, '#');
        d1.show();

        Display d2 = new FullBorder(multipleStringDisplay);
        d2.show();
    }
}
