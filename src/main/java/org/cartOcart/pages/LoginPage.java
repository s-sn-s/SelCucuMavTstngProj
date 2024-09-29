package org.cartOcart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean verifyUserLandedOnLogin(){
        return driver.getTitle().equalsIgnoreCase("Account Login");
    }


}
