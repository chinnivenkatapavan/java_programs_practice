package com.java.oops.abstraction.program1;

public class Circle extends Shape{

    protected double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }



}
