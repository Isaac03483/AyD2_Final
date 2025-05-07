package com.example.shapes;

public class Circle implements Shape {

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
}
