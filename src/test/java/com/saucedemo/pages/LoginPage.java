package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class LoginPage {
    WebDriver driver;
    ConfigReader locators;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/login_page_locators.properties");
    }

    public void enterUsername(String username) {
        driver.findElement(By.xpath(locators.getLocator("username"))).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(locators.getLocator("password"))).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath(locators.getLocator("login_button"))).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
