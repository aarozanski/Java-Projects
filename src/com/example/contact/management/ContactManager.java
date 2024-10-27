package com.example.contact.management;

import java.util.ArrayList;

public class ContactManager {

    private final ArrayList<ContactFunctions> contact;

    // Constructor to initialize the contacts ArrayList
    public ContactManager() {
        this.contact = new ArrayList<>(); // Initialize the list
    }

    // Method to add a contact to the ArrayList
    public void addContact(ContactFunctions contact){
        this.contact.add(contact);
    }
}
