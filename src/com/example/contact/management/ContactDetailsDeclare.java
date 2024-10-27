package com.example.contact.management;

public class ContactDetailsDeclare {
// This is the first file I created to manipulate with Contact data
// Declare the fields for names , emails and phone numbers

private String name;
private String email;
private String phoneNumber;

public ContactDetailsDeclare(String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
}
// Adding getter methods for the fields to allow access from outside the class
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

// Adding setter methods to allow safe modification of fields
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayContacts() {
      System.out.println("Name: " + getName() + " - Email address: " + getEmail() + " - Phone number: " + getPhoneNumber());
    }

}

