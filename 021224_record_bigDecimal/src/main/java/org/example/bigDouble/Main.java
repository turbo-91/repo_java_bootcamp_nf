package org.example.bigDouble;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
    double a = 0.1;
    double b = 0.2;
    System.out.println(a + b);

    BigDecimal c = new BigDecimal("0.12");
    BigDecimal d = new BigDecimal("0.23");
    System.out.println(c.add(d));
    System.out.println(c.subtract(d));
    System.out.println(c.multiply(d));
        System.out.println("ohne rounding mode " + c.divide(d)); // will fail!!
    System.out.println("mit rounding mode up " + c.divide(d, RoundingMode.HALF_UP));

    BigDecimal e = new BigDecimal("2.4");
    BigDecimal rounded = e.setScale(2, BigDecimal.ROUND_HALF_UP); // zwei Nachkommastellen, kaufmännisch ab x.5 nach oben gerundet
        System.out.println("rounded " + rounded);
        /**
         *BigDecimal.ROUND_HALF_UP = kaufmännisch ab 0.6 aufrunden
         */
    }
}