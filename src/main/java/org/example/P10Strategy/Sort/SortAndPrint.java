package org.example.P10Strategy.Sort;

public class SortAndPrint<T> {

    private final Sorter<T> sorter;

    Comparable<T>[] data;

    public SortAndPrint(Sorter<T> sorter, Comparable<T>[] data) {
        this.sorter = sorter;
        this.data = data;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    public void print() {
        for (Comparable<T> c :data) {
            System.out.print(c + ", ");
        }

        System.out.println();
    }
}
