package com.java.oops.encapsulation.program1;

public class Mainclass {

    public static void main(String[] args){
        Student student = new Student();
        student.setName("Sunkara");
        student.setGrade('A');

        System.out.println("Student_Name:" + student.getName() + " Grade: " +student.getGrade());
    }
}
