/**
 * 
 */
package com.cbs.phoenix.testcases;

import com.cbs.phoenix.pageobjects.CreateDealPage;

/**
 * 
 *
 */
public class TC_Create_Deal extends BaseTest{
	
	CreateDealPage createDeal = new CreateDealPage(getDriver());
	
	private String testId;
	
	public void TC_Create_Deal() {
		
		testId = "TD_CBS_001.01";
		
		//createDeal.generateDealId(testDataProvider, testId);
		
	}

}
