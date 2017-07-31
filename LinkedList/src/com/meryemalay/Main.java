package com.meryemalay;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //Java will actually allocate 4 bytes of memory for each integers.
        //8 bytes of memeory for each strings.
        Customer customer = new Customer("mery", 21.22);

        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(90.99);

        System.out.println("Balance for customer " + customer.getCustomerNume() + " is " + customer.getBalance());
        //Java was actually assigning the second customer class to point to the first class.

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": "+ intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": "+ intList.get(i));
        }

        //The linked list is an alternative to arrays and It is really useful in some situations.
        //Every element of linked list point next element. If you want to delete en element from the list. You should just change
        //
    }
}
