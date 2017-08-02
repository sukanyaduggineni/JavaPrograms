package com.meryemalay;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        mobilePhone.printMenu();
        boolean quit = false;
        int option=0;
	    while(!quit){
            System.out.println("Enter the option");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    mobilePhone.printMenu();
                    break;
                case 1:
                    showContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void showContact(){

    }

    public static void addContact(){
        System.out.println("Enter a contact name");
        String name = scanner.nextLine();
        System.out.println("Enter a contact phone number");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name, phoneNumber);
    }

    public static void removeContact(){

    }

    public static void modifyContact(){

    }

    public static void searchContact(){

    }
}
