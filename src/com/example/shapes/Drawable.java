package com.example.shapes;

public interface Drawable {
    void draw();
}

// Implement Drawable in the shape classes
public class Circle extends Shape implements Drawable {
    // ... (existing code)
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}

public class Rectangle extends Shape implements Drawable {
    // ... (existing code)
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + ", width: " + width);
    }
}

