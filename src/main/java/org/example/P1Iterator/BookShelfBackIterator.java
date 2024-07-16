package org.example.P1Iterator;

public class BookShelfBackIterator implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfBackIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean haveNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        Object o = bookShelf.getBookAt(index);
        index--;
        return o;
    }
}
