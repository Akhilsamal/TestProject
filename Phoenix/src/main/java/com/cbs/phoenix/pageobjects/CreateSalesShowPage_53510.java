package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class CreateSalesShowPage_53510 extends BasePage{
	
	public CreateSalesShowPage_53510(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath = "//a[@title='Inventory']/span")
	private WebElement Inventory;

	@FindBy(xpath = "//a[@title='Airings']")
	private WebElement Airings;

	@FindBy(xpath = "//a[@title='Shows']")
	private WebElement shows;

	@FindBy(name = "shows")
	private WebElement searchshow;

	@FindBy(xpath = "//button[text()='Add Show']")
	private WebElement addshowbtn;

	@FindBy(xpath = "/html/body/div[1]/div/div/show-edit/div[2]/div/div[2]/div[2]/phoenix-dropdown/div/div[1]/span")
	private WebElement daypart;

	@FindBy(xpath = "//input[@name='longName']")
	private WebElement longname;

	@FindBy(xpath = "//input[@name='shortName']")
	private WebElement shortname;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save;

	@FindBy(xpath = "//input[@id=\"p_show\"]")
	private WebElement searchshowbox;

	@FindBy(xpath = "//a[contains(text(), 'Prime')]")
	private WebElement prime;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/show-search/div/div[3]/table/tbody/tr[2]/td[1]")
	private WebElement showselect;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deletebtn;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesbtn;

	@FindBy(xpath = "/html/body/div[1]/div/div/show-edit/div[1]/h3")
	private WebElement showname;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelBtn;

	@FindBy(id = "p_show")
	private WebElement searchShow;

	@FindBy(xpath = "//td[@class='ng-binding']")
	private WebElement selectShow;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[1]/preceding::i[1]")
	private WebElement Planechkbox;
		
	@FindBy(xpath = "/html/body/div[1]/div/div/show-edit/div[2]/div/div[3]/div[2]/input")
	private WebElement durationbtn;	

	@FindBy(xpath = "//th[contains(text(),'Long name')]")
	private WebElement longnamesort;

	@FindBy(xpath = "//th[contains(text(),'Short Name')]")
	private WebElement shortnamesort;

	@FindBy(xpath = "//th[contains(text(),'Code')]")
	private WebElement codesort;

	@FindBy(xpath = "//th[contains(text(),'Daypart')]")
	private WebElement daypartsort;

	@FindBy(xpath = "//th[contains(text(),'Frequency')]")
	private WebElement frequencysort;

	@FindBy(xpath = "//th[contains(text(),'Duration')]")
	private WebElement durationsort;

	@FindBy(xpath = "//th[contains(text(),'Sellable')]")
	private WebElement sellablesort;

	@FindBy(xpath = "//th[contains(text(),'Active')]")
	private WebElement activesort;

	@FindBy(xpath = "//th[contains(text(),'Plane')]")
	private WebElement planesort;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/show-edit/div[2]/div/div[4]/div[2]/label[2]")
	private WebElement activecheckbox;
	
	

	private HashMap<String, String> tcData;

	

	public void showpage(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_53510 (adding show)

		waitSleep(9);
		ExtentTestManager.getTest().log(LogStatus.INFO," TestCase Description: Web Sales show_To create new sales show on web ");
		Inventory.click();
		waitSleep(8);

		shows.click();
		waitSleep(5);

		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("LongName"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("ShortName"));
		waitSleep(3);

		daypart.click();
		waitSleep(2);

		prime.click();
		waitSleep(5);

		Select freQuency = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency.selectByVisibleText(tcData.get("Frequency"));
		waitSleep(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Show parameters provided  successfully ");		
		addScreenShot();
		waitSleep(5);
		save.click();
		waitSleep(7);

		searchshowbox.sendKeys(tcData.get("LongName"));
		waitSleep(7);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  SearchShow reflected  successfully ");		
		addScreenShot();

		Airings.click();
		waitSleep(8);

		searchshow.click();
		waitSleep(4);
		searchshow.sendKeys(tcData.get("LongName"));
		waitSleep(7);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  SearchShow is shown successfully in the dropdown  in Airing Page ");		
		addScreenShot();
		
	}

}
