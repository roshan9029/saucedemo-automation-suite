package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class CheckoutCompletePage {
    WebDriver driver;
    ConfigReader locators;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/checkout_complete_page_locators.properties");
    }

    public boolean isThankYouMessageDisplayed() {
        return driver.findElement(By.xpath(locators.getLocator("thank_you_message"))).isDisplayed();
    }

    public void clickBackHome() {
        driver.findElement(By.xpath(locators.getLocator("back_home_button"))).click();
    }
}

