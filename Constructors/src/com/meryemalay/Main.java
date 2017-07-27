package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.withdraw(11000.0);
        account.setBalance(47000.0);
        account.withdraw(11000.0);
        account.deposit(45000.0);
        account.withdraw(90000.0);
    }
}
