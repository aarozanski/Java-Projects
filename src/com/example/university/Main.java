package com.example.university;

public class Main {
    public static void main(String[] args) {
        Department cs = new Department("Computer Science");
        Professor drSmith = new Professor("Dr. John Smith");
        cs.addProfessor(drSmith);

        Student student1 = new Student("Jane Doe");
        Course course1 = new Course("Data Structures");
        course1.enrollStudent(student1);

        System.out.println("Course: " + course1.getName());
        System.out.println("Department: " + cs.getName());
        System.out.println("Professor: " + drSmith.getName());
    }
}
