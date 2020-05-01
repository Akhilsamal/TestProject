/**
 * 
 */
package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 *
 */
public class NewBroadCastItemPage extends BasePage {
	
	@FindBy(xpath = "//a[@title='Data']")
	private WebElement dataLink;
	
	@FindBy(xpath= "//a[@title='Broadcast Items']")
	private WebElement broadcastLink;
	
	@FindBy(xpath= "//a[contains(.,'New Broadcast Item')]")
	private WebElement newBroadCastLinkBtn;
	
	@FindBy(xpath= "//input[@name='adId']")
	private WebElement adIdTxt;
	
	@FindBy(xpath= "//select[@name='duration']")
	private WebElement durationSelect;
	
	@FindBy(xpath= "//input[@name='title']")
	private WebElement titleTxt;
	
	@FindBy(xpath= "//span[contains(text(),'Select Sponsor')]")
	private WebElement sponsorSelect;
	
	@FindBy(xpath= "//button[text()='Manage']")
	private WebElement manageBtn;
	
	@FindBy(xpath= "//div[contains(@class,'modal-dialog')]")
	private WebElement manageDialogBox;
	
	@FindBy(xpath= "//a[contains(text(),'Product')]")
	private WebElement createProductLink;
	
	@FindBy(xpath= "//input[@name='productName']")
	private WebElement productName;
	
	@FindBy(xpath= "//span[contains(text(),'Select an Industry')]")
	private WebElement industrySelect;
	
	@FindBy(xpath= "//a[contains(text(),'Beverages')]")
	private WebElement beverages;
	
	@FindBy(xpath= "//a[contains(text(),'Non-Alcoholic')]")
	private WebElement nonAlcoholic;
	
	@FindBy(xpath= "//button[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath= "//button[text()='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(xpath= "//input[@placeholder='Search Ad-Id']")
	private WebElement searchAdId;
	
	@FindBy(xpath= "//button[text()='Advanced Search']")
	private WebElement advancedSearch;
	
	@FindBy(xpath= "//label[contains(text(),'Ad ID')]/../input")
	private WebElement adIDSearchTxt;
	
	@FindBy(xpath= "//button[@class='btn btn-icon btn-sm btn-secondary']")
	private WebElement searchBtn;
	
	public NewBroadCastItemPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void addBroadCastItem() {
		
		waitSleep(3);
		
		dataLink.click();
		
		broadcastLink.click();
		
		waitSleep(3);
		
		newBroadCastLinkBtn.click();
		
		waitSleep(1);
		
		adIdTxt.sendKeys("Amul");
		
		Select durationDropDown= new Select(durationSelect);
		
		durationDropDown.selectByValue("6");
		
		titleTxt.sendKeys("For Testing Demo");
		
		//sponsorSelect.click();
		
		String searchTxt= "Nima";
		
		searchBox(sponsorSelect,searchTxt);
		
		waitSleep(3);
		
		manageBtn.click();
		
		waitSleep(1);
		
		createProductLink.click();
		
		waitSleep(2);
		
		productName.sendKeys("Butter");
		
		waitSleep(1);
		
		
		waitSleep(1);
		
		searchBox(industrySelect,"Beverages");
		
		nonAlcoholic.click();
		
		saveBtn.submit();
		
		
	}

}
