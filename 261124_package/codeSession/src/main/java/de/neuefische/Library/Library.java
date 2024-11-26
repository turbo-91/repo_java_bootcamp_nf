package de.neuefische.Library;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.deepEquals(books, library.books);
    }

    public void addBook(Book newBook) {
        // Check if the book already exists in the library
        for (Book book : books) {
            if (book.equals(newBook)) {
                System.out.println("The book is already in the library.");
                return;
            }
        }

        // Create a new array with one extra slot
        Book[] updatedBooks = new Book[books.length + 1];

        // Manually copy elements from the old array to the new array
        for (int i = 0; i < books.length; i++) {
            updatedBooks[i] = books[i];
        }

        // Add the new book to the last position of the new array
        updatedBooks[books.length] = newBook;

        // Update the books array reference
        books = updatedBooks;

        System.out.println("Book added: " + newBook);
    }

    public void deleteBook(Book bookToRemove) {
        // Check if the book exists in the library
        boolean found = false;
        for (Book book : books) {
            if (book.equals(bookToRemove)) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The book is not found in the library.");
            return;
        }

        // Create a new array with one less slot
        Book[] updatedBooks = new Book[books.length - 1];

        // Copy all books except the one to remove
        int index = 0;
        for (Book book : books) {
            if (!book.equals(bookToRemove)) {
                updatedBooks[index++] = book;
            }
        }

        // Update the books array reference
        books = updatedBooks;

        System.out.println("Book removed: " + bookToRemove);
    }



}
