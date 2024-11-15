package com.example.university;

import java.util.ArrayList;

public class Course {
    private String name;
    private int creditHours;
    private ArrayList<Student> students;

    public Course(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.getCourses().add(this);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
