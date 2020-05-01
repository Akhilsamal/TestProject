package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringGeneratePage_50175;
import com.cbs.phoenix.pageobjects.PreemptAiringPage_47753;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringGenerate_50175 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringGeneratePage_50175 MoveAiring;	
		
	@Test
	public void TC_50175() throws IOException, InterruptedException {
					
		MoveAiring = new AiringGeneratePage_50175(getDriver());
		//JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		//executor.executeScript("document.body.style.zoom = '0.85'"); 
		 
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Sheet";
		
		MoveAiring.movedispose(testDataProvider, testId);
				
		}

}
