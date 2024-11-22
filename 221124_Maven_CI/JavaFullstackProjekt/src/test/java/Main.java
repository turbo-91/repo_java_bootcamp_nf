
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;
package org.example;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World with VIM!");
        String asciiArt = FigletFont.convertOneLine("Hello World with jfiglet!");
        System.out.println(asciiArt);
    }
}
