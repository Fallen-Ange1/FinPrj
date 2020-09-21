package com.vebinar.entity;

import java.util.Objects;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private int balanceLeft;

    public BankAccount(int accountNumber, String accountName, int balanceLeft) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balanceLeft = balanceLeft;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalanceLeft() {
        return balanceLeft;
    }

    public void setBalanceLeft(int balanceLeft) {
        this.balanceLeft = balanceLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber &&
                balanceLeft == that.balanceLeft &&
                accountName.equals(that.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountName, balanceLeft);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balanceLeft=" + balanceLeft +
                '}';
    }
}
