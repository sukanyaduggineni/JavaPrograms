package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("London Bank");

        bank.addNewBranch("Woodford");
        bank.addCustomer("Woodford", "Osi", 50.05);
        bank.addCustomer("Woodford", "Tosi", 150.05);
        bank.addCustomer("Woodford", "Yosi", 560.05);

        bank.addNewBranch("Green");
        bank.addCustomer("Green", "Bob", 150.35);

        bank.addCustomer("Woodford", "Osi", 33.22);
        bank.addCustomer("Woodford", "Tosi", 33.22);
        bank.addCustomer("Woodford", "Yosi", 33.22);

        bank.listCustomer("Woodford", true);
        bank.listCustomer("Green", true);

        bank.addNewBranch("Park");
        if(!bank.addCustomer("Park" ,"Tenten", 6.33)){
            System.out.println("Error Park branch does not exist");
        }

        if(!bank.addCustomerTransaction("Woodford", "roni", 33.11)){
            System.out.println("Customer does not exist");
        }
    }
}
