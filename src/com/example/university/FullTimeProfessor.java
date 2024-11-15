package com.example.university;

public class FullTimeProfessor extends Professor {
    public FullTimeProfessor(String name, Department department) {
        super(name, department);
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        setSalary(6000); // Example fixed salary
    }
}
