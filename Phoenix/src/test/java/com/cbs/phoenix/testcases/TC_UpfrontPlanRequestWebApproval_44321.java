package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.UpfrontPlanRequestWebApprovalPage_44321;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_UpfrontPlanRequestWebApproval_44321 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  UpfrontPlanRequestWebApprovalPage_44321 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval = new UpfrontPlanRequestWebApprovalPage_44321(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}
		}	

