package org.example.bookRecord;

public class Main {
    public static void main(String[] args) {

        BookRecord bookRecord = new BookRecord("1", "Test", 13.99);
        bookRecord.ISBN(); // Getter beim Record OHNE Get
        bookRecord.title();
        bookRecord.price();
        // Setter beim Record NICHT vorhanden
        System.out.println(bookRecord);

        bookRecord = new BookRecord("2", "Testico", 8.99);
        System.out.println(bookRecord);

        // Anwendung Wither (statt) setter
        bookRecord = bookRecord.withPrice(5.99).withTitle("your mum").withISBN("3");
        System.out.println(bookRecord);
    }
}