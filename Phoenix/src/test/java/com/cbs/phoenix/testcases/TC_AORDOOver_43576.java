package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AORDOOverPage_43576;

import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AORDOOver_43576 extends BaseTest{

	private String testId;
	private TestDataProvider testDataProvider;
	private  AORDOOverPage_43576 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval = new AORDOOverPage_43576(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		PRWebapproval.approval(testDataProvider, testId);
				
		}
}
