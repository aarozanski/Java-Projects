package com.example.school.management;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private final List<String> enrolledCourses;  // Use List instead of array for dynamic additions
    private double tuition;

    public Student(String name, int age, int studentID, String[] enrolledCoursesArray, double tuition) {
        super(name, age);
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
        for (String course : enrolledCoursesArray) {
            this.enrolledCourses.add(course);
        }
        this.tuition = tuition;
    }

    // overloaded method to enroll with an array of courses
    public void enrollCourses(String[] courses) {
        for (String course : courses) {
            this.enrolledCourses.add(course);  // Corrected to use List's add method
        }
        updateTuition();  // Correct usage
    }

    // overloaded method to enroll with a single course
    public void enrollCourses(String course) {
        this.enrolledCourses.add(course);  // Corrected to use List's add method
        updateTuition();  // Correct usage
    }

    // public method to update tuition based on enrolled courses
    public void updateTuition() {
        this.tuition = this.enrolledCourses.size() * 500;  // Calculates tuition based on number of courses
    }

    public double getTuition() {
        return tuition;
    }
}

