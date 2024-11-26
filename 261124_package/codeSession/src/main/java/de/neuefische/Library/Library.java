package de.neuefische.Library;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    @Override
    public String toString() {
        return "library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
