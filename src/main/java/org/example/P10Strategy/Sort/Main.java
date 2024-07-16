package org.example.P10Strategy.Sort;

public class Main {
    public static void main(String[] args) {
        String[] data = {
                "Tom",
                "Cat",
                "Jerry",
                "Dog",
        };

        SortAndPrint<String> sortAndPrint = new SortAndPrint<>(new SelectSort<>(), data);
        sortAndPrint.execute();

        Integer[] nums = {1, 4, 2, 34, 3, -1};
        SortAndPrint<Integer> sortAndPrint1 = new SortAndPrint<>(new QuickSort<>(), nums);
        sortAndPrint1.execute();
    }
}
