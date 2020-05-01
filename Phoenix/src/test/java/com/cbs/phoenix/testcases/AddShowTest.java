package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AddShowPage;
import com.cbs.phoenix.utilities.TestDataProvider;


public class AddShowTest extends BaseTest{
	
	private String testId;
	private TestDataProvider testDataProvider;

	private AddShowPage AddShow;	

	@Test
	public void TC_AddShow() {
		
		AddShow = new AddShowPage(getDriver());
		
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
		
		testId = "TD_Phoenix_001.01";
		
		AddShow.addshowpage(testDataProvider, testId);
	}
}