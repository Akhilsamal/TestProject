package com.cbs.phoenix.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.NewBroadCastItemPage_A;

public class TC_Create_Broadcast extends BaseTest {

	NewBroadCastItemPage_A newBroadCastItem;

	@Test
	public void AddBroadCast() throws InterruptedException {

		Thread.sleep(4000);

		newBroadCastItem = new NewBroadCastItemPage_A(getDriver());

		// Add and Save New BroadCast
		newBroadCastItem.AddSaveBroadCast();

		// Searching the newly added Broadcast
		newBroadCastItem.SearchBroadcast();

		String ExpectedBroadcast = "UTSK";

		// Verify newly added Broadcast with the expected one
		Assert.assertEquals(newBroadCastItem.VerifyBroadCast(), ExpectedBroadcast);
	}

}
