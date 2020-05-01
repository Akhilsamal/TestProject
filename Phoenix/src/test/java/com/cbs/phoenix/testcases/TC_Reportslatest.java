package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.ReportPage;
import com.cbs.phoenix.pageobjects.ReportsPage;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Reportslatest extends BaseTest {
	
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  ReportsPage PRWebapproval;	
		
	@Test
	public void TC_Reports() throws IOException, InterruptedException {
				
		//BasePage pg =new BasePage(driver);
		//try {
	
		PRWebapproval = new ReportsPage(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		//}
	
		/*
		 * catch(Exception e) {
		 * 
		 * ExtentTestManager.getTest().log(LogStatus.FAIL,e.getMessage());
		 * e.printStackTrace(); pg.Failedscreenshot(); }
		 */
	}

}
