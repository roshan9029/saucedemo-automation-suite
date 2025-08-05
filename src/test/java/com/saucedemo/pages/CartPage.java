package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class CartPage {
    WebDriver driver;
    ConfigReader locators;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/cart_page_locators.properties");
    }

    public boolean isProductDisplayed() {
        return driver.findElement(By.xpath(locators.getLocator("cart_item"))).isDisplayed();
    }
    
    public void clickCheckout() {
        driver.findElement(By.xpath(locators.getLocator("checkout_button"))).click();
    }
}

