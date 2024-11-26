package neuefische;

import java.util.Arrays;

public class library {
    private Book[] books;

    @Override
    public String toString() {
        return "library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
