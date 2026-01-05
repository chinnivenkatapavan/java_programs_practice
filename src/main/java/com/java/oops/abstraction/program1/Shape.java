package com.java.oops.abstraction.program1;

abstract public class Shape {
    protected String color;

    public String getColor(){return color;}

    public Shape(String color){this.color = color;}

    public abstract double getArea();
}
