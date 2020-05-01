package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewBroadCastItemPage_A extends BasePage {

	@FindBy(xpath = "//span[text()='Data']")
	private WebElement dataLink;

	@FindBy(xpath = "//a[text()='Broadcast Items']")
	private WebElement broadcastItemsLink;

	@FindBy(xpath = "//a[contains(text(),'New Broadcast Item')]")
	private WebElement newBroadcastItembtn;

	@FindBy(xpath = "//input[@name='adId']")
	private WebElement adIdTxt;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement titleTxt;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sponsor'])[1]/following::div[2]")
	private WebElement sponsor;

	@FindBy(xpath = "//input[@id='searchText']")
	private WebElement sponsorTxt;

	@FindBy(linkText = "NimaSponsor")
	private WebElement selectsponsorLink;

	@FindBy(name = "product")
	private WebElement productSelect;

	@FindBy(name = "product")
	private Select productdropdown;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createbtn;

	@FindBy(xpath = "//h3[@class='m-0 ng-binding']")
	private WebElement checkBroadcastlabel;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement savebtn;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Ad ID'])[1]/following::input[1]")
	private WebElement searchADIDTxt;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Actual Duration'])[1]/following::button[1]")
	private WebElement searchbtn;

	public NewBroadCastItemPage_A(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	//Add and save Broadcast
	public void AddSaveBroadCast() {

		dataLink.click();

		waitSleep(3);

		broadcastItemsLink.click();

		waitSleep(5);

		newBroadcastItembtn.click();

		waitSleep(3);

		adIdTxt.sendKeys("UTSK");

		waitSleep(3);

		titleTxt.sendKeys("Show");

		waitSleep(3);

		sponsor.click();

		waitSleep(4);

		sponsorTxt.sendKeys("NimaSponsor");

		waitSleep(4);

		selectsponsorLink.click();

		waitSleep(3);

		productSelect.click();

		waitSleep(3);

		productSelect.sendKeys(Keys.DOWN, Keys.ENTER);

		waitSleep(2);

		createbtn.click();

		waitSleep(10);

		savebtn.click();

		waitSleep(5);

	}
	
	

	//Search the Newly added Broadcast
	public void SearchBroadcast() throws InterruptedException {

		String ActBroadcast = checkBroadcastlabel.getText();

		broadcastItemsLink.click();

		waitSleep(5);

		searchADIDTxt.sendKeys(ActBroadcast);

		waitSleep(5);

		searchbtn.click();

		waitSleep(5);

	}
	
	

	//Get the actual added Broadcast
	public String VerifyBroadCast() {
		return checkBroadcastlabel.getText();
	}

}
