package com.sdet.automation.testNG;

import org.testng.annotations.Test;

public class SampleGroupTest {

    @Test(groups = "smoke" , dependsOnMethods = "test5")
    public void test1(){
        System.out.println("smoke :: test1");
    }

    @Test(groups = {"smoke","regression"})
    public void test2(){
        System.out.println("smoke & regression :: test2");
    }

    @Test(groups = "regression" )
    public void test3(){
        System.out.println("regression :: test3");
    }

    @Test(groups = {"smoke","regression"})
    public void test4(){
        System.out.println("smoke & regression :: test4");
    }

    @Test(groups = "smoke")
    public void test5(){
        System.out.println("smoke :: test5");
    }

}
