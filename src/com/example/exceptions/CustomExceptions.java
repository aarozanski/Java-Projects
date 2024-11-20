package com.example.exceptions;

// CustomExceptions.java
public class CustomExceptions {

    // Custom exception for invalid age
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid name
    public static class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    // Custom exception for course full
    public static class CourseFullException extends Exception {
        public CourseFullException(String message) {
            super(message);
        }
    }
}

