package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AiringMoves_ReplacePage_27951 extends BasePage {
		
		@FindBy(xpath = "//span[text()='Airing Schedule']")
		private WebElement airingschedule;	
		
		@FindBy(xpath = "//a[text()='Only Scheduled, TPT']")
		private WebElement schedulestab;
		
		@FindBy(xpath = "//button[text()='None']")
		private WebElement nonebtn;	
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/div/ul/li[1]/div")
		private WebElement schedulebtn;	
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")
		private WebElement textbox;
				
		@FindBy(xpath = "//li[text()='Custom Range']")
		private WebElement custom ;
		
		@FindBy(xpath = "//td[text()='26']")
		private WebElement startdate ;
		
		@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[5]")
		private WebElement enddate ;
		
		@FindBy(xpath = "//button[text()='Cancel']")
		private WebElement cancel ;
		
		@FindBy(xpath = "//button[text()='Apply']")
		private WebElement apply ;
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/div/ul/li[4]/div/label")
		private WebElement standbybtn ;
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/a")
		private WebElement dropdown2  ;
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/div/div/button[1]")
		private WebElement all2btn;	
		
		
		
		
		
		
		public AiringMoves_ReplacePage_27951(WebDriver driver) {
			
			super(driver);
			PageFactory.initElements(driver, this);
	}


		public void replaceairing() {
			waitSleep(8);	
			
			airingschedule.click();
			waitSleep(5);
			
			textbox.click();
			waitSleep(4);
			
			custom.click();
			waitSleep(10);
				
			startdate.click();
			waitSleep(5);
			
			enddate.click();
			waitSleep(7);
			
			apply.click();
			waitSleep(10);		
			
			schedulestab.click();
			waitSleep(5);
			
			nonebtn.click();
			waitSleep(5);
			
			schedulebtn.click();
			waitSleep(4);
			
			standbybtn.click();
			waitSleep(4);
						
			dropdown2.click();
			waitSleep(5);
			
			all2btn.click();
			waitSleep(8);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
		}
}
