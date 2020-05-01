package com.cbs.phoenix.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.AiringMove_Move_ReplaceAiring_28544;
import com.cbs.phoenix.utilities.TestDataProvider;


public class TC_MoveAiring_28544 extends BaseTest{
		
	private String testId;
	private TestDataProvider testDataProvider;
	private  AiringMove_Move_ReplaceAiring_28544 MoveAiring;	
		
	@Test
	public void TC_Notification() throws IOException, InterruptedException {
					
		MoveAiring = new AiringMove_Move_ReplaceAiring_28544(getDriver());
		testDataProvider = new TestDataProvider("src/main/resources/TestData/TD_Phoenix.xlsx");
			
		testId = "Dynamic";
		
		MoveAiring.move(testDataProvider, testId);
				
		}
}	