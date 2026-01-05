package com.java.oops.abstraction.program2;

public class UPI implements Payment{

    private String upiId;

    UPI(String upiid){
        this.upiId = upiid;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" +amount+ "Via UPI method");

        return amount <= 50000;
    }

    @Override
    public String getPaymentMethod() {
        return "UPI Payment method";
    }
}
