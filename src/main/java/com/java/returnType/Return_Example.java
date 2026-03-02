package com.java.returnType;

import java.util.Arrays;
import java.util.List;

public class Return_Example {

    String name;

    Return_Example(String name){
        this.name = name;
    }

    //Returning array
    int[] getNumbers(){
       return new int[]{1,2,3,4,5};
    }

    //Returning default
    void greet(){
        System.out.println("Welcome to return type examples");
        System.out.println("Here you can learn everything about return_type");
    }

    //Returning int
    int add(int a, int b){
        return a+b;
    }

    //Returning List
    List<String> getNames(){
     return Arrays.asList("A","B","C");
    }

    //Generic method returning any type
    <T> T generic(T t){
        return t;
    }




}
