package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringShowPage;

public class TC_AiringShow extends BaseTest{
private AiringShowPage AiringShow;	
	@Test
	public void NewAiringShowPage_TC() {
		
		AiringShow = new AiringShowPage(getDriver());
		
		AiringShow.airingshowpage();
	}
}