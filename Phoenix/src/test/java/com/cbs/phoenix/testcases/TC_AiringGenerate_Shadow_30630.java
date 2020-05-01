package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringGeneratePage_50175;
import com.cbs.phoenix.pageobjects.AiringGenerate_ShadowPage_30630;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringGenerate_Shadow_30630 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringGenerate_ShadowPage_30630 ag;	
		
	@Test
	public void TC_30630() throws IOException, InterruptedException {
					
		ag = new AiringGenerate_ShadowPage_30630(getDriver());
		//JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		//executor.executeScript("document.body.style.zoom = '0.85'"); 
		 
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		ag.airgenerate(testDataProvider, testId);
				
		}

}
