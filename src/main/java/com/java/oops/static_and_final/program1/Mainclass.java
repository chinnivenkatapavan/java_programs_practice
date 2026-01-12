package com.java.oops.static_and_final.program1;

public class Mainclass {
    public static void main(String[] args){
        Mathutility mathutility = new Mathutility();

        //Calling static method without object
        System.out.println(Mathutility.add(5,5));

        //Calling non-static method with object
        System.out.println(mathutility.sub(9,8));

        //Calling static variable without object
        Mathutility.Name="Pavan";
        System.out.println(Mathutility.Name);

        //Calling non-static variable with object
        mathutility.id=527;
        System.out.println(mathutility.id);
    }
}
