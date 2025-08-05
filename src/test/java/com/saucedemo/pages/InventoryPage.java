package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class InventoryPage {
    WebDriver driver;
    ConfigReader locators;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/inventory_page_locators.properties");
    }

    public void clickAddToCartFirstItem() {
        driver.findElement(By.xpath(locators.getLocator("add_to_cart_first_item"))).click();
    }

    public int getCartBadgeCount() {
        String countText = driver.findElement(By.xpath(locators.getLocator("cart_badge"))).getText();
        return Integer.parseInt(countText);
    }

    public void clickCartIcon() {
        driver.findElement(By.xpath(locators.getLocator("cart_icon"))).click();
    }
}

