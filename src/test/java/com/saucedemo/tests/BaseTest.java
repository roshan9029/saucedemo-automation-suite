package com.saucedemo.tests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.saucedemo.utils.ExtentManager;

public class BaseTest {
	  public static ExtentReports extent;
	    public static ExtentTest test;

	    @BeforeSuite
	    public void setUpExtent() {
	        extent = ExtentManager.createInstance("test-output/ExtentReport.html");
	    }

	    @AfterSuite
	    public void tearDownExtent() {
	        extent.flush();
	    }
}