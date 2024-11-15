package com.example.university;

public class AdjunctProfessor extends Professor {
    private final int coursesTaught;

    public AdjunctProfessor(String name, Department department, int coursesTaught) {
        super(name, department);
        this.coursesTaught = coursesTaught;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        setSalary(1000 * coursesTaught);
    }
}
