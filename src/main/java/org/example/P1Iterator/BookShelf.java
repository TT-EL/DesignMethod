package org.example.P1Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    private final List<Book> books;

    private int last;

    public BookShelf(int length) {
        this.books = new ArrayList<>();
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfBackIterator(this); // BookShelfIterator 实现了Iterator接口
    }
}
