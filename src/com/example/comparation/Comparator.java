package com.example.comparation;

public class Comparator {
    public static void main(String[] args) {

    }
}

class Comparator2 {
    int id;
    String name;
    String surname;
    int salary;

    public Comparator2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Comparator2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
