package com.meryemalay;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone("123456");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

	    while(!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contect added: name = " + name + ", phone = " + phoneNumber );
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n"+
                           "2 - to add a new contacts\n" +
                           "3 - to update existing an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of avaible actions.");
        System.out.println("Choose your action: ");
    }

    private static void removeContact(){

    }

    private static void updateContact(){

    }

    private static void queryContact(){

    }
}
