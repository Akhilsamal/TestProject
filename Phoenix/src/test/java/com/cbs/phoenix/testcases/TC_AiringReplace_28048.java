package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.Airing_ReplacePage_28048;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_AiringReplace_28048 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  Airing_ReplacePage_28048 replace;	
		
	@Test
	public void TC_28048() throws IOException, InterruptedException {
					
		replace = new Airing_ReplacePage_28048(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		replace.move(testDataProvider, testId);
				
		}

}
