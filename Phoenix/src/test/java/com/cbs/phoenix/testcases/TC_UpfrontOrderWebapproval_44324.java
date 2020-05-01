package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.UpfrontOrderWebapprovalpage_44324;

import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_UpfrontOrderWebapproval_44324 extends BaseTest {
	
	
	private String testId;
	private TestDataProvider testDataProvider;
	private   UpfrontOrderWebapprovalpage_44324 approve;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		approve = new UpfrontOrderWebapprovalpage_44324(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		approve.approval(testDataProvider, testId);
				
		}


}
