package com.saucedemo.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	 private static ExtentReports extent;

	    public static ExtentReports createInstance(String filePath) {
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(filePath);
	        sparkReporter.config().setTheme(Theme.STANDARD);
	        sparkReporter.config().setDocumentTitle("Sauce Labs Automation Report");
	        sparkReporter.config().setReportName("Sauce Labs Test Execution Report");

	        extent = new ExtentReports();
	        extent.attachReporter(sparkReporter);
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("Tester", "Roshan");

	        return extent;
	    }
	}