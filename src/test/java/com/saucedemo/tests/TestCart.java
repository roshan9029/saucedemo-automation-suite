package com.saucedemo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutCompletePage;
import com.saucedemo.pages.CheckoutInformationPage;
import com.saucedemo.pages.CheckoutOverviewPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.DriverManager;

public class TestCart extends BaseTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = DriverManager.getDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user", "secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}

	@Test
	public void addToCartTest() {
		
		 test = extent.createTest("Add to Cart and Checkout Test");
	     test.info("Adding item to cart");
		
		InventoryPage inventoryPage = new InventoryPage(driver);
		CartPage cartPage = new CartPage(driver);
		inventoryPage.clickAddToCartFirstItem();
		int badgeCount = inventoryPage.getCartBadgeCount();
		Assert.assertEquals(badgeCount, 1);
		test.log(Status.PASS, "Badge Count Verification Done.");

		// TC-03
		inventoryPage.clickCartIcon();
		Assert.assertTrue(cartPage.isProductDisplayed());
		test.log(Status.PASS, "Cart Page is displayed.");

		// TC-04
		test.info("Performing Checkout");
		cartPage.clickCheckout();

		// Enter personal details on Checkout Information Page
		CheckoutInformationPage infoPage = new CheckoutInformationPage(driver);
		infoPage.enterPersonalDetailsAndContinue("John", "Doe", "12345");

		// Verify Checkout Overview Page
		CheckoutOverviewPage overviewPage = new CheckoutOverviewPage(driver);
		Assert.assertTrue(overviewPage.isOverviewPageDisplayed(), "Checkout Overview page not displayed");
		test.log(Status.PASS, "Overview Page is displayed.");
		Assert.assertTrue(overviewPage.isProductDisplayed(), "Product not displayed on Overview Page");

		// Click on Finish Button
		test.info("Performing Checkout finish.");
		overviewPage.finishClick();

		// Verify Thank You message on Complete page
		CheckoutCompletePage completePage = new CheckoutCompletePage(driver);
		Assert.assertTrue(completePage.isThankYouMessageDisplayed(), "Thank you message not displayed");
		test.log(Status.PASS, "Checkout Completed Successfully.");
		
		// Verify URL indicates successful order completion
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"), "URL does not indicate completion");
		completePage.clickBackHome();
	}

	@AfterMethod
	public void teardown() {
		DriverManager.quitDriver();
	}
}
