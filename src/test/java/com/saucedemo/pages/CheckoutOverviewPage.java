package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class CheckoutOverviewPage {
    WebDriver driver;
    ConfigReader locators;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/checkout_overview_page_locators.properties");
    }

    public boolean isOverviewPageDisplayed() {
        return driver.findElement(By.xpath(locators.getLocator("overview_title"))).isDisplayed();
    }

    public boolean isProductDisplayed() {
        return driver.findElement(By.xpath(locators.getLocator("product_item"))).isDisplayed();
    }
    
    public void finishClick() {
    	 driver.findElement(By.xpath(locators.getLocator("finish_button"))).click();
    }
}
