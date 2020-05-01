package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.Dynamic_28543;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_Dynamic_28543 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  Dynamic_28543 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException, InterruptedException {
					
		PRWebapproval = new Dynamic_28543(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		PRWebapproval.approval(testDataProvider, testId);
				
		}
		}	

