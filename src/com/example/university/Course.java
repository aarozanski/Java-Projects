package com.example.university;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Getter method
    public String getName() {
        return name;
    }
}