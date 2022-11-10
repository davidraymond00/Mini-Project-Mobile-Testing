package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Beli extends BasePageObject {

    private By beli = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");

    private By cart = MobileBy.AccessibilityId("1");

    public void beliBtn(){
        click(beli);
    }

    public void cartBtn(){
        isDisplayed(cart);
    }
}
