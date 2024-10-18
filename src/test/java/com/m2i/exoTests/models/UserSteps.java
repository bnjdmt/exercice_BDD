package com.m2i.exoTests.models;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {

    @When("I am on the home-page")
    public void IAmOnTheHomePage() {
        System.out.println("I am on the home-page");
    }

    @Then("I click on login")
    public void IClickOnLogin() {
        System.out.println("I click on login");
    }

    @And("a pop-up appear")
    public void aPopUpAppear() {
        System.out.println("a pop-up appear");
    }

    @Then("I click on register")
    public void IClickOnRegister() {
        System.out.println("I click on register");
    }

    @Then("I am redirected on register page")
    public void IAmRedirectedOnRegisterPage() {
        System.out.println("I am redirected on register page");
    }

    @And("I fill the username field with {string}, the email field with {string} and the password field with {string}")
    public void IFillTheUserNameFieldWithTheEmailFieldWithThePasswordField(String username, String email, String password) {
        System.out.println("I fill the username field with " + username + " and " + email + " and " + password);
    }

    @And("I click on \"submit\"")
    public void IClickOnSubmit() {
        System.out.println("I click on \"submit\"");
    }

    @Then("I am registered and have an account")
    public void IAmRegisteredAndHaveAnAccount() {
        System.out.println("I am registered and have an account");
    }

    @Then("I click on connection")
    public void IClickOnConnection() {
        System.out.println("I click on connection");
    }

    @And("I am redirected on login page")
    public void IAmRedirectedOnLoginPage() {
        System.out.println("I am redirected on login page");
    }

    @And("I fill username field with {string} and password field with {string}")
    public void IFillUserNameFieldWithThePasswordField(String username, String password) {
        System.out.println("I fill username field with " + username + " and " + password);
    }

    @And("I click on connect")
    public void IClickOnConnect() {
        System.out.println("I click on connect");
    }

    @Then("I am logged")
    public void IAmLogged() {
        System.out.println("I am logged");
    }
}
