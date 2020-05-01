package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.BasePage;
import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_DoOverPage_44988;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class TC_Notification_ChangeRequest_DoOver_44988 extends BaseTest{
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_ChangeRequest_DoOverPage_44988 PRWebapproval;	
		
	@Test
	public void TC_44988() throws IOException, InterruptedException {
		
		BasePage pg =new BasePage(driver);
		
		try {
					
		PRWebapproval = new Notification_ChangeRequest_DoOverPage_44988(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}
		
		catch(Exception e) {
			
			ExtentTestManager.getTest().log(LogStatus.FAIL,e.getMessage());		
			pg.Failedscreenshot();
			}
	}
}
