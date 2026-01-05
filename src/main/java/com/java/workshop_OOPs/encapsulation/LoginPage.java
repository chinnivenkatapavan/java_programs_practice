package com.java.workshop_OOPs.encapsulation;

import com.java.workshop_OOPs.polymorphism.SeleniumActions;

public class LoginPage {
    private String userName = "username";
    private String passWord = "password";
    private String signInbutton = "signIN_Button";
    public void login(String email , String password){
        System.out.println("type value in :" +userName+"-"+email);
        System.out.println("type value in :" +passWord+"-"+password);
        System.out.println("click on :"+signInbutton);
    }

    public static void main(String[] args){
        //created object for login+_page
        LoginPage loginpage = new LoginPage();
        //created object for SeleniumActions
        SeleniumActions seleniumactions = new SeleniumActions();
        seleniumactions.typeValue(loginpage.userName,"email");
        seleniumactions.typeValue(loginpage.passWord,"password");
        seleniumactions.click(loginpage.signInbutton);
    }
}
