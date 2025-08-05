package com.saucedemo.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.utils.ConfigReader;

public class CheckoutInformationPage {
    WebDriver driver;
    ConfigReader locators;

    public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
        this.locators = new ConfigReader("src/test/resources/locators/checkout_information_page_locators.properties");
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.xpath(locators.getLocator("first_name"))).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.xpath(locators.getLocator("last_name"))).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(By.xpath(locators.getLocator("postal_code"))).sendKeys(postalCode);
    }

    public void clickContinue() {
        driver.findElement(By.xpath(locators.getLocator("continue_button"))).click();
    }

    public void enterPersonalDetailsAndContinue(String firstName, String lastName, String postalCode) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickContinue();
    }
}
