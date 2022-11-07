package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Register extends BasePageObject {

    private By regIcn = MobileBy.AccessibilityId("Register");

    private By fieldFullname = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fieldEmaill = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By fieldPassw = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");

    private By regBtn = By.xpath("\t\n" +
            "//android.widget.Button[@content-desc=\"Register\"]");

    private By fllnmCnNtEmpt = MobileBy.AccessibilityId("fullname can not empty");

    private By emlCnNtEmpt = MobileBy.AccessibilityId("email can not empty");

    private By passCnNtEmpt = MobileBy.AccessibilityId("password can not empty");

    public void registerIcon(){
        click(regIcn);
    }

    public void inputNullFullname(String fullname){
        click(fieldFullname);

        inputText(fieldFullname, fullname);
    }

    public void inputValidFullname(String fullname){
        click(fieldFullname);

        inputText(fieldFullname, fullname);
    }

    public void inputEmaill(String emaill){
        click(fieldEmaill);

        inputText(fieldEmaill, emaill);
    }

    public void inputValidEmaill(String emaill){
        click(fieldEmaill);

        inputText(fieldEmaill, emaill);
    }

    public void inputPasswordd(String passwordd){
        click(fieldPassw);

        inputText(fieldPassw, passwordd);
    }

    public void inputValidPasswordd(String passwordd){
        click(fieldPassw);

        inputText(fieldPassw, passwordd);
    }

    public void registerButton(){
        click(regBtn);
    }

    public void fullnameCanNotEmpty(){
        isDisplayed(fllnmCnNtEmpt);
    }

    public void emaillCanNotEmpty(){
        isDisplayed(emlCnNtEmpt);
    }

    public void passwordCanNotEmpty(){
        isDisplayed(passCnNtEmpt);
    }
}
