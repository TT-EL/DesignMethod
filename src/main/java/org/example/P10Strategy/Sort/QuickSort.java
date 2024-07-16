package org.example.P10Strategy.Sort;

public class QuickSort<T> implements Sorter<T> {
    @Override
    public void sort(Comparable<T>[] data) {
        quick(data, 0, data.length - 1);
    }

    private void quick(Comparable<T>[] data, int start, int end) {
        if (start < end) {
            int mid = partition(data, start, end);
            quick(data, start, mid - 1);
            quick(data, mid + 1, end);
        }
    }

    private int partition(Comparable<T>[] data, int start, int end) {
        T mid = (T) data[start];
        while (start < end) {
            while (start < end && data[end].compareTo(mid) >= 0) {
                end--;
            }
            data[start] = data[end];

            while (start < end && data[start].compareTo(mid) <= 0) {
                start++;
            }
            data[end] = data[start];
        }

        data[start] = (Comparable<T>) mid;

        return start;
    }
}
