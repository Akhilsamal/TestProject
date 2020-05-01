/**
 * 
 */
package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.NewBroadCastItemPage;

/**
 * 
 *
 */
public class TC_NewBroadCastItemPageTest extends BaseTest {
	
	private NewBroadCastItemPage broadCastItemPage;
	
	@Test
	public void Create_BroadCast_Item_TC() {
		
		broadCastItemPage= new NewBroadCastItemPage(getDriver());
		
		broadCastItemPage.addBroadCastItem();
		
	}

}
