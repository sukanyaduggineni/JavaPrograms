package com.meryemalay;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //constructor: esentially initialize the object that you are creating
    public Account(){
        this(12345, 100.00, "Default Name", "xyz@gmail.com","123456789");
        System.out.println("Empty constructor called");
    }

    public Account(int number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this(99999, 200.00,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " +this.balance + " available. Withdrawel not processed." );
        }else{
            this.balance -=withdrawAmount;
            System.out.println("Withdrawal of "+ withdrawAmount +" processed. Remaining balance = "+ this.balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
