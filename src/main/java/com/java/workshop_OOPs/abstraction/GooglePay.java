package com.java.workshop_OOPs.abstraction;

public class GooglePay implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment by GooglePay App");
    }
}
