package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringDisposePage_29133;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringDispose_29133 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringDisposePage_29133 PRWebapproval;	
		
	@Test
	public void TC_29133() throws IOException, InterruptedException {
					
		PRWebapproval = new AiringDisposePage_29133(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		PRWebapproval.movedispose(testDataProvider, testId);
				
		}

}
