package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.ScatterHoldWebApprovalPage_44325;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_ScatterHoldWebApproval_44325 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  ScatterHoldWebApprovalPage_44325 PRWebapproval1;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval1 = new ScatterHoldWebApprovalPage_44325(getDriver());
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
			
		PRWebapproval1.approval1(testDataProvider, testId);
				
		}
		}	