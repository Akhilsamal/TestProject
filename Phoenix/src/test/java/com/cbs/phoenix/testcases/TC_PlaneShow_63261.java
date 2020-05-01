package com.cbs.phoenix.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.SelectPlaneShow_63261;
import com.cbs.phoenix.utilities.TestDataProvider;

public class TC_PlaneShow_63261 extends BaseTest {

	private SelectPlaneShow_63261 AddShow;

	private String testId;
	private TestDataProvider testDataProvider;

	@Test
	public void TC_AddShow() throws IOException {

		AddShow = new SelectPlaneShow_63261(getDriver());

		testDataProvider = new TestDataProvider("resources/TestData/TD_Phoenix.xlsx");

		testId = "SHOWS";

		AddShow.addsearchshow(testDataProvider, testId);

	}

}
