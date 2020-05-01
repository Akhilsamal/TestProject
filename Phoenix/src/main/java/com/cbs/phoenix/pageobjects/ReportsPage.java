package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsPage extends BasePage{
	


	public ReportsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[1]/phoenix-nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement notification;

	@FindBy(xpath = "//span[contains(text(),'Approvals')]")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals...']")
	private WebElement searchapprovals;

	@FindBy(xpath = "//input[@placeholder='Search notifications']")
	private WebElement searchnotifications;

	@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
	private WebElement switchuserbtn;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;

	@FindBy(xpath = "//span[contains(text(),'Planner_Dropdown')]")
	private WebElement selectdvp;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement searchapprovals1;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/a[1]/div[2]")
	private WebElement selectdeal;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-sm']")
	private WebElement clickRejectbtn;

	@FindBy(xpath = "//button[contains(text(),'Comments')]")
	private WebElement commenttab;

	@FindBy(xpath = "//textarea[@placeholder='Enter comments...']")
	private WebElement comments;

	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement searchdeal;

	@FindBy(xpath = "//a[@class='nav-link py-0 ng-binding active']")
	private WebElement CR;

	@FindBy(xpath = "//a[@class='nav-link ng-binding ng-scope active']")
	private WebElement verificationCR;

	@FindBy(xpath = "(//a[contains(text(),'Order')])[5]")
	private WebElement OrderLink;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement ChangeRequest;

	@FindBy(xpath = "//span[text()='Reporting']")
	private WebElement ReportingLink;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	
	@FindBy(id = "btnSave")
	private WebElement Save;

	private HashMap<String, String> tcData;

	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		

		ExtentTestManager.getTest().log(LogStatus.INFO, " Creating Airing History Report");

		waitSleep(9);
		////Reports
		
	//// Reports
		
			////Airing History Report

			ReportingLink.click();
			waitSleep(4);
			serachreportpanel.click();
			waitSleep(2);
			serachreportpanel.sendKeys("Airing History");
			waitSleep(8);
			JavascriptExecutor jsw = (JavascriptExecutor) driver;
			jsw.executeScript("window.scrollBy(0,600)", "");
			waitSleep(6);
			ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing History ");
			addScreenShot();
			driver.findElement(By.xpath("//strong")).click();
			waitSleep(10);
			

			driver.switchTo().frame(0);
			

			driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("3/2/2020");

			waitSleep(5);
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).click();
			waitSleep(5);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).sendKeys("Daytime");

			waitSleep(5);		
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).click();
			waitSleep(5);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).sendKeys("LET'S MAKE A DEAL 1");
			waitSleep(5);
			
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			waitSleep(6);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			waitSleep(6);


			driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
			waitSleep(3);
			//*[@id="mainReportViewer_ToggleParam_img"]

			ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing History Report screen ");
			addScreenShot();

			waitSleep(3);
			//driver.switchTo().defaultContent();
			waitSleep(5);

			//JavascriptExecutor jsx = (JavascriptExecutor) driver;
			//jsw.executeScript("window.scrollBy(0,800)", "");
			
			
			waitSleep(4);
			//addScreenShot();

		   Save.click();
			waitSleep(15);


	////Sponsor Dispose Report
			
			ReportingLink.click();
			waitSleep(4);
			serachreportpanel.click();
			waitSleep(2);
			serachreportpanel.sendKeys("Sponsor Disposition");
			waitSleep(8);
			JavascriptExecutor jsx = (JavascriptExecutor) driver;
			jsx.executeScript("window.scrollBy(0,600)", "");
			waitSleep(6);
			ExtentTestManager.getTest().log(LogStatus.PASS, "  Search for Sponsor Dispose ");
			addScreenShot();
			driver.findElement(By.xpath("//strong")).click();
			waitSleep(10);
			

			driver.switchTo().frame(0);
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).clear();
			waitSleep(5);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("3/2/2020");

			waitSleep(5);
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
			waitSleep(5);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
			
			waitSleep(5);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).sendKeys("3/2/2020");
			waitSleep(5);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).click();
			waitSleep(5);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).sendKeys("Daytime");

			waitSleep(5);		
			
			//driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).click();
			//waitSleep(5);
			
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl11_txtValue")).click();
			waitSleep(5);
			
			driver.findElement(By.xpath("//label[text()='(Select All)']")).click();
			waitSleep(5);
			
			driver.findElement(By.xpath("//*[@id='mainReportViewer_ctl04_ctl11_divDropDown']/span/div[1]/span/table/tbody/tr[3]/td/span/label")).click();
			waitSleep(5);	
		
					
			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			waitSleep(6);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			waitSleep(6);


			driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
			waitSleep(3);
			//*[@id="mainReportViewer_ToggleParam_img"]

			ExtentTestManager.getTest().log(LogStatus.PASS, "   Sponsor Dispose ");
			addScreenShot();

			waitSleep(3);
			//driver.switchTo().defaultContent();
			waitSleep(5);

			//JavascriptExecutor jsx = (JavascriptExecutor) driver;
			//jsw.executeScript("window.scrollBy(0,800)", "");
			
			
			waitSleep(4);
			//addScreenShot();

		   Save.click();
		   waitSleep(15);



	///////

	////Avails Report
			
				ReportingLink.click();
				waitSleep(4);
				serachreportpanel.click();
				waitSleep(2);
				serachreportpanel.sendKeys("Avails");
				waitSleep(8);
				JavascriptExecutor jsy = (JavascriptExecutor) driver;
				jsy.executeScript("window.scrollBy(0,500)", "");
				waitSleep(6);
				ExtentTestManager.getTest().log(LogStatus.PASS, "  Search for Avails ");
				addScreenShot();
				driver.findElement(By.xpath("//strong")).click();
				waitSleep(10);
				

				driver.switchTo().frame(0);
				
				driver.findElement(By.id("mainReportViewer_ctl04_ctl15_txtValue")).clear();
				waitSleep(5);

				driver.findElement(By.id("mainReportViewer_ctl04_ctl15_txtValue")).sendKeys("3/2/2020");

				waitSleep(5);
				
				driver.findElement(By.id("mainReportViewer_ctl04_ctl17_txtValue")).clear();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl17_txtValue")).clear();
				
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl17_txtValue")).sendKeys("3/2/2020");
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl19_ddValue")).click();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl19_ddValue")).sendKeys("Daytime");
				waitSleep(5);
						
				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);

				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);


				driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
				waitSleep(3);
				//*[@id="mainReportViewer_ToggleParam_img"]

				ExtentTestManager.getTest().log(LogStatus.PASS, "   Avails Report ");
				addScreenShot();
				waitSleep(5);		

			    Save.click();
			    waitSleep(15);
			   

	
		   
		   
		////Unit show  Report
			
				ReportingLink.click();
				waitSleep(4);
				serachreportpanel.click();
				waitSleep(2);
				serachreportpanel.sendKeys("Units for a Show");
				waitSleep(8);
				JavascriptExecutor jsz = (JavascriptExecutor) driver;
				jsz.executeScript("window.scrollBy(0,500)", "");
				waitSleep(6);
				ExtentTestManager.getTest().log(LogStatus.PASS, "  Units for a Show ");
				addScreenShot();
				driver.findElement(By.xpath("//strong")).click();
				waitSleep(10);
				

				driver.switchTo().frame(0);
				
				
				
				driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).clear();
				waitSleep(5);

				driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("2/28/2020");

				waitSleep(5);
				
				driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
				
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).sendKeys("3/2/2020");				
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl11_ddValue")).click();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl11_ddValue")).sendKeys("LET'S MAKE A DEAL 1");

				waitSleep(5);
				
						
				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);

				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);


				driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
				waitSleep(3);
				//*[@id="mainReportViewer_ToggleParam_img"]

				ExtentTestManager.getTest().log(LogStatus.PASS, "   Units for show Report ");
				addScreenShot();

				waitSleep(3);
				//driver.switchTo().defaultContent();
				waitSleep(5);

				//JavascriptExecutor jsx = (JavascriptExecutor) driver;
				//jsw.executeScript("window.scrollBy(0,800)", "");
				
				
				waitSleep(4);
				//addScreenShot();

			   Save.click();
			   waitSleep(15);
		   
	   
	   
	   
	 

	}


}
