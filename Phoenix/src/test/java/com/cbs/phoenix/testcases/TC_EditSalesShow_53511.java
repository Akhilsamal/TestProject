package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.EditSalesShowPage_53511;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_EditSalesShow_53511 extends BaseTest{
	
	private String testId;
	private TestDataProvider testDataProvider;
	private EditSalesShowPage_53511  editshow_53511;	

	@Test
	public void TC_53511() {
				
		editshow_53511 = new EditSalesShowPage_53511(getDriver());
		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");
		
		testId = "TD_Phoenix_001.04";
		
		
		editshow_53511.editshowpage(testDataProvider, testId);

	}
	}