package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringReplaceSplitPage_27960;
import com.cbs.phoenix.pageobjects.AiringSplitPage_27960;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringSplit_27960 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringSplitPage_27960 Pr;	
		
	@Test
	public void TC_Notification() throws IOException, InterruptedException {
					
		Pr = new AiringSplitPage_27960(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix1.xlsx");
			
		testId = "Dynamic";
		
		Pr.replace(testDataProvider, testId);
				
		}



}
