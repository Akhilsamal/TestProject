package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.ChangeRequestRejectPage_44980;
import com.cbs.phoenix.pageobjects.Notification_ChangeRequest_RejectPage_44963;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_ChangeRequestReject_44980 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  ChangeRequestRejectPage_44980 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException, InterruptedException {
					
		PRWebapproval = new ChangeRequestRejectPage_44980(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
