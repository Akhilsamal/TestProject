package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.Notification_PartialOrderAORChangePage_43563;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_Notification_PartialOrderAORChange_43563 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  Notification_PartialOrderAORChangePage_43563 PRWebapproval;	
		
	@Test
	public void TC_Notification() throws IOException {
					
		PRWebapproval = new Notification_PartialOrderAORChangePage_43563(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix1.xlsx");
			
		testId = "Sheet";
			
		PRWebapproval.approval(testDataProvider, testId);
				
		}
		}	
