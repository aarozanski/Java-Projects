package com.example.contact.management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ContactManager {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final HashMap<String, String> contactPhoneLookup = new HashMap<>();
    private final HashSet<String> uniqueEmailDomains = new HashSet<>();

    // Add a new contact
    public void addContact(String name, String phoneNumber, String email) {
        // Check if the contact already exists by name
        if (contactPhoneLookup.containsKey(name.toLowerCase())) {
            System.out.println("A contact with this name already exists.");
            return;
        }

        // Create a new contact and add it to the list
        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.add(newContact);

        // Add the contact's phone number to the HashMap for easy lookup
        contactPhoneLookup.put(name.toLowerCase(), phoneNumber);

        // Extract the domain from the email and add it to the HashSet
        String domain = getDomainFromEmail(email);
        uniqueEmailDomains.add(domain);

        System.out.println("Contact added successfully!");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    // Search for a contact by name
    public void searchContact(String name) {
        // Look up the phone number by name in the HashMap
        String phoneNumber = contactPhoneLookup.get(name.toLowerCase());
        if (phoneNumber != null) {
            System.out.println("Phone Number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Remove a contact by name
    public void removeContact(String name) {
        boolean found = false;

        // Loop through the ArrayList to find the contact by name
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                // Remove the contact from the list and HashMap
                contacts.remove(i);
                contactPhoneLookup.remove(name.toLowerCase());
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Display all unique email domains
    public void displayUniqueDomains() {
        if (uniqueEmailDomains.isEmpty()) {
            System.out.println("No unique domains to display.");
        } else {
            System.out.println("Unique Email Domains:");
            for (String domain : uniqueEmailDomains) {
                System.out.println(domain);
            }
        }
    }

    // Helper method to extract domain from an email
    private String getDomainFromEmail(String email) {
        int atIndex = email.indexOf('@');
        return email.substring(atIndex + 1); // Get part after '@'
    }
}
