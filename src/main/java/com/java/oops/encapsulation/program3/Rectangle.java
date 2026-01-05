package com.java.oops.encapsulation.program3;

public class Rectangle {
    private double height;
    private double width;

    Rectangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(double height){
        this.height = (height > 0) ? height : 1.0;

    }

    public void setWidth(double width){
        this.width = (width > 0) ? width : 1.0;
    }

    public double getAera(){
        return height*width;
    }

}
