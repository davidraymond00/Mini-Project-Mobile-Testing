package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Logout extends BasePageObject {

    private By logoutBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    public void logoutButton(){
        click(logoutBtn);
    }

    public void loginPageDisplayed(){}

}
