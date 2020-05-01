package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.ScatterOrderWebApprovalPage_44326;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_ScatterOrderWebApproval_44326 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  ScatterOrderWebApprovalPage_44326 PRWebapproval2;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval2 = new ScatterOrderWebApprovalPage_44326(getDriver());
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		PRWebapproval2.approval2(testDataProvider, testId);
				
		}
		}	
