package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AddShowPage;
import com.cbs.phoenix.pageobjects.NewSalesShowPage_53510;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_NewSalesShow_53510 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;

	private NewSalesShowPage_53510 AddShow;	

	@Test
	public void TC_AddShow()  {
		
		AddShow = new NewSalesShowPage_53510(getDriver());
		
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix1.xlsx");
		
		//testId = "TD_Phoenix_001.01";
		
		testId = "SHOWS";
		
		AddShow.addshowpage(testDataProvider, testId);
	}

}
