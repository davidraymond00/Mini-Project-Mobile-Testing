package com.example.steps;

import com.example.app.pages.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {

    @Steps
    Register register;

    @And("I click register icon")
    public void iClickRegisterIcon() {
        register.registerIcon();
    }

    @And("I input null fullname")
    public void iInputNullFullname() {
        register.inputNullFullname("");
    }

    @And("I register null email")
    public void iRegisterNullEmail() {
        register.inputEmaill("");
    }

    @And("I register null password")
    public void iRegisterNullPassword() {
        register.inputPasswordd("");
    }

    @And("I clik register button")
    public void iClikRegisterButton() {
        register.registerButton();
    }

    @Then("I get error message fullname can not empty")
    public void iGetErrorMessageFullnameCanNotEmpty() {
        register.fullnameCanNotEmpty();
    }

    @And("I input valid fullname")
    public void iInputValidFullname() {
        register.inputValidFullname("David Raymond");
    }

    @Then("I get error message emaill can not empty")
    public void iGetErrorMessageEmaillCanNotEmpty() {
        register.emaillCanNotEmpty();
    }

    @And("I register valid email")
    public void iRegisterValidEmail() {
        register.inputValidEmaill("davidsagala992@gmail.com");
    }

    @And("I register valid password")
    public void iRegisterValidPassword() {
        register.inputValidPasswordd("000999");
    }
}
