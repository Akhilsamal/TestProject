package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.DeleteShowPage_53512;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_DeleteShow_53512 extends BaseTest{
	
	private String testId;
	private TestDataProvider testDataProvider;
	private DeleteShowPage_53512  deletshow_53512;	

	@Test
	public void TC_53512() {
				
		deletshow_53512 = new DeleteShowPage_53512(getDriver());
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
		
		testId = "TD_Phoenix_001.05";
			
		deletshow_53512.deleteshowpage(testDataProvider, testId);

	}
	}	
