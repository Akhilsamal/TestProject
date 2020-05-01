package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.ChangeRequestDoOver_44991;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_ChangeRequestDoOver_44991 extends BaseTest {
	private ChangeRequestDoOver_44991 chgReqDoOver_44991;
	private String testId;
	private TestDataProvider testDataProvider;
	/*
	 * Before running this test case see that proper OrderNum is present in excel sheet
	 */
	@Test
	public void TC_44991() throws IOException {

		chgReqDoOver_44991 = new ChangeRequestDoOver_44991(getDriver());

		testDataProvider = new TestDataProvider(
				System.getProperty("user.dir") + "/src/main/resources/TestData/TD_Phoenix.xlsx");

		testId = "Sheet";

		chgReqDoOver_44991.chgRequestDoOver(testDataProvider, testId);
	}	
}