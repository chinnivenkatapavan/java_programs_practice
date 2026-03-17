package com.sdet.automation.cucumberBDD.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class Login_Steps {
    @Given("User launch login page")
    public void user_launch_login_page() {
        System.out.println("User launch login page");
    }
    @When("User enter login credentials in login page")
    public void user_enter_login_credentials_in_login_page() {
        System.out.println("User enter login credentials in login page");
    }
    @When("User click on sign button")
    public void user_click_on_sign_button() {
        System.out.println("User click on sign button");
    }
    @Then("User successfully enters welcome page")
    public void user_successfully_enters_welcome_page() {
        System.out.println("User successfully enters welcome page");
    }

    @When("User enter {string} and {string} login credentials in login page")
    public void userEnterAndLoginCredentialsInLoginPage(String userName, String passWord) {
        System.out.println("UserName :: " + userName);
        System.out.println("Password :: " + passWord);
        System.out.println("**********************************************");
    }

    @When("User enter {string} login credentials in login page")
    public void userEnterLoginCredentialsInLoginPage(String userName) {
        System.out.println("UserName :: " + userName);
        System.out.println("*************************");
    }

    @When("User enter credentials in login page")
    public void userEnterCredentialsInLoginPage(DataTable dataTable) {
        List<String> credentials = dataTable.row(0);
        System.out.println("Credentials :: " + credentials);
        String userName = credentials.get(0);
        String passWord = credentials.get(1);
    }

    @When("User enter credentials in login page using header")
    public void userEnterCredentialsInLoginPageUsingHeader(DataTable dataTable) {
        List<Map<String,String>> pairCredential = dataTable.asMaps(String.class, String.class);
        System.out.println("Credentials :: " + pairCredential);
        for (Map<String,String> pairCred : pairCredential) {
            System.out.println(pairCred.get("Last"));
            System.out.println(pairCred.get("Name"));

        }
        System.out.println("**********************************************");
        System.out.println("Credentials :: " + pairCredential.get(1).get("Last"));
       // System.out.println("Credentials :: " + pairCredential.get(0).get("Name"));
    }
}
