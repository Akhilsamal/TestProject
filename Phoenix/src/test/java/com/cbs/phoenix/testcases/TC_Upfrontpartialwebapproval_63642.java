package com.cbs.phoenix.testcases;

import java.io.IOException;


import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.UpfrontpartialorderwebapprovalPage_63642;

import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Upfrontpartialwebapproval_63642 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private   UpfrontpartialorderwebapprovalPage_63642 approve;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		approve = new UpfrontpartialorderwebapprovalPage_63642(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		approve.approval(testDataProvider, testId);
				
		}


	

}
