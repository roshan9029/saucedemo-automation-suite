package com.saucedemo.tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.DriverManager;
import com.saucedemo.utils.RetryAnalyzer;

public class TestLogin extends BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest() {
    	test = extent.createTest("Login Test");
        LoginPage loginPage = new LoginPage(driver);
        test.info("Navigating to login page");
        test.info("Performing login");
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        test.log(Status.PASS, "Login test passed");
    }

    @AfterMethod
    public void teardown() {
        //DriverManager.quitDriver();
    }
}

