package com.example.school.management;

import java.util.List;

public class Student extends Person {

    private int studentID;
    private String[] enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentID, String[] enrolledCourses, double tuition) {
        super(name, age);
    }
    // overloaded method to enroll with an array of courses
    public void enrollCourses(String [] courses) {
        for (String course : courses) {
            enrolledCourses.add(course); // adds each course from the array to the list
        }
        updateTuition(); // update tuition whenever new courses are added
    }
    // overloaded method to enroll with a single course
    public void enrollCourses(String course) {
        enrolledCourses.add(course); // adds the single course to the list
        updateTuition(); // update tuition whenever a new course is added
    }
    // public method to update tuition based on enrolled courses
    public void updateTuition() {
        updateTuition(enrolledCourses.add() * 500);
    }

    public double getTuition() {
        return tuition;
    }

}
