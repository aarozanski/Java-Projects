package com.example.contact.management;

import java.util.ArrayList;

public class ContactManager {

    private final ArrayList<ContactFunctions> contact;

    // Constructor to initialize the contacts ArrayList
    public ContactManager() {
        this.contact = new ArrayList<>(); // Initialize the list
    }


    public void addContact(ContactFunctions contact){
        this.contact.add(contact);
    }
}
