package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Client testClient1 = new Client("Torben", "Jost", 123);
        Client testClient2 = new Client("David", "Jost", 456);

        Account testAccount1 = new Account("123tor", new BigDecimal("1256.23"),testClient1);
        Account testAccount2 = new Account("456dav", new BigDecimal("400.00"),testClient2);

        System.out.println( testAccount1.getClient().FirstName() + "'s balance before Deposit:");
        System.out.println( testAccount1.getBalance());
        testAccount1.depositMoney(new BigDecimal("200.00"), testAccount1.getBalance());
        System.out.println( testAccount1.getClient().FirstName() + "'s balance after Deposit:");
        System.out.println( testAccount1.getBalance());


    }
}