package com.example.minion;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(int x, int y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
