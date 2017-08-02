package com.meryemalay;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contacts> listOfContacts = new ArrayList<>();

    public void printMenu(){
        System.out.println("0 - Print Menu");
        System.out.println("1 - Show Contacts");
        System.out.println("2 - Add a contact");
        System.out.println("3 - Remove a contact");
        System.out.println("4 - Modify a contact");
        System.out.println("5 - Search a contact");
        System.out.println("6 - Quit");
    }

    public boolean addContact(Contacts contact){
        if(findContact(contact) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        this.listOfContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.listOfContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() +" was replaced with "+ newContact.getName());
        return true;
    }

    private int findContact(Contacts contact){
        return this.listOfContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            Contacts contact = this.listOfContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }


    public boolean searchContact(String name, String phoneNumber){
        return false;
    }

}
