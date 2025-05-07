package com.example.shapes;

public class Rectangle implements Shape {

    private double base;
    private double height;

    public Rectangle(double base, double height) {

    }

    @Override
    public double calculateArea() {
        return base * height;
    }
    
}
