package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class Login extends BasePageObject {

    private By dashboardPage = MobileBy.AccessibilityId("Products");

//    private By loginDisplyd = By.xpath("//android.view.View[@content-desc=\"Login\"]");

    private By loginicn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By emailField = By.xpath("//android.view.View/android.widget.EditText[1]");

    private By passwordField = By.xpath("//android.view.View/android.widget.EditText[2]");

    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    private By errorMsg = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");

    private By pswrdcnntempt = MobileBy.AccessibilityId("password can not empty");

    private By emlcnntempt = MobileBy.AccessibilityId("email can not empty");

    public void dashboardPageDisplayed(){
        isDisplayed(dashboardPage);
    }

//    public void loginPageDisplayed(){
//        isDisplayed(loginDisplyd);
//    }

    public void loginIcon(){
        AndroidElement elm = find(loginicn);
        elm.click();
    }

    public void inputEmail(String email){
        click(emailField);

        inputText(emailField, email);
    }

    public void inputValidEmail(String email){
        click(emailField);

        inputText(emailField, email);
    }

    public void inputInvalidEmail(String email){
        click(emailField);

        inputText(emailField, email);
    }

    public void inputPassword(String password){
        click(passwordField);

        inputText(passwordField, password);
    }

    public void inputInvalidPassword(String password){
        click(passwordField);

        inputText(passwordField, password);
    }

    public void inputValidPassword(String password){
        click(passwordField);

        inputText(passwordField, password);
    }

    public void clickLogin(){
        click(loginBtn);
    }

    public void errorMessageDisplayed(){
        isDisplayed(errorMsg);
    }

    public void passwordCanNotEmpty(){
        isDisplayed(pswrdcnntempt);
    }

    public void emailCanNotEmpty(){
        isDisplayed(emlcnntempt);
    }


}
