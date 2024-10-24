package com.example.school.management;

public class Person {

    // declare the fields of the class
    public String name;
    protected int age; // it can be accessed within the Person class or by classes that inherit from this class

    // constructor that initializes the fields
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getters for the fields to allow access from outside the class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

