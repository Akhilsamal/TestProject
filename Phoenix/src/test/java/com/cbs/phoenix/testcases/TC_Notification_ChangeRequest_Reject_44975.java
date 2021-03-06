package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;


import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_RejectPage_44975;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_ChangeRequest_Reject_44975 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_ChangeRequest_RejectPage_44975 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_ChangeRequest_RejectPage_44975(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
