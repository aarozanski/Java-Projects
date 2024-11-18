package com.example.shapes;

public abstract class Shape {
    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Non-abstract method
    public String getShapeType() {
        return this.getClass().getSimpleName(); // Returns the class name as the shape type
    }
}





