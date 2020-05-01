package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;


import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_DooverPage_44999;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_Notification_ChangeRequest_Doover_44999 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_ChangeRequest_DooverPage_44999 PRWebapproval;	
		
	@Test
	public void TC_44999() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_ChangeRequest_DooverPage_44999(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
