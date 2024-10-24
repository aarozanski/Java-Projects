package com.example.school.management;

public class CourseManager {
    private Student[] students;

    public void Student (Student[] students) {
        this.students = students;
    }
    // method to add a student to the list
    public void addStudent(Student student) {
        students.add(student.getAge());
    }
    // method to display the details of all students
    public void displayAllStudents() {
        System.out.println("List of all students:");
        for(Student student : students) {
            student.displayDetails(); // Assuming Student class has a method to display details
        }
    }

}
