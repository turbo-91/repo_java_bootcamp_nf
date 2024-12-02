package org.example;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class BankService {
private Set<Account> accounts;

    public BankService(Set<Account> accounts) {
        this.accounts = accounts;
    }

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

    private String generateAccountNumber() {
        int randomNum = ThreadLocalRandom.current().nextInt(100000, 999999);
        return "ACC" + randomNum;
    }

    public String newAccount(Client customer) {
        String accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber, BigDecimal.ZERO, customer);
        accounts.add(newAccount);
        return accountNumber;
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public String bankTransfer(String accountNumber1, String accountNumber2, BigDecimal amountToTransfer) {
        if (amountToTransfer.compareTo(BigDecimal.ZERO) <= 0) {
            return "Transfer amount must be greater than zero.";
        }
        Account account1 = findAccountByNumber(accountNumber1);
        Account account2 = findAccountByNumber(accountNumber2);
        if (account1.getBalance().compareTo(amountToTransfer) < 0) {
            return "Insufficient balance in the source account.";
        }
        accounts.remove(account1);
        accounts.remove(account2);

        Account updatedAccount1 = account1.withdrawMoney(amountToTransfer);
        Account updatedAccount2 = account2.depositMoney(amountToTransfer);

        accounts.add(updatedAccount1);
        accounts.add(updatedAccount2);

        return "Transfer successful. New balances: " +
                accountNumber1 + " = " + updatedAccount1.getBalance() + ", " +
                accountNumber2 + " = " + updatedAccount2.getBalance();
    };

}
