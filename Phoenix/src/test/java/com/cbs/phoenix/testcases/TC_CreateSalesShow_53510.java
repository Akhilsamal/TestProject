package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.BasePage;
import com.cbs.phoenix.pageobjects.CreateSalesShowPage_53510;
import com.cbs.phoenix.pageobjects.SalesShowPage;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class TC_CreateSalesShow_53510 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private CreateSalesShowPage_53510  showtab;	
	
	@Test
	public void TC_show_53510() throws IOException {
		
		BasePage pg =new BasePage(driver);
		try {		
		showtab = new CreateSalesShowPage_53510(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
		
		testId = "SHOWS";
		
		showtab.showpage(testDataProvider, testId);
		}
		
		catch(Exception e) {
			
			ExtentTestManager.getTest().log(LogStatus.FAIL,e.getMessage());	
			e.printStackTrace();
			pg.Failedscreenshot();
		}
				
	}

}
