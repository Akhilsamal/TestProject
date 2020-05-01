package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.PreemptAiringPage_47753;
import com.cbs.phoenix.pageobjects.PreemptAiring_MultishowPage_47753;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_Preempt_47753 extends BaseTest {
	private String testId;
	private TestDataProvider testDataProvider;
	private  PreemptAiringPage_47753 MoveAiring;	
		
	@Test
	public void TC_47753() throws IOException, InterruptedException {
					
		MoveAiring = new PreemptAiringPage_47753(getDriver());
		//JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		//executor.executeScript("document.body.style.zoom = '0.85'"); 
		 
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		MoveAiring.movedispose(testDataProvider, testId);
				
		}


}
