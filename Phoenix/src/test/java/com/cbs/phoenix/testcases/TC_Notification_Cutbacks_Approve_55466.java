package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Notification_CutbacksPage_55466;
import com.cbs.phoenix.pageobjects.Notification_CutbacksPage_55472;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_Cutbacks_Approve_55466 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_CutbacksPage_55466  PRWebapproval;	
		
	@Test
	public void TC_55466() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_CutbacksPage_55466(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}

}
