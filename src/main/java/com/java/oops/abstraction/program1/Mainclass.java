package com.java.oops.abstraction.program1;

public class Mainclass {

    public static void main(String[] args){
//        Shape shape[] = {new Circle("white", 5), new Rectangle("red", 4, 5)};
//        for (Shape s : shape) {
//            System.out.println(s.getColor() + "area: " + s.getArea());
//        }

        Circle circle = new Circle("whitie",5);
        System.out.println("Color: " +circle.getColor()+ "area: " +circle.getArea());

        Rectangle rectangle = new Rectangle("red",5,5);
        System.out.println("Color: " +rectangle.getColor()+ "area: " +rectangle.getArea());

        System.out.println("************************************************");

        Shape circle_shape = new Circle("black",10);
        System.out.println("Color: " +circle.getColor()+ "area: " +circle_shape.getArea());

        Shape rectangle_shape = new Rectangle("pink",10,5);
        System.out.println("Color: " +rectangle_shape.getColor()+ "area: " +rectangle_shape.getArea());

    }

}
