package com.example.shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of shapes
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Square(4));

        // Use polymorphism to calculate area and perimeter
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getShapeType());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }
            System.out.println();
        }
    }
}

