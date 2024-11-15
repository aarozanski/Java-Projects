package com.example.university;

import java.util.ArrayList;

public class Course {
    private String name; // Store the name of the course
    private int creditHours; // Store the credit hours for the course
    private List<Student> students; // List to store enrolled students

    // Constructor to initialize the Course with name and credit hours
    public Course(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        this.students = new ArrayList<>(); // Initialize the list of students
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Getter for course name
    public String getName() {
        return name;
    }

    // Getter for list of students
    public List<Student> getStudents() {
        return students;
    }
}

