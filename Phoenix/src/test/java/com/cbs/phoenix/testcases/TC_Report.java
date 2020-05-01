package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.BasePage;
import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_RejectPage_44963;
import com.cbs.phoenix.pageobjects.ReportPage;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class TC_Report extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  ReportPage PRWebapproval;	
		
	@Test
	public void TC_Reports() throws IOException, InterruptedException {
				
		//BasePage pg =new BasePage(driver);
		//try {
	
		PRWebapproval = new ReportPage(getDriver());
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
