package com.example.shapes;

public interface Colorable {
    String getColor();
}

// Example of implementing Colorable in Circle
public class Circle extends Shape implements Drawable, Colorable {
    // ... (existing code)
    private String color = "Red";

    @Override
    public String getColor() {
        return color;
    }
}

