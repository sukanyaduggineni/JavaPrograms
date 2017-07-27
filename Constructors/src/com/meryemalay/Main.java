package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        Account meryemAccount = new Account();
        meryemAccount.withdraw(11000.0);
        meryemAccount.setBalance(47000.0);
        meryemAccount.withdraw(11000.0);
        meryemAccount.deposit(45000.0);
        meryemAccount.withdraw(90000.0);

        Account osmanAccount = new Account("osman", "osman@osman.com","987654321");
        System.out.println(osmanAccount.getNumber() + " number, name " + osmanAccount.getCustomerName());

        System.out.println("--------------------");

        VipCustomer defaultVipCustomer = new VipCustomer();
        System.out.println("Name: "+ defaultVipCustomer.getName());

        VipCustomer michealVipCustomer = new VipCustomer("micheal", 33.00);
        System.out.println("Micheal email address: "+ michealVipCustomer.getEmailAddress());

        VipCustomer osmanVipCustomer = new VipCustomer("osman", 23000.00);
        System.out.println("Customer Name: "+ osmanVipCustomer.getName() + ", Customer Email: "+ osmanVipCustomer.getEmailAddress());
    }
}
