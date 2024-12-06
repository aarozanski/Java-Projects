package com.example.Week_4.university;

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

