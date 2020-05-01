package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_RejectPage_44975;
import com.cbs.phoenix.pageobjects.Notification_CutbacksPage_55472;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_Cutsbacks_Reject_55472 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_CutbacksPage_55472 PRWebapproval;	
		
	@Test
	public void TC_55472() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_CutbacksPage_55472(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}



}
