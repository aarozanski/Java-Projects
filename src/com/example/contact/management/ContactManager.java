package com.example.contact.management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Contact {
    private final String name;
    private String phoneNumber;
    private final String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

public class ContactManager {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final HashMap<String, String> contactPhoneLookup = new HashMap<>();
    private final HashSet<String> uniqueEmailDomains = new HashSet<>();

    public void addContact(String name, String phoneNumber, String email) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact with this name already exists.");
                return;
            }
        }
        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.add(newContact);
        contactPhoneLookup.put(name.toLowerCase(), phoneNumber);
        uniqueEmailDomains.add(getDomainFromEmail(email));
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            contacts.forEach(System.out::println);
        }
    }

    public void removeContact(String name) {
        boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        if (removed) {
            contactPhoneLookup.remove(name.toLowerCase());
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void searchContact(String name) {
        String phoneNumber = contactPhoneLookup.get(name.toLowerCase());
        if (phoneNumber != null) {
            System.out.println("Phone Number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void updatePhoneNumber(String name, String newPhoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                contactPhoneLookup.put(name.toLowerCase(), newPhoneNumber);
                System.out.println("Phone number updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayUniqueDomains() {
        if (uniqueEmailDomains.isEmpty()) {
            System.out.println("No unique domains to display.");
        } else {
            System.out.println("Unique email domains:");
            uniqueEmailDomains.forEach(System.out::println);
        }
    }

    public void sortAndDisplayContacts() {
        contacts.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        displayContacts();
    }

    private String getDomainFromEmail(String email) {
        return email.substring(email.indexOf('@') + 1);
    }
}
