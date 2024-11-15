package com.example.university;

public class Department {
    private String name; // Store the name of the department
    private List<Professor> professors; // List to hold professors associated with the department
    private List<Course> courses; // List to hold courses offered by the department

    // Constructor to initialize the Department with a name
    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>(); // Initialize the list of professors
        this.courses = new ArrayList<>(); // Initialize the list of courses
    }

    // Method to add a professor to the department
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }

    // Method to add a course to the department
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    // Getter for the department name
    public String getName() {
        return name;
    }

    // Getter for the list of professors
    public List<Professor> getProfessors() {
        return professors;
    }

    // Getter for the list of courses
    public List<Course> getCourses() {
        return courses;
    }
}

