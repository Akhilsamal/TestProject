package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringMove_Move_ReplaceAiring_28544;
import com.cbs.phoenix.pageobjects.PreemptAiring_MultishowPage_47753;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_PreemptAiring_47753 extends BaseTest {
	
	private String testId;
	private TestDataProvider testDataProvider;
	private  PreemptAiring_MultishowPage_47753 MoveAiring;	
		
	@Test
	public void TC_47753() throws IOException, InterruptedException {
					
		MoveAiring = new PreemptAiring_MultishowPage_47753(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		MoveAiring.move(testDataProvider, testId);
				
		}

}
