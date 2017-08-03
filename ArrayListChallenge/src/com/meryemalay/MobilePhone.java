package com.meryemalay;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;

    ArrayList<Contact> listOfContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addContact(Contact contact){
        if(findContact(contact) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        this.listOfContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.listOfContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() +" was replaced with "+ newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.listOfContacts.remove(contact);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact){
        return this.listOfContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            Contact contact = this.listOfContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }


    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int foundPosition = findContact(name);
        if(foundPosition >= 0){
            return this.listOfContacts.get(foundPosition);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                        this.listOfContacts.get(i).getName() + " -> " +
                        this.listOfContacts.get(i).getPhoneNumber());
        }
    }
}
