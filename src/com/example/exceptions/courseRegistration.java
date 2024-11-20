package com.example.exceptions;

import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Student> students;
    private static final int MAX_STUDENTS = 5;

    public CourseRegistration() {
        this.students = new ArrayList<>();
    }

    // Register a student
    public void registerStudent(Student student) throws CourseFullException {
        if (students.size() >= MAX_STUDENTS) {
            throw new CourseFullException("The course is already full. Maximum 5 students allowed.");
        }
        students.add(student);
        System.out.println("Student registered successfully: " + student.getName());
    }

    // Unregister a student
    public void unregisterStudent(String name) throws Exception {
        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (!removed) {
            throw new Exception("Student with name '" + name + "' is not registered in the course.");
        }
        System.out.println("Student unregistered successfully: " + name);
    }

    // List all registered students
    public void listStudents() {
        System.out.println("Registered Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName() + ", Age: " + student.getAge());
        }
    }
}

