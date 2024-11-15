package com.example.university;

public abstract class Professor {
    private String name;
    private double salary;
    private Department department;

    public Professor(String name, Department department) {
        this.name = name;
        this.department = department;
        this.department.addProfessor(this);
    }

    public abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }
}

