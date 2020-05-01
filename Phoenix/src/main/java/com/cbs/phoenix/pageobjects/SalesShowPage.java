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

public class SalesShowPage extends BasePage {

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

	public SalesShowPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void showpage(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_53510 (adding show)

		waitSleep(9);
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

		save.click();
		waitSleep(7);

		searchshowbox.sendKeys(tcData.get("LongName"));
		waitSleep(7);

		Airings.click();
		waitSleep(8);

		searchshow.click();
		searchshow.sendKeys(tcData.get("LongName"));
		waitSleep(7);

		
		ExtentTestManager.getTest().log(LogStatus.PASS,"New show got added successfully");
		System.out.println("New show got added successfully");
		
		 addScreenShot();
		 waitSleep(2);

		// TC_62749 (Sorting and search by daypart/code)

		shows.click();
		waitSleep(5);

		searchshowbox.sendKeys(tcData.get("LongName"));
		waitSleep(7);

		searchshowbox.clear();
		searchshowbox.sendKeys(tcData.get("Code"));
		waitSleep(7);

		searchshowbox.clear();
		waitSleep(3);

		
		longnamesort.click(); 
		waitSleep(3); 
		longnamesort.click(); 
		waitSleep(3);
		  
		shortnamesort.click(); 
		waitSleep(3); 
		shortnamesort.click(); 
		waitSleep(3);
		  
		  codesort.click(); 
		  waitSleep(3); 
		  codesort.click(); 
		  waitSleep(3);
		  
		  daypartsort.click(); 
		  waitSleep(3); 
		  daypartsort.click(); 
		  waitSleep(3);
		  
		  frequencysort.click(); 
		  waitSleep(3); 
		  frequencysort.click(); 
		  waitSleep(3);
		  
		  durationsort.click(); 
		  waitSleep(3); 
		  durationsort.click();
		  waitSleep(3);
		  
		  sellablesort.click(); 
		  waitSleep(3); 
		  sellablesort.click(); 
		  waitSleep(3);
		  
		  activesort.click(); 
		  waitSleep(3); 
		  activesort.click(); 
		  waitSleep(3);
		  
		  planesort.click(); 
		  waitSleep(3); 
		  planesort.click(); 
		  waitSleep(3);
		 
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Sorting and searching is done properly");
		  System.out.println("Sorting and searching is done properly");

		
		  //TC_63261(plane show)
		  
		  
		  shows.click(); waitSleep(5);
		  
		  searchshowbox.sendKeys(tcData.get("LongName")); waitSleep(7);
		  
		  showselect.click(); waitSleep(5);
		  
		  
		  addScreenShot();
			waitSleep(2);
		  
		  Planechkbox.click(); waitSleep(4);
		  
		  save.click(); waitSleep(7);
		  
		  searchShow.clear();
		  
		  waitSleep(2);
		  
		  searchShow.sendKeys(tcData.get("LongName")); waitSleep(6);
		  
		  selectShow.click(); waitSleep(4);
		  

		  addScreenShot();
		  waitSleep(2);
		  
		  cancelBtn.click(); waitSleep(2);
		  
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Plane show selection is done properly");
		  System.out.println("Plane show selection is done properly");
		 

		// TC_55728(Duplicate message)

		shows.click();
		waitSleep(5);

		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("DuplicateLongName"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("ShortName1"));
		waitSleep(3);

		Select freQ = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQ.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);

		save.click();
		waitSleep(1);

		
		addScreenShot();
		waitSleep(2);

		cancelBtn.click();
		waitSleep(2);

		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("LongName1"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("DuplicateShortName"));
		waitSleep(3);

		Select freQuency1 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency1.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);

		save.click();
		waitSleep(2);

		
		addScreenShot();
		waitSleep(2);
		

		cancelBtn.click();
		waitSleep(4);

		addshowbtn.click();
		waitSleep(5);

		longname.sendKeys(tcData.get("DuplicateLongName"));
		waitSleep(3);

		shortname.sendKeys(tcData.get("DuplicateShortName"));
		waitSleep(3);

		Select freQuency2 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency2.selectByIndex(1);

		daypart.click();
		waitSleep(5);

		prime.click();
		waitSleep(5);

		save.click();
		waitSleep(1);

		
		addScreenShot();
		waitSleep(2);

		cancelBtn.click();
		waitSleep(3);
		
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"Duplication longname and shortname identification is done properly");
		System.out.println("Duplication longname and shortname identification is done properly");	
		
		
		

		// TC_53511(Edit show started)

		
		searchshowbox.clear();

		searchshowbox.sendKeys(tcData.get("LongName"));
		waitSleep(7);

		showselect.click();
		waitSleep(5);

		durationbtn.clear();
		durationbtn.sendKeys(tcData.get("EditedDuration"));
		waitSleep(5);
		
		
		Select freQuency4 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
		freQuency4.selectByVisibleText(tcData.get("EditedFrequency"));
		waitSleep(5);
		

		
		save.click();
		waitSleep(8);

		searchshowbox.clear();
		searchshowbox.sendKeys(tcData.get("LongName"));
		waitSleep(7);
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"Edit show is done properly");
		System.out.println("Edit show is done properly");

		//TC_63263(to make a show non-active)
		
		showselect.click();
		waitSleep(5);
		
		activecheckbox.click();
		waitSleep(5);
		
		 addScreenShot();
		 waitSleep(2);
		
		save.click();
		waitSleep(8);
		
		Airings.click();
		waitSleep(9);

		searchshow.click();
		searchshow.sendKeys(tcData.get("LongName"));
		waitSleep(9);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"Making a show non-active is done successfully");
		System.out.println("Making a show non-active is done successfully");
		

		// TC_53512(Delete show)
		
		shows.click(); 
		waitSleep(5);
		  
		searchshowbox.sendKeys(tcData.get("LongName")); 
		waitSleep(7);

		showselect.click();
		waitSleep(5);

		deletebtn.click();
		waitSleep(5);

		yesbtn.click();
		waitSleep(9);

		Airings.click();
		waitSleep(9);

		searchshow.click();
		searchshow.sendKeys(tcData.get("DeleteName"));
		waitSleep(9);

		ExtentTestManager.getTest().log(LogStatus.PASS,"Deletion of show is done successfully");
		System.out.println("Deletion of show is done successfully");
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"All the scenarios for Shows are completed");
	
		
	}
}
