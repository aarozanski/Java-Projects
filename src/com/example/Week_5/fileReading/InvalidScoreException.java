package com.example.fileReading;

// Custom exception for invalid scores
public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
