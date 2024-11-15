package com.example.university;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
