package com.vebinar.entity;

import java.util.Objects;

public class Payment {
    protected int paymentNumber;
    private String date;
    private int amount;

    public Payment(int paymentNumber, String date, int amount) {
        this.paymentNumber = paymentNumber;
        this.date = date;
        this.amount = amount;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentNumber == payment.paymentNumber &&
                amount == payment.amount &&
                date.equals(payment.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentNumber, date, amount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentNumber=" + paymentNumber +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}
