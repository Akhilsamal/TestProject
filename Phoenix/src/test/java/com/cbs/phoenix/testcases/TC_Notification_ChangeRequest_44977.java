package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Notification_ChangeRequestPage_44977;
import com.cbs.phoenix.pageobjects.Notification_CutbacksPage_55466;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_ChangeRequest_44977 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_ChangeRequestPage_44977  PRWebapproval;	
		
	@Test
	public void TC_44977() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_ChangeRequestPage_44977(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
