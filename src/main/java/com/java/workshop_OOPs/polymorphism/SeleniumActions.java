package com.java.workshop_OOPs.polymorphism;

public class SeleniumActions {

    public void click(String webElement){
        System.out.println("polymorphism - Click on WebElement -"+webElement);
    }

    public void click(String webElement , int time){
        System.out.println("Click on WebElement -"+webElement + "wait_operation"+time);
    }

    public void typeValue(String webElement , String data){
        System.out.println("polymorphism - Type value -"+data+"on element"+webElement);
    }
    public void typeValue(String webElement , String data , int time){
        System.out.println("Type value -"+data+"on element"+webElement+"time added"+time);
    }
}
