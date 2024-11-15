package com.example.university;
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // Getters for the department name, professors, and courses
    public String getName() {
        return name;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
