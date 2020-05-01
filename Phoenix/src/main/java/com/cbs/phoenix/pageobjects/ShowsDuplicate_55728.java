package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.utilities.TestDataProvider;

public class ShowsDuplicate_55728 extends BasePage {
	
	private HashMap<String, String> tcData;

	@FindBy(xpath = "//a[@title='Inventory']/span")
	private WebElement Inventory;

	@FindBy(xpath = "//a[@title='Shows']")
	private WebElement shows;

	@FindBy(xpath = "//button[text()='Add Show']")
	private WebElement addshowbtn;

	@FindBy(xpath = "//input[@name='longName']")
	private WebElement longname;

	@FindBy(xpath = "//input[@name='shortName']")
	private WebElement shortname;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save;

	@FindBy(id = "p_show")
	private WebElement searchShow;

	@FindBy(xpath = "//td[@class='ng-binding']")
	private WebElement selectShow;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[1]/preceding::i[1]")
	private WebElement Planechkbox;

	@FindBy(xpath = "//span[contains(text(), 'Select a daypart')]")
	private WebElement daypart;

	@FindBy(xpath = "//a[contains(text(), 'Prime')]")
	private WebElement prime;

	@FindBy(xpath = "/html/body/div[1]/div/div/show-edit/div[1]/h3")
	private WebElement showname;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelBtn;
	
	
	

	public ShowsDuplicate_55728(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void duplicateshow(TestDataProvider testDataProvider, String testId) throws IOException {
		
		tcData = testDataProvider.readData(testId);

		waitSleep(8);

		Inventory.click();
		waitSleep(8);

		shows.click();
		waitSleep(5);

		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("duplicatLongName"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("shortname1"));
		waitSleep(3);
		
		Select freQuency = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);			

		save.click();
		waitSleep(1);

		/*
		 * takeScreenshot("Duplicate long"); waitSleep(4);
		 */
		
		addScreenShot();
		waitSleep(2);
		
		
		cancelBtn.click();
		waitSleep(2);
		
		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("LongName1"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("duplicateShortName"));
		waitSleep(3);
		
		Select freQuency1 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency1.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);			

		save.click();
		waitSleep(2);
	
		/*
		 * takeScreenshot("Duplicate short"); waitSleep(4);
		 */
		
		addScreenShot();
		waitSleep(2);
		
		
		cancelBtn.click();
		waitSleep(4);
		
		
		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("duplicatLongName"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("duplicateShortName"));
		waitSleep(3);
		
		Select freQuency2 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency2.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);			

		save.click();
		waitSleep(1);

		/*
		 * takeScreenshot("Duplicate longshort"); waitSleep(3);
		 */
		
		addScreenShot();
		waitSleep(2);
		
		cancelBtn.click();
		waitSleep(3);
		
		
		
		


	}

}
