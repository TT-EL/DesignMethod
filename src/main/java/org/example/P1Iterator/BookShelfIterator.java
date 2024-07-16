package org.example.P1Iterator;

public class BookShelfIterator implements Iterator {

    private final BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean haveNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Object book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
