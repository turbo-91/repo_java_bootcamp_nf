package org.example.bookRecord;

public record BookRecord(
        String ISBN, String title, double price) {

    // Withers (= eine Art Setter für records)
    public BookRecord withPrice(double price) {
        return new BookRecord(ISBN, title, price);
    }
    public BookRecord withTitle(String title) {
        return new BookRecord(ISBN, title, price);
    }

    public BookRecord withISBN(String ISBN) {
        return new BookRecord(ISBN, title, price);
    }

}
