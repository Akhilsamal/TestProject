package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Notification_OptionChangeApprovePage_55607;
import com.cbs.phoenix.pageobjects.Notification_OptionChangeRejectPage_55471;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Notification_OptionChangeApprove_55607 extends BaseTest {

	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_OptionChangeApprovePage_55607 PRWebapproval;	
		
	@Test
	public void TC_55607() throws IOException, InterruptedException {
					
		PRWebapproval = new Notification_OptionChangeApprovePage_55607(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}


}
