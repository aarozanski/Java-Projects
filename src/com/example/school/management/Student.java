package com.example.school.management;

public class Student extends Person {

    private int studentID;
    private String[] enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentID, String[] enrolledCourses, double tuition) {
        super(name, age);
    }

    public void enrollCourses(String [] courses) {
        for (String course : courses) {
           enrolledCourses.add(course);
        }

    }

    public void enrollCourses(String course) {
        enrolledCourses.add(course);
    }

}
