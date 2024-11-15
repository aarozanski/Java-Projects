package com.example.university;

public class Main {
    public static void main(String[] args) {
        // Create a department
        Department csDepartment = new Department("Computer Science");

        // Create professors and assign them to the department
        FullTimeProfessor ftProfessor = new FullTimeProfessor("Dr. John Smith", csDepartment);
        AdjunctProfessor adjunctProfessor = new AdjunctProfessor("Dr. Jane Doe", csDepartment, 3);

        // Create courses and add them to the department
        Course dataStructures = new Course("Data Structures", 4);
        Course algorithms = new Course("Algorithms", 3);
        csDepartment.addCourse(dataStructures);
        csDepartment.addCourse(algorithms);

        // Create students
        Student student1 = new Student("Jane Doe", 101);
        Student student2 = new Student("Mark Lee", 102);

        // Enroll students in courses
        dataStructures.enrollStudent(student1);
        dataStructures.enrollStudent(student2);
        algorithms.enrollStudent(student1);

        // Display department details
        System.out.println("Department: " + csDepartment.getName());
        System.out.println("Courses offered:");
        for (Course course : csDepartment.getCourses()) {
            System.out.println("- " + course.getName());
        }

        System.out.println("Professors:");
        for (Professor professor : csDepartment.getProfessors()) {
            System.out.println("- " + professor.getName() + " (Salary: $" + professor.getSalary() + ")");
        }

        // Print students in each course
        for (Course course : csDepartment.getCourses()) {
            System.out.println("Students enrolled in " + course.getName() + ":");
            for (Student student : course.getStudents()) {
                System.out.println("- " + student.getName());
            }
        }

//        // Example of polymorphism in action
//        ftProfessor.conductLecture();
//        adjunctProfessor.conductLecture();
//
//        // Example of method overriding
//        ftProfessor.gradeStudents();
//        adjunctProfessor.gradeStudents();
    }
}

