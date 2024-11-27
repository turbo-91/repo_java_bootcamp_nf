package org.example;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int result1 = Fibonacci.calculate(n1);
        int n2 = 13;
        int result2 = Fibonacci.calculate(n2);


        System.out.println("The Fibonacci number for n = " + n1 + " is " + result1);
        System.out.println("The Fibonacci number for n = " + n2 + " is " + result2);
    }
}