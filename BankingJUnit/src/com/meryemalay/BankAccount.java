package com.meryemalay;

public class BankAccount  {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller
    // It'is false if the cutomer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount, boolean branch){
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
