package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.SalesShowPage;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_SalesShow extends BaseTest{
	
	private String testId;
	private TestDataProvider testDataProvider;
	private SalesShowPage  showtab;	
	
	@Test
	public void TC_show() throws IOException {
				
		showtab = new SalesShowPage(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix1.xlsx");
		
		testId = "SHOWS";
		
		showtab.showpage(testDataProvider, testId);
				
	}
	}