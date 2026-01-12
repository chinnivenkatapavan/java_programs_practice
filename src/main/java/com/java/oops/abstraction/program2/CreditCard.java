package com.java.oops.abstraction.program2;

public class CreditCard implements Payment{

    private String cardNumber;

    CreditCard (String cardNumber){
        this.cardNumber = cardNumber;
    }

//    public String setCardNumber(String cardNumber){
//        this.cardNumber = cardNumber;
//    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" + amount + "via credit card ");
        return amount <= 100000;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card payment";
    }
}
