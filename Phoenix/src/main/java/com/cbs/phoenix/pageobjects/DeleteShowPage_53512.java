package com.cbs.phoenix.pageobjects;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cbs.phoenix.utilities.TestDataProvider;

public class DeleteShowPage_53512 extends BasePage {
				
	@FindBy(xpath = "//a[@title='Inventory']/span")
	private WebElement Inventory;
			
	@FindBy(xpath = "//a[@title='Airings']") 
	private WebElement Airings;
			
	@FindBy(xpath = "//a[@title='Shows']")
	private WebElement shows;	

	@FindBy(name = "shows")
	private WebElement searchshow;	
	
	@FindBy(xpath = "//input[@id=\"p_show\"]")
	private WebElement searchshowbox;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/show-search/div/div[3]/table/tbody/tr[2]/td[1]")
	private WebElement showselect;
	
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deletebtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesbtn;
		
	
	private HashMap<String, String> tcData;
			
	
	public DeleteShowPage_53512(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);		
				}
						
	public void deleteshowpage(TestDataProvider testDataProvider, String testId) {
				
			tcData = testDataProvider.readData(testId);
				
				waitSleep(9);
				Inventory.click();
				waitSleep(8);
	
				shows.click();
				waitSleep(5);
				
				searchshowbox.sendKeys(tcData.get("LongName"));
				waitSleep(7);
							
				showselect.click();
				waitSleep(5);
									
				deletebtn.click();
				waitSleep(5);
				
				yesbtn.click();
				waitSleep(8);

				Airings.click();
				waitSleep(8);
					
				searchshow.click();
				searchshow.sendKeys(tcData.get("LongName"));
				waitSleep(7);
				
}
}