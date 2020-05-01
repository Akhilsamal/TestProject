package com.cbs.phoenix.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AiringReplaceSplitPage_27960 extends BasePage {

	public AiringReplaceSplitPage_27960(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	private HashMap<String, String> tcData;

	@FindBy(xpath = "//span[text()='Airing Schedule']")
	private WebElement airingschedule;

	@FindBy(xpath = "//a[text()='View Details']")
	private WebElement viewdetails;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[4]")
	private WebElement viewLoadPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[2]")
	private WebElement viewCommercialPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[3]")
	private WebElement viewavailPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")
	private WebElement viewtotalPreMove;

	@FindBy(xpath = "//a[text()='Airing Move']")
	private WebElement AiringMove;

	@FindBy(xpath = "//a[text()='Move']")
	private WebElement Move;

	@FindBy(xpath = "//a[text()='Replace']")
	private WebElement Replace;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	private WebElement startdate;

	@FindBy(xpath = "//input[@type='time']")
	private WebElement start_time;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement end_time;

	@FindBy(xpath = "(//a[contains(text(),'Clear')])[2]")
	private WebElement Clear;

	// public static final String Day = "F" ;

//	String Day= tcData.get("SelectDay");
	final String Day = "F";

	// public static final String Day = Day1 ;

//	constant Day = "Sa";

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='" + Day + "'])[2]")
	// @FindBy(xpath = "(.//*[normalize-space(text()) and
	// normalize-space(.)='F'])[2]")
	private WebElement SelectDay;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement Next;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves-confirm/div[3]/div/div/button[1]")
	private WebElement Yes;

	@FindBy(xpath = "//button[text()='Execute']")
	private WebElement Execute;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='BLUE BLOODS'])[1]")
	private WebElement ShowMoved;

	@FindBy(xpath = "//span[text()='Reporting']")
	private WebElement ReportingLink;

	@FindBy(xpath = "(//a[contains(text(),'Airing Moves Report')])[2]")
	private WebElement AiringMovesReport;

	@FindBy(id = "mainReportViewer_ctl04_ctl05_txtValue")
	private WebElement FromDateClick;

	@FindBy(id = "mainReportViewer_ctl04_ctl07_txtValue")
	private WebElement ToDateClick;

	@FindBy(id = "mainReportViewer_ctl04_ctl03_txtValue")
	private WebElement FromDateClickshow;

	@FindBy(id = "mainReportViewer_ctl04_ctl05_txtValue")
	private WebElement ToDateClickshow;

	@FindBy(id = "btnSave")
	private WebElement Save;

	/*
	 * @FindBy(xpath = "//input[@name='disposeUnits']") private WebElement
	 * disposeUnitschkbox;
	 */

	@FindBy(xpath = "//div[2]/label/i")
	private WebElement disposeUnitschkbox;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;

	@FindBy(xpath = "(//a[contains(text(),'Units for a Show Report')])[2]")
	private WebElement unitforshowreportlink;

	@FindBy(id = "mainReportViewer_ctl04_ctl11_ddValue")
	private WebElement Show;

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
	private WebElement switchuserbtn;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;

	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;

	@FindBy(xpath = "//select[@name='shows']")
	private WebElement Selectshow1;

	@FindBy(xpath = "(//select[@name='shows'])[2]")
	private WebElement Selectshow2;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement EndTime;

	@FindBy(name = "showLoad")
	private WebElement Load1;

	@FindBy(name = "showBreaks")
	private WebElement Breaks1;

	@FindBy(xpath = "//label/i")
	private WebElement preempt;

	@FindBy(xpath = "//a[2]/i")
	private WebElement Add;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[1]/td[4]/select")
	private WebElement ReplaceUnit1;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[2]/td[4]/select")
	private WebElement ReplaceUnit2;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[3]/td[5]/label/i")
	private WebElement PreemptUnit1;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[4]/td[5]/label/i")
	private WebElement PreemptUnit2;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	private WebElement deal;

	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement SearchDeal;

	@FindBy(xpath = "(//a[contains(text(),'Order')])[5]")
	private WebElement OrderLink;

	@FindBy(xpath = "(//a[text()='Order Details'])[2]")
	private WebElement OrderdetailsLink;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement CR;

	public void replace(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

		tcData = testDataProvider.readData(testId);

		waitSleep(5);

		waitSleep(9);
		userlogin.click();
		waitSleep(5);

		switchuserbtn.click();
		waitSleep(5);

		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Inventory Management"));
		waitSleep(6);
		select.click();
		waitSleep(6);

		
		  airingschedule.click(); waitSleep(10);
		  
		  // Identify 1st show ---Require dynamic concept
		  
		
		  
	///////-1st show 

				  //String UserShowInput = "MAGNUM P.I.";//input show name 
				  //String UserDateInput = "12/20/2019"; //input show date 
				  //String UserTimeInput = "9:00 PM"; //input show time
				
			
			  String UserShowInput, UserDateInput, UserTimeInput; 
			  UserShowInput= tcData.get("UserShowInput");//input show name 
			  UserDateInput = tcData.get("UserDateInput"); //input show date 
			  UserTimeInput = tcData.get("UserTimeInput"); //input show time
			  
			  System.out.println(UserShowInput); 
			  System.out.println(UserDateInput);
			  System.out.println(UserTimeInput);
			  
			  
			  String Time_Hour = UserTimeInput.split(" ")[0]; String Time_AMPM =
			  UserTimeInput.split(" ")[1]; Time_Hour = Time_Hour.split(":")[0];
			  
			  System.out.println(Time_AMPM); System.out.println(Time_Hour);
			  
			  
			  waitSleep(4);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  
			  WebDriverWait wait = new WebDriverWait(driver, 30); Function<WebDriver,
			  Boolean> jQueryAvailable = WebDriver -> ((Boolean)
			  js.executeScript("return (typeof jQuery != \"undefined\")"));
			  wait.until(jQueryAvailable);
			  
			  String Xjs = "x"; String Yjs = "y"; String Cjs = ";"; String MyStringjs =
			  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
			  "var airing = angular.element(el).scope().airing;" + "return {" +
			  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
			  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
			  "}).find(function (x) { return x.name === \""
			  +UserShowInput+"\" && x.date === \""
			  +UserDateInput+"\" && x.time === \""+UserTimeInput+"\" });" +
			  "return map123.rect.";
			  
			  
			  Object x_axis, y_axis;
			  
			  System.out.println(MyStringjs+Xjs+Cjs);
			  System.out.println(MyStringjs+Yjs+Cjs);
			  
			  x_axis = js.executeScript(MyStringjs+Xjs+Cjs); y_axis =
			  js.executeScript(MyStringjs+Yjs+Cjs);
			  
			  System.out.println(x_axis); System.out.println(y_axis);
			  
			  String X_NEW = x_axis.toString(); String Y_NEW = y_axis.toString(); String
			  X_NEW1; String Y_NEW1;
			  
			  if (X_NEW.contains(".")) { X_NEW1= X_NEW.split("\\.")[0]; } else { X_NEW1
			  =X_NEW.split(" ")[0]; }
			  
			  if (Y_NEW.contains(".")) { Y_NEW1 = Y_NEW.split("\\.")[0]; } else { Y_NEW1 =
			  Y_NEW.split(" ")[0]; }
			  
			  int xint=Integer.parseInt(X_NEW1); int yint=Integer.parseInt(Y_NEW1);
			  
			  waitSleep(3);
			  
			  Actions builder = new Actions(driver);
			  builder.moveByOffset(xint,yint).click().build().perform();
			  
			  waitSleep(4); 
			  builder.contextClick().build().perform(); 
			  waitSleep(3);
			  viewdetails.click();
			  
			  waitSleep(4);
		  
		  waitSleep(4);
		  
		  addScreenShot();
		  
		  File screenshotFile1stshow = ((TakesScreenshot)
		  driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshotFile1stshow, new
		  File("D:\\screenshot\\" + "Details  premove" + System.currentTimeMillis() + ".png"));
		  
		  System.out.println(xint); System.out.println(yint);
		  
		  String s = viewtotalPreMove.getText(); String total1 =
		  s.replaceAll("[^0-9?!\\.]", ""); int totalshow1 = Integer.parseInt(total1);
		  System.out.println("Total Premove:" + totalshow1);
		  
		  builder.sendKeys(Keys.ESCAPE).build().perform();
		  
		  waitSleep(4);
		  
		  builder.contextClick().build().perform();
		  
		  waitSleep(4);
		  
		  //// Replacing the airing with 2 shows ////////
		  builder.moveToElement(AiringMove).build().perform();
		  
		  waitSleep(4);
		  
		  Replace.click();
		  
		  waitSleep(12);
		  
		 
		  
		  Selectshow1.sendKeys("THE UNICORN");
		  
		  waitSleep(6);
		  
		  
		   EndTime.sendKeys("10.30");
		  
		  waitSleep(6);
		  
		  Load1.clear();
		  
		  
		
		  Load1.sendKeys("12"); 
		  waitSleep(4);
		  
		  Breaks1.clear();
		  
		  Breaks1.sendKeys("3"); waitSleep(4);
		  
		  Add.click();
		  
		  waitSleep(6);
		  
		  
		  
		  String LoadParent= driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/table/tbody/tr/td[4]")).getText();
		  
		  
		  String Breaksparent=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/table/tbody/tr/td[5]")).getText();
		  
		  int ParentLoad =Integer.parseInt(LoadParent);
		  
		  int ParentBreak =Integer.parseInt(Breaksparent);
		  
		  System.out.println(ParentLoad);
		  
		  System.out.println(ParentBreak);
		  
		  
		  
		  //String child1Load=driver.findElement(By.xpath( "/html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr[1]/td[4]/input")).getText();
		  
		 // String child2Load=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr[2]/td[4]/input")).getText();
		  
		  //html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr[1]/td[4]/input
		  
		  //html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr[2]/td[4]/input 
		  //int LoadChild1=Integer.parseInt(child1Load);
		  
		  
		 // int LoadChild2=Integer.parseInt(child2Load);
		  
		 // int actualLoad = LoadChild1+LoadChild2 ;
		  
		 // System.out.println(actualLoad);
		  
		  //Assert.assertEquals(actualLoad, ParentLoad); addScreenShot();
		  
		  
		  Selectshow2.sendKeys("3M OPEN");
		  
		  addScreenShot();
		  
		  waitSleep(3);
		  
		  
		  preempt.click();
		  
		  
		  waitSleep(3);
		  
		  addScreenShot();
		  
		  Next.click(); waitSleep(5); Yes.click(); waitSleep(5);
		  
		  //driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[1]/td[4]/select")).sendKeys("3M OPEN");
		  
		  ReplaceUnit1.sendKeys("3M OPEN");
		  
		  waitSleep(5);
		  
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[2]/td[4]/select" )).sendKeys("3M OPEN"); 
		  ReplaceUnit2.sendKeys("3M OPEN"); waitSleep(5);
		  
		  String Deal= driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[1]/td[2]")).getText(); 
		  System.out.println("Deal Id:"+Deal);
		  
		  //driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[3]/td[5]/label/i" )).click();
		  PreemptUnit1.click(); 
		  waitSleep(5);
		  //driver.findElement(By.xpath( "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[4]/td[5]/label/i" )).click();
		  PreemptUnit2.click(); 
		  waitSleep(5);
		  
		  addScreenShot();
		  
		  Execute.click();
		  waitSleep(58);
		 

		////// Need dynamic concept to pick both the shows/////////

		// Pick the show1 and do view details , take screenshot

		// Pick the show2 and do view details , take screenshot

		// AE will receive mail report
		////////////////

		// Search Deal

		deal.click();
		waitSleep(6);

		// SearchDeal.sendKeys(Deal);

		SearchDeal.sendKeys("38877");
		waitSleep(3);
		SearchDeal.sendKeys(Keys.ENTER);
		waitSleep(5);

		OrderLink.click();
		waitSleep(6);

		OrderdetailsLink.click();
		waitSleep(4);

		CR.click();
		waitSleep(4);

		String Status = driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[2]/div/deal-change-request-list/div/table/tbody/tr[1]/td[6]")).getText();
				
		System.out.println("Status is :" + Status);
		
		addScreenShot();
		
		
		// Reports-Move

		ReportingLink.click();
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Click on Report Link ");
		
		addScreenShot();
		waitSleep(4);

		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1100)", "");

		waitSleep(3);

		AiringMovesReport.click();

		waitSleep(6);

		driver.switchTo().frame(0);

		waitSleep(3);
		FromDateClick.clear();

		waitSleep(3);

		FromDateClick.sendKeys(tcData.get("MoveStartDate"));

		waitSleep(3);

		ToDateClick.click();

		waitSleep(3);

		ToDateClick.clear();

		waitSleep(2);

		ToDateClick.sendKeys(tcData.get("MoveStartDate"));

		waitSleep(3);
		
		driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
		
		waitSleep(10);
		
		
		
		
		
		driver.findElement(By.id("mainReportViewer_ToggleParam_img")).click();
		waitSleep(3);
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Moves Report ");
		addScreenShot();
		
