package com.java.oops.abstraction.program1;

public class Rectangle extends Shape {
    protected double widht;
    protected double height;

    Rectangle(String color, double widht, double height){
        super(color);
        this.widht = widht;
        this.height = height;
    }

    @Override
    public double getArea() {
        return widht * height;
    }

}
