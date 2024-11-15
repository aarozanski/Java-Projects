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

public class AdjunctProfessor extends Professor {
    private int coursesTaught;

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
