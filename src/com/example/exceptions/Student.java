package com.example.exceptions;

// Student Class
public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) throws InvalidNameException, InvalidAgeException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty.");
        }
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Age must be between 18 and 60.");
        }
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

