package org.example;

public record Client(String firstName, String lastName, int customerNr) {

    public Client withFirstName(String firstName) {
        return new Client(firstName, lastName, customerNr);
    }
    public Client withLastName(String lastName) {
        return new Client(firstName, lastName, customerNr);
    }
    public Client withCustomerNr(int customerNr) {
        return new Client(firstName, lastName, customerNr);
    }
}
