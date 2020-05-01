package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringSchedulePage_61361;
import com.cbs.phoenix.pageobjects.BasePage;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class TC_AiringSchedule_61361 extends BaseTest {
	private AiringSchedulePage_61361 AiringSchedule_61361;

	@Test(priority = 1)
	
	// Navigations on Airing  schedule page
	
	
	public void TC_61361() throws IOException {
		
		BasePage pg =new BasePage(driver);
		try{
  
		AiringSchedule_61361 = new AiringSchedulePage_61361(getDriver());
		
		  AiringSchedule_61361.clickAiringduration();
		  
		  AiringSchedule_61361.customrange();
		
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.removeprimetime();
		  
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.removescheduleairing();
		  
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.arrowclick();
		  
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.viewdetailsairing();
		  
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.maxmin();
		  
		  AiringSchedule_61361.heightscroll();
		  
		  AiringSchedule_61361.pagerefresh();
		  
		  AiringSchedule_61361.airingsettingoptions();	 
		
		}
		
		catch(Exception e) {
			
		ExtentTestManager.getTest().log(LogStatus.FAIL,e.getMessage());		
		pg.Failedscreenshot();
		}
	}

}