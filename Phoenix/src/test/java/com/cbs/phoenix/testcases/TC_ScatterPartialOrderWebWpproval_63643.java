package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.ScatterPartialOrderWebApprovalPage_63643;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_ScatterPartialOrderWebWpproval_63643 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  ScatterPartialOrderWebApprovalPage_63643 PRWebapproval3;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval3 = new ScatterPartialOrderWebApprovalPage_63643(getDriver());
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		PRWebapproval3.approval3(testDataProvider, testId);
				
		}
		}	
