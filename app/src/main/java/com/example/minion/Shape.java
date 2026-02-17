package com.example.minion;

public abstract class Shape {

    protected int x;
    protected int y;
<<<<<<< HEAD
    public String color = "pink";
=======
    public String color = "Blue";
>>>>>>> origin/main

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
