package com.java.oops.encapsulation.program2;

public class Employee {
    private String name;
    private double salary;
    private double Min_Salary = 30000;

    public String getName(){return name;}
    public double getSalary(){return salary;}

    public Employee(String name, double salary){
        this.name = name;
        setSalary(salary);

    }

    public void setSalary(double salary){
        if(salary < Min_Salary){
            this.salary = Min_Salary;
        }

    }

}
