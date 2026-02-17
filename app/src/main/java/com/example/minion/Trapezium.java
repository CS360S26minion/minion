package com.example.minion;

public class Trapezium extends Shape {

    private double sideA;
    private double sideB;
    private double height;

    public Trapezium(int x, int y, double sideA, double sideB, double height) {
        super(x, y);   // calls Shape constructor
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (sideA + sideB) * height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }
}