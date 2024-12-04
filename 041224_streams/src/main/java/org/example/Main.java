package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(49, 6, 73, 32, 41, 18, 44, 63, 37, 100));

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("--- even numbers ---");
        System.out.println(evenNumbers);

        List<Integer> evenNumbersTimesTwo = evenNumbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("--- even numbers * 2 ---");
        System.out.println(evenNumbersTimesTwo);

        List<Integer> numbersAscending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("--- numbers ascending ---");
        System.out.println(numbersAscending);

        Integer numbersReduced = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("--- even numbers * 2 ascending reduced ---");
        System.out.println(numbersReduced);

        System.out.println("--- printing each number ---");

        numbers.stream()
                .forEach(number -> System.out.println(number));

        // Step 6 from ChatGPT

        List<Object> allProcessedResults = new ArrayList<>();
        allProcessedResults.add("Filtered Even Numbers: " + evenNumbers);
        allProcessedResults.add("Doubled Numbers: " + evenNumbersTimesTwo);
        allProcessedResults.add("Sorted Doubled Numbers: " + numbersAscending);
        allProcessedResults.add("Reduced Sum: " + numbersReduced);

        System.out.println("--- all processed numbers ---");
        allProcessedResults.forEach(System.out::println);









        // RESEARCH

        // Find a Stream method that has not been mentioned in the lecture or the handout. What can it be used for?

        // takeWhile: The takeWhile method processes elements of a stream until a condition is no longer true, and then stops.
        // Use Case: Useful for working with sorted streams where you want to take only the initial matching subset without
        // processing the entire stream.

        // --------------

        // The code 'Stream.of("Anton", "Berta", "Cäsar").peek(name -> System.out.println(name))' does not produce any output.
        // Can you find out why?

        // The peek method is an intermediate operation, meaning it only sets up a step in the pipeline but doesn’t execute anything by itself. Streams require a terminal operation to trigger execution.
        //
        // Solution: Add a terminal operation like forEach to trigger the pipeline.

        // ---------------

        // Name one argument for Streams compared to traditional loops.

        // Traditional loops (e.g., for or while) focus on how to iterate and process elements, requiring manual management of indices, temporary variables, or additional data structures.
        // Streams allow you to focus on what you want to do (e.g., filter, map, reduce), making the code more readable and concise.


    }
}