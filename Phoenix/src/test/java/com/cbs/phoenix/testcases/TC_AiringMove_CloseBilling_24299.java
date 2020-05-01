package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringMove_CloseBillingPage_24299;

import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringMove_CloseBilling_24299 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringMove_CloseBillingPage_24299 PR;	
		
	@Test
	public void TC_24299() throws IOException, InterruptedException {
					
		PR = new AiringMove_CloseBillingPage_24299(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		PR.movedispose(testDataProvider, testId);
				
		}

}



