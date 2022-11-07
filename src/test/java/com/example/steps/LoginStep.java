package com.example.steps;

import com.example.app.pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {

    @Steps
    Login login;
    @Given("I am on the dashboard")
    public void iAmOnTheDashboard() {
        login.dashboardPageDisplayed();
    }

    @When("I click login icon")
    public void iClickLoginIcon() {
        login.loginIcon();
    }

    @And("I input null email")
    public void iInputNullEmail() {
        login.inputEmail("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        login.inputPassword("");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLogin();
    }

    @Then("I get error message")
    public void iGetErrorMessage() {
        login.errorMessageDisplayed();
    }

    @And("I input invalid email")
    public void iInputInvalidEmail() {
        login.inputInvalidEmail("davidsagala@co.id");
    }

    @Then("I get error message password can not empty")
    public void iGetErrorMessagePasswordCanNotEmpty() {
        login.passwordCanNotEmpty();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        login.inputInvalidPassword("qwe123");
    }

    @Then("I get error message email can not empty")
    public void iGetErrorMessageEmailCanNotEmpty() {
        login.emailCanNotEmpty();
    }

    @And("I input valid email")
    public void iInputValidEmail() {
        login.inputValidEmail("davidsagala992@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        login.inputValidPassword("000999");
    }

    @Then("I go to product page")
    public void iGoToProductPage() {
        login.dashboardPageDisplayed();
    }
}
