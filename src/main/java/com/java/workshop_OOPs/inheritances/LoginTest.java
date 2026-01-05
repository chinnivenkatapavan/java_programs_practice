package com.java.workshop_OOPs.inheritances;

import com.java.workshop_OOPs.abstraction.GooglePay;
import com.java.workshop_OOPs.abstraction.Payment;
import com.java.workshop_OOPs.abstraction.PhonePe;
import com.java.workshop_OOPs.encapsulation.LoginPage;

public class LoginTest extends BaseTest {

    public static void main(String[] args){
        //creating object to child_class and used to call method in parent_class
        LoginTest loginTest = new LoginTest();

        //creating object loginPage
        LoginPage loginpage = new LoginPage();

        //creating object for abstraction_class
        Payment gpaypay = new GooglePay();
        Payment phnpay = new PhonePe();

        System.out.println("--------------------------------");
        gpaypay.pay();
        phnpay.pay();
        System.out.println("--------------------------------");

        loginTest.lanuchBrowser();
        loginTest.lanuchApplication();
        loginpage.login("chinnivenkatapavan@gmail.com","1231231234");
        System.out.println("Assert");
        loginTest.closeBrowser();


    }
}