/*
 * File screenshotFile1stshow =
 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 * FileHandler.copy(screenshotFile1stshow, new
 * File("D:\\screenshot\\"+"Report"+System.currentTimeMillis()+".png"));
 */
		
		

		Save.click();
		waitSleep(30);
		
		//Reports- show report 
		
		driver.switchTo().defaultContent();
		waitSleep(5);
		
	
		
		ReportingLink.click();
		waitSleep(4);
		serachreportpanel.click();
		waitSleep(2);
		serachreportpanel.sendKeys("unit for a show report");
		waitSleep(5);
		JavascriptExecutor jsw = (JavascriptExecutor)driver;
		 jsw.executeScript("window.scrollBy(0,1100)", "");
			waitSleep(6);
		 unitforshowreportlink.click();
		 
		 waitSleep(5);
		 
		 driver.switchTo().frame(0);
		 
		 FromDateClickshow.clear();	 
		
		 
		 waitSleep(5);
		 
		 FromDateClickshow.sendKeys(tcData.get("MoveStartDate"));	 
		 
		 
		 waitSleep(3);
		 
		 ToDateClickshow.click();
		 
		 
		 
		 waitSleep(3);
		 
		ToDateClickshow.clear();
		 
		waitSleep(3);
          
		ToDateClickshow.sendKeys(tcData.get("MoveStartDate"));  
		waitSleep(3);
		 
		 driver.findElement(By.id("mainReportViewer_ctl04_ctl11_ddValue")).click();
		 Show.click();
		 waitSleep(3);
		 
		 
		
		 
		 Show.sendKeys(tcData.get("UserShowInput"));
		 
		 
		// Show.sendKeys(tcData.get("MOM"));
		 
		 
		 
		 driver.findElement(By.xpath("//input[@value='View Report']")).click();
			
			waitSleep(10);
			
			
			
			
			
			driver.findElement(By.id("mainReportViewer_ToggleParam_img")).click();
			waitSleep(3);
		// driver.findElement(By.id("mainReportViewer_ctl04_ctl11_ddValue")).sendKeys("ALL RISE");
		 
		 waitSleep(5);
		
		Save.click();
		waitSleep(40);
		 
		
	

	}
}