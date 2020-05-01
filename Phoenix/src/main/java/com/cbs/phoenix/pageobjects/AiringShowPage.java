package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 *
 */

public class AiringShowPage extends BasePage {
		
		@FindBy(xpath = "//a[@title='Inventory']/span")
		private WebElement Inventory;
		
		@FindBy(xpath = "//a[@title='Airings']") 
		private WebElement Airings;
		
		@FindBy(xpath ="//button[text()='Generate Airings']")
		private WebElement Generate_Airings;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[2]/div[1]/select")
		private WebElement dropdown;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[3]/div[1]/div/input")
		private WebElement daterange;
		
		@FindBy(xpath ="/html/body/div[5]/div[2]/div[1]/table/tbody/tr[3]/td[2]")
		private WebElement date;
		
		@FindBy(xpath ="/html/body/div[5]/div[4]/button[2]") 
		private WebElement applybtn;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[3]/div[2]/dow-selector/div/button[1]")
		private WebElement dayselection;
		
		@FindBy(xpath ="//span[contains(text(), 'Select a daypart')]")
		private WebElement daypart;
		
		@FindBy(xpath ="//a[contains(text(), 'Prime')]")
		private WebElement prime;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[4]/div[1]/div/input[1]")
		private WebElement starttime;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[4]/div[1]/div/input[2]")
		private WebElement endtime;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/form/div[4]/div[2]/input")
		private WebElement breaks;
		
		@FindBy(xpath ="/html/body/div[1]/div/div/airing-create/div[2]/div[1]/airing-loads/form/div/div[2]/div/div[1]/input")
		private WebElement load;
		
		@FindBy(name ="partnerNetwork")
		private WebElement partner;
		
		@FindBy(xpath = "//button[text()='Save']")
		private WebElement save;
		
		
		
		
		public AiringShowPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
			public void airingshowpage() {
				waitSleep(8);
				
				Inventory.click();
				waitSleep(8);
				
				Airings.click();
				waitSleep(8);
				
				Generate_Airings.click();
				waitSleep(5);

				dropdown.click();
				waitSleep(5);

				Select dd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-create/div[2]/form/div[2]/div[1]/select")));
				dd.selectByVisibleText("Show6");
				waitSleep(5);
				
				daterange.click();
				waitSleep(3);
				
				Actions actions = new Actions(driver);
				actions.doubleClick(date).perform();

				applybtn.click();
				waitSleep(7);

				starttime.sendKeys("10:00PM");
				waitSleep(3);
				
				endtime.sendKeys("10:30PM");
				waitSleep(3);
				
				breaks.sendKeys("2");
				waitSleep(5);
				
				load.clear();
				load.sendKeys("4");
				waitSleep(5);
					
				Select pn = new Select(driver.findElement(By.name("partnerNetwork")));
				pn.selectByVisibleText("CBS");
				waitSleep(5);
				
				daypart.click();
				waitSleep(5);
				
				prime.click();
				waitSleep(5);
				
				save.click();
				waitSleep(3);

		}
}

		
