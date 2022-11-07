package com.example.steps;

import com.example.app.pages.Logout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LogoutStep {

    @Steps
    Logout logout;
    @Then("I go to login page")
    public void iGoToLoginPage() {
        logout.loginPageDisplayed();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logout.logoutButton();
    }
}
