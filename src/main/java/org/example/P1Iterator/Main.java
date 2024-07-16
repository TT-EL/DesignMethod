package org.example.P1Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Hello World"));
        bookShelf.appendBook(new Book("80s economy"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Hello World"));
        bookShelf.appendBook(new Book("80s economy"));
        bookShelf.appendBook(new Book("Bible"));

        Iterator iterator = bookShelf.iterator(); // 通过更改书架的iterator方法，可以更改正序/逆序迭代器
        while (iterator.haveNext()) {
            Book next = (Book) iterator.next();
            System.out.println(next.getName());
        }


    }
}
