package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Math.floor;

public class BookCollection {
    private String name;
    private List<Book> books;

    BookCollection(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getStars() {

        ListIterator<Book> iterator = books.listIterator();
        int average_stars = 0;

        while(iterator.hasNext()) {
            Book data = iterator.next();
            average_stars += data.getStars();
        }

        return average_stars / getCollectionSize();
    }

    private int getCollectionSize() {
        return books.size();
    }
}
