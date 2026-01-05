package com.java.workshop_OOPs.abstraction;

public class PhonePe implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment type is phonePe App");
    }
}
