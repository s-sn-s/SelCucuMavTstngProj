package org.cartOcart.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cartOcart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPageStepdef {

    private WebDriver driver;
    private LoginPage loginPage;


    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){driver.quit();}
    }

    @Given("Take User to login page")
    public void userHasLandedOnLoginPage() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage = new LoginPage(driver);
    }

    @Then("Verify user is landed on login page")
    public void verifyUserIsLandedOnLoginPage() {
        Assert.assertTrue(loginPage.verifyUserLandedOnLogin());
    }
}
