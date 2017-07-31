package com.meryemalay;

public class Customer {

    private String customerNume;
    private double balance;

    public Customer(String customerNume, double balance) {
        this.customerNume = customerNume;
        this.balance = balance;
    }

    public String getCustomerNume() {
        return customerNume;
    }

    public void setCustomerNume(String customerNume) {
        this.customerNume = customerNume;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
