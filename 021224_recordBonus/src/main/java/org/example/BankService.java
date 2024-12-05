package org.example;

import java.math.BigDecimal;
import java.util.*;

public class BankService {
    Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankService that = (BankService) o;
        return Objects.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accounts);
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }

    public static String generateRandomString(int length) {
        String chars = "0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            randomString.append(chars.charAt(random.nextInt(chars.length())));
        }

        return randomString.toString();
    }

    public void openAccount(Client client) {
       int length = 15;
       String newNumber = generateRandomString(length);
       Account newAccount = new Account(newNumber, new BigDecimal("0.0"), client);
       accounts.add(newAccount);
    }

    public Account getAccountByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void transferMoney(BigDecimal amount, String accountNumberSender, String accountNumberReceiver) {
        Account accountSender = getAccountByAccountNumber(accountNumberSender);
        Account accountReceiver = getAccountByAccountNumber(accountNumberReceiver);
        BigDecimal newBalanceSender = accountSender.getBalance().subtract(amount);
        BigDecimal newBalanceReceiver = accountReceiver.getBalance().add(amount);
        accountSender.setBalance(newBalanceSender);
        accountReceiver.setBalance(newBalanceReceiver);
    }

}
