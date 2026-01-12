package com.java.oops.abstraction.program1;

abstract public class Shape {
    protected String color;
    //private String Demo;

    public String getColor(){
        return color;
    }

    //constructor
    public Shape(String color){
        this.color = color;
    }


//    public Shape(){
//        this.color = "default_color";
//    }

    public abstract double getArea();
}
