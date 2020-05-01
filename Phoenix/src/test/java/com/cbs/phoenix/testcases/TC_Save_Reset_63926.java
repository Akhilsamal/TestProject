package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;
import com.cbs.phoenix.pageobjects.Save_ResetPage_63926;


	public class TC_Save_Reset_63926 extends BaseTest{
		private Save_ResetPage_63926  CustomizedPage_63926;	

		@Test
		public void TC_63926() {
			
			CustomizedPage_63926 = new Save_ResetPage_63926(getDriver());
			
					
			CustomizedPage_63926.SaveStatusSetting();
			CustomizedPage_63926.pagerefresh();	
			CustomizedPage_63926.ResetbtnSetting();
}
}