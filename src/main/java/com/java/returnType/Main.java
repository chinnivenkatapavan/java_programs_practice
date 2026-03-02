package com.java.returnType;

import com.java.oops.encapsulation.program1.Student;

import java.util.List;

public class Main {
    //Method returning an object
    //returnType - method_name - Parameter varaible
   /* Return_Example getStudent(String name){
        return new Return_Example(name);
    } */

    public static void main(String[] args) {

        Main main = new Main();

        Return_Example return_example = new Return_Example("pavan");

        //Getting default return_type
        return_example.greet();

        //Store int return_type value into a
        int a = return_example.add(15,5);
        System.out.println(a);

        //get object variable
        //ReturnType - varaible_name
        //Return_Example ro = main.getStudent("pavan");
        System.out.println("Returing object value :: " +return_example.name);

        //get array return_type
        System.out.println("------Get Arrays---------");
        int[] getArray = return_example.getNumbers();
        for(int i : getArray){
            System.out.println(i);
        }

        //get list
        System.out.println("------Get List----------");
        List<String> getList = return_example.getNames();
        for(String i :  getList ){
            System.out.println(i);
        }
        System.out.println(getList);

        //Get return diff types dynamically
        System.out.println(return_example.generic("If you seeing this type"));
        System.out.print(return_example.generic(100));
        System.out.print(return_example.generic("%"));
    }
}
