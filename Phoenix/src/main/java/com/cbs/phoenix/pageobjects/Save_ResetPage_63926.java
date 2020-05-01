package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Save_ResetPage_63926 extends BasePage {
	
	@FindBy(xpath = "//span[text()='Airing Schedule']")
	private WebElement airingschedule;
	
	@FindBy(xpath = "//span[text()='Deals']")
	private WebElement deals;
	
	@FindBy(xpath = "//a[text()='Only Scheduled, TPT']")
	private WebElement schedulestab;
	
	@FindBy(xpath = "//button[text()='None']")
	private WebElement nonebtn;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/div/div/button[2]")
	private WebElement none2btn;	

	@FindBy(xpath = "//button[text()='All']")
	private WebElement allbtn;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/div/div/button[1]")
	private WebElement all2btn;	
		
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/div/ul/li[1]/div")
	private WebElement schedulebtn;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/div/ul/li[9]/div/label")
	private WebElement replacebtn;	
	
	@FindBy(xpath = "//a[text()='All Dayparts']")
	private WebElement alldaypart ;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/ul/li[3]/div[1]/label")
	private WebElement daytime ;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/ul/li[4]/div[1]/label")
	private WebElement latenight ;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/ul/li[6]/div[1]/label")
	private WebElement prime ;
	
	@FindBy(xpath = "//i[@class='ft-settings']")
	private WebElement settingbtn  ;
	
	@FindBy(xpath = "//button[text()='Save Settings']")
	private WebElement savesettingbtn  ;
	
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElement resetbtn  ;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[2]/div/div[1]/button[2]")
	private WebElement resetsettingbtn  ;
	
	@FindBy(xpath = "//button[text()='No']")
	private WebElement nobtn  ;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesbtn  ;
	
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElement Resetbtn; 
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/a")
	private WebElement dropdown1  ;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/a")
	private WebElement dropdown2  ;
	
	
	
	public Save_ResetPage_63926(WebDriver driver) {
	
			super(driver);
			PageFactory.initElements(driver, this);
	}


		public void SaveStatusSetting() {
			waitSleep(8);
			
			airingschedule.click();
			waitSleep(5);
			
			schedulestab.click();
			waitSleep(5);
			
			nonebtn.click();
			waitSleep(3);
			
			schedulebtn.click();
			waitSleep(2);
			
			replacebtn.click();
			waitSleep(2);
			
			alldaypart.click();
			waitSleep(5);
			
			none2btn.click();
			waitSleep(3);
			
			daytime.click();
			waitSleep(2);
			
			latenight.click();
			waitSleep(2);
			
			prime.click();
			waitSleep(5);
			
			settingbtn.click();
			waitSleep(4);
			
			savesettingbtn.click();
			waitSleep(8);
						
			deals.click();
			waitSleep(5);
			
			airingschedule.click();
			waitSleep(5);
			
			
			//First VERIFICATION Point//

					
			
			String exp1 = "Only Scheduled, Replaced";
			String exp2 = "Only Daytime, Late Night, Prime";
			
			String actual1 =dropdown1.getText();
			String actual2 =dropdown2.getText();
			
			if (actual1.equals(exp1) && actual2.equals(exp2))
				
			{
				System.out.println("*****PASSED : Settings are saved successfully****");
			}
			else
				
			{
				System.out.println("*****FAILED : Settings are not saved****");
			}

			
		}
			
			public void ResetbtnSetting() {
				waitSleep(8);
			
				dropdown1.click();
				waitSleep(4);
			
				allbtn.click();
				waitSleep(4);
			
				dropdown2.click();
				waitSleep(4);
				
				all2btn.click();
				waitSleep(5);
				
				resetbtn.click();
				waitSleep(6);
				
							
				//Second VERIFICATION Point//
				
				
				String exp3 = "Only Scheduled, Replaced";
				String exp4 = "Only Daytime, Late Night, Prime";
				
				String actual3 =dropdown1.getText();
				String actual4 =dropdown2.getText();
				
				if (actual3.equals(exp3) && actual4.equals(exp4))
					
				{
					System.out.println("*****PASSED : Reset functionality is working properly****");
				}
				else
					
				{
					System.out.println("*****FAILED : Reset functionality is not working properly****");
				}
				
				
				settingbtn.click();
				waitSleep(5);
				
				resetsettingbtn.click();
				waitSleep(5);
				
				nobtn.click();
				waitSleep(4);
				
				resetsettingbtn.click();
				waitSleep(5);
				
				yesbtn.click();
				waitSleep(8);
				

				
				
				//Third VERIFICATION Point//
				
				
				String exp5 = "Only Scheduled, TPT";
				String exp6 = "All Dayparts";
				
				String actual5 =dropdown1.getText();
				String actual6 =dropdown2.getText();
				
				if (actual5.equals(exp5) && actual6.equals(exp6))
					
				{
					System.out.println("******PASSED : Reset functionality in Settings TAB is working properly*****");
				}
				else
					
				{
					System.out.println("****FAILED : Reset functionality in Settings TAB is not working properly****");
				}
					}
			
			
		
			public void pagerefresh() {
					
					waitSleep(4);
					Resetbtn.click();
					waitSleep(4);
					
				}		
}
