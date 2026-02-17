package com.yourpackage;

public abstract class Shape {

    protected int x;
    protected int y;
    public String color = "Red [Original Color]";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
