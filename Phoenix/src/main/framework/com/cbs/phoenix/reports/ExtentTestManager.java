package com.cbs.phoenix.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	
	static Map extentTestMap = new HashMap();
	
	static ExtentReports extent = ExtentManager.getReporter();
	
	public static ExtentTest getTest() {
		return (ExtentTest) extentTestMap.get((int)(long)(Thread.currentThread().getId()));
	}
	
	public static void endTest() {
		
		extent.endTest((ExtentTest) extentTestMap.get((int)(long)(Thread.currentThread().getId())));
	}
	
	public static ExtentTest startTest(String testName, String desc) {
		
		ExtentTest test = extent.startTest(testName, desc);
		extentTestMap.put((int)(long)(Thread.currentThread().getId()), test);
		return test;
	}
	
	public static ExtentTest startTest(String testName) {
		ExtentTest test = extent.startTest(testName);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
		return test;
	}

}
