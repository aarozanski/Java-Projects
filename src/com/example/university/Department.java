package com.example.university;
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Professor> professors;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
}