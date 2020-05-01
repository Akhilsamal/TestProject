package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Notification_CutbacksPage_55472;
import com.cbs.phoenix.pageobjects.Notification_OptionChangeRejectPage_55471;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_OptionChangeReject_55471 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_OptionChangeRejectPage_55471 PRWebapproval;	
		
	@Test
	public void TC_55471() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_OptionChangeRejectPage_55471(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
