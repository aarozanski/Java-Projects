package com.example.university;

public abstract class ProfessorAbstract {
    private String name; // Store the name of the professor

    // Constructor to set the name of the professor
    public ProfessorAbstract(String name) {
        this.name = name;
    }

    // Getter for professor's name
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses to specify how they teach
    public abstract void teachCourse();
}
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

