package com.example.contact.management;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactManager {


    // Constructor to initialize the contacts ArrayList
    public ContactManager() {
        this.contact = new ArrayList<>(); // Initialize the list
    }

    // Method to add a contact to the ArrayList
    public void addContact(ContactFunctions contact){
        this.contact.add(contact);
    }

    // Method to remove a contact to the ArrayList
    public void removeContact(ContactFunctions contact){
        this.contact.remove(contact);
    }

    HashMap <String, String> namePhone = new HashMap<String, String>();

    namePhone.put("Adinai", "3120000000");
    namePhone.put("Adinai", "3120000001");
    namePhone.put("Adinai", "3120000003");


}
