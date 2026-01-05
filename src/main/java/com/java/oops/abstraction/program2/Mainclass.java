package com.java.oops.abstraction.program2;

public class Mainclass {

    public static void main(String[] args){
        Payment payment = new CreditCard("123456789");
        Payment payment1 = new UPI("9010505612@upi");

        payment.processPayment(9000000);
        System.out.println(payment.getPaymentMethod());
        //((CreditCard) payment).setCardNumber("123456789");
        payment1.processPayment(5000000);
        System.out.println(payment1.getPaymentMethod());




    }
}
