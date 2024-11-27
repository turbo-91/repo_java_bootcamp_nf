package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
@Test void zero_ShouldReturnZero() {
    //GIVEN
    int num = 0;
    int expected = 0;
    //WHEN
    int actualResult = Fibonacci.calculate(num);
    //THEN
    Assertions.assertEquals(expected, actualResult);

}

@Test void one_ShouldReturnOne() {
        //GIVEN
        int num = 1;
        int expected = 1;
        //WHEN
        int actualResult = Fibonacci.calculate(num);
        //THEN
        Assertions.assertEquals(expected, actualResult);

    }

    @Test void two_ShouldReturnOne    () {
        //GIVEN
        int num = 2;
        int expected = 1;
        //WHEN
        int actualResult = Fibonacci.calculate(num);
        //THEN
        Assertions.assertEquals(expected, actualResult);

    }

    @Test
    void ten_ShouldReturnFiftyFive() {
        // GIVEN
        int num = 10;
        int expected = 55;

        // WHEN
        int actualResult = Fibonacci.calculate(num);

        // THEN
        Assertions.assertEquals(expected, actualResult);
    }

}