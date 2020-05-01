package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.BasePage;

import com.cbs.phoenix.pageobjects.Notification_MSUApprovePage_45073;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class TC_Notification_MSUApprove_45073 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_MSUApprovePage_45073 PRWebapproval;	
		
	@Test
	public void TC_45073() throws IOException, InterruptedException {
		
		BasePage pg =new BasePage(driver);
		
		try {
					
		PRWebapproval = new Notification_MSUApprovePage_45073(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval2(testDataProvider, testId);
				
		}
		
		catch(Exception e) {
			
			ExtentTestManager.getTest().log(LogStatus.FAIL,e.getMessage());		
			pg.Failedscreenshot();
			}
	}

}
