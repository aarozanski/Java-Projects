package com.example.contact.management;

public class Contact {

// Declare the fields for names , emails and phone numbers

private String name;
private String email;
private String phoneNumber;

public String Contact (String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;

// Adding getters for the fields to allow access from outside the class
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}

}
