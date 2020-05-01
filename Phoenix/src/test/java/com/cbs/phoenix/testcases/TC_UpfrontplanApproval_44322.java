package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.UpfrontplanApprovalPage_44322;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_UpfrontplanApproval_44322 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  UpfrontplanApprovalPage_44322 approve;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		approve = new UpfrontplanApprovalPage_44322(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		approve.approval(testDataProvider, testId);
				
		}

}
