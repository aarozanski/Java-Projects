package com.example.university;

public class FullTimeProfessor extends Professor {
    // Constructor that passes the name to the superclass
    public FullTimeProfessor(String name) {
        super(name);
    }

    // Implementation of teaching behavior specific to full-time professors
    @Override
    public void teachCourse() {
        System.out.println(getName() + " is teaching full-time.");
    }
}

