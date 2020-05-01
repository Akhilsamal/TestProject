
package com.cbs.phoenix.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.utilities.TestDataProvider;


public class CreateDealPage extends BasePage {
	
	
	public TestDataProvider testDataProvider;
	
	private HashMap<String, String> tcData;
	
	public CreateDealPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
		testDataProvider = new TestDataProvider("TD_Demo");
	}

	
	public void generateDealId(TestDataProvider testDataProvider, String testId) {
		
		tcData = testDataProvider.readData(testId);
		
	}
	
	

}
