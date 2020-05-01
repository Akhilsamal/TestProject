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

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

//Prerequisite to run : pick the 2 shows and provide the date , time and select the day in move screen 


public class AiringmovedisposePage_29133updated extends BasePage {



	public AiringmovedisposePage_29133updated(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);// TODO Auto-generated constructor stub
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

	@FindBy(xpath = "(//input[@type='date'])[3]")
	private WebElement startdate;

	@FindBy(xpath = "//input[@type='time']")
	private WebElement start_time;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement end_time;

	@FindBy(xpath = "(//a[contains(text(),'Clear')])[2]")
	private WebElement Clear;
	
	
	 //public static final String Day = "F" ;
	
//	String Day= tcData.get("SelectDay");
	final String Day= "F";
	
	//public static final String Day = Day1 ;
	
//	constant Day = "Sa";
	 
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='"+Day+"'])[2]")
	//@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='F'])[2]")
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
	
	@FindBy(xpath ="//div[2]/label/i")
	private WebElement disposeUnitschkbox;
	
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	
	
	@FindBy(xpath ="(//a[contains(text(),'Units for a Show Report')])[2]")
	private WebElement unitforshowreportlink;
	
	@FindBy(id = "mainReportViewer_ctl04_ctl11_ddValue")
	private WebElement Show;
	
	
	
	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;
		
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;
	
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
	
	
	
	
	//a[contains(text(),'Units for a Show Report')])[2]
	
	/*
	 * /html/body/div[1]/div/div/airing-moves/div[2]/div/div[2]/div[2]/div[2]/label/
	 * input
	 */

	public void movedispose(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

		tcData = testDataProvider.readData(testId);		
		 	 

		  waitSleep(9);
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserbtn.click(); 
		  waitSleep(5);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys("Rader"); 
		  waitSleep(6);
		  select.click(); 
		  waitSleep(6);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Logged in with Inventory Management ");
		 
		
		// Click on airing schedule , select day time and select next week 
		  
		  
		  
		  
		  
		  driver.findElement(By.xpath("//div/div/div/ul/li[2]/a/i")).click();
		  
		  
		  
		  
		  
		  
		  
		

		waitSleep(5);
		airingschedule.click();
		waitSleep(10);

		// Identify 1st show ---Require dynamic concept

		//WebElement firstshow = driver.findElement(By.xpath("//*[@id=\"sched\"]/div[2]/ul/li[2]/ul/li[16]/div"));
		
		
		
		
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
		  
		  waitSleep(4); builder.contextClick().build().perform(); waitSleep(3);
		  viewdetails.click();
		  
		  waitSleep(4);
		  
		  
		  
		  File screenshotFile1stshow = ((TakesScreenshot)
		  driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(screenshotFile1stshow, new
		  File("D:\\screenshot\\" + "Details  premove" + System.currentTimeMillis() + ".png"));
		  
		  System.out.println(xint); System.out.println(yint);
		  
		  String s = viewtotalPreMove.getText(); String total1 =
		  s.replaceAll("[^0-9?!\\.]", ""); int totalshow1 = Integer.parseInt(total1);
		  System.out.println("Total Premove:" + totalshow1);
		  
		  builder.sendKeys(Keys.ESCAPE).build().perform();
		  
		 // waitSleep(4);
		  
		  //driver.navigate().refresh();
		  
		  //waitSleep(5); 
		  
		 // driver.findElement(By.xpath("//span[text()='Deals']")).click();
		  waitSleep(5);
		 // airingschedule.click();
		 // waitSleep(5);
		 

				
			  ///////
			  

		// Identify 2nd show (destination show)-----Require dynamic concept

		//WebElement secondshow = driver.findElement(By.xpath("//*[@id=\"sched\"]/div[2]/ul/li[3]/ul/li[15]/div"));
		
		  //String UserShowInput = "MAGNUM P.I.";//input show name 
		  //String UserDateInput = "12/20/2019"; //input show date 
		  //String UserTimeInput = "9:00 PM"; //input show time
		
		 String UserShowInput1, UserDateInput1, UserTimeInput1; 
		  UserShowInput1 = tcData.get("UserShowInput2");//input show name 
		  UserDateInput1 = tcData.get("UserDateInput2"); //input show date 
		  UserTimeInput1 = tcData.get("UserTimeInput2"); //input show time
		 		 
		 System.out.println(UserShowInput1);
		 System.out.println(UserDateInput1);
		 System.out.println(UserTimeInput1);
				 	
			  
		String Time_Hour12 = UserTimeInput1.split(" ")[0];
		String Time_AMPM12 = UserTimeInput1.split(" ")[1];
		Time_Hour12 = Time_Hour12.split(":")[0];
			  
		System.out.println(Time_AMPM12);
		System.out.println(Time_Hour12);
			  
		  
		waitSleep(4); 
		  
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  
		  WebDriverWait wait2 = new WebDriverWait(driver, 30); Function<WebDriver,
		  Boolean> jQueryAvailable1 = WebDriver -> ((Boolean)
		  js1.executeScript("return (typeof jQuery != \"undefined\")"));
		  wait2.until(jQueryAvailable1);
		  
		  String Xjs11 = "x"; String Yjs11 = "y"; String Cjs11 = ";"; String MyStringjs11 =
		  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
		  "var airing = angular.element(el).scope().airing;" + "return {" +
		  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
		  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
		  "}).find(function (x) { return x.name === \""+UserShowInput1+"\" && x.date === \""
		  +UserDateInput1+"\" && x.time === \""+UserTimeInput1+"\" });" + "return map123.rect.";
		  
		  
		  Object x_axis1, y_axis1; 
		  
		  System.out.println(MyStringjs11+Xjs11+Cjs11);
		 System.out.println(MyStringjs11+Yjs11+Cjs11);
		  
		  x_axis1 = js1.executeScript(MyStringjs11+Xjs11+Cjs11); 
		  y_axis1  = js1.executeScript(MyStringjs11+Yjs11+Cjs11);
		  
		  System.out.println(x_axis1); 
		  System.out.println(y_axis1);
		  
		  String X_NEW11 = x_axis1.toString(); 
		  String Y_NEW11 = y_axis1.toString(); 
		  String X_NEW111; 
		  String Y_NEW111;
		  
		  if (X_NEW11.contains("."))
		  { 
			  X_NEW111= X_NEW11.split("\\.")[0]; 
			  } 
		  else 
		  { 
			  X_NEW111 =X_NEW11.split(" ")[0]; 
			  }
		  
		  if (Y_NEW11.contains("."))
		  { 
			  Y_NEW111 = Y_NEW11.split("\\.")[0]; 
			  } 
		  else 
		  { 
			  Y_NEW111 =  Y_NEW11.split(" ")[0]; 
			  }
		  
		  int xint11=Integer.parseInt(X_NEW111); 
		  int yint11=Integer.parseInt(Y_NEW111);
		  
		  waitSleep(3); 
		System.out.println(xint11);
		System.out.println(yint11);
		
		//Actions builder = new Actions(driver);
		  
		  builder.moveByOffset(-xint,-yint).click().build().perform();
		  
		  waitSleep(2);
		  
		  builder.moveByOffset(xint11,yint11).click().build().perform();
		  
		  waitSleep(4);
		  builder.contextClick().build().perform();
		  
		  waitSleep(4);
		  

		

		//builder.sendKeys(Keys.ESCAPE).build().perform();

		waitSleep(4);

		// Take the details for 2nd show

		
		
		waitSleep(4);

		viewdetails.click();

		Thread.sleep(5000);

		File screenshotFile2ndshow = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile2ndshow,
				new File("D:\\screenshot\\" + "Details premove" + System.currentTimeMillis() + ".png"));

		// String t
		// =driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")).getText();
		String t = viewtotalPreMove.getText();
		String total2 = t.replaceAll("[^0-9?!\\.]", "");
		int totalshow2 = Integer.parseInt(total2);
		System.out.println("Total Premove:" + totalshow2);

		int expTotal = totalshow1 + totalshow2;

	System.out.println("Expected Total :" + expTotal);

		builder.sendKeys(Keys.ESCAPE).build().perform();

		waitSleep(4);

		// Pick the 1st show and move
		builder.moveByOffset(-xint11,-yint11).click().build().perform();
		waitSleep(2);
		  builder.moveByOffset(xint,yint).click().build().perform();
		  
		 
		  
		 

		waitSleep(4);
		builder.contextClick().build().perform();

		waitSleep(4);
		
		//// a[text()='Airing Move']

		Thread.sleep(2000);
		builder.moveToElement(AiringMove).build().perform();

		waitSleep(4);

		Move.click();

		waitSleep(4);

		startdate.sendKeys(tcData.get("MoveStartDate"));

		waitSleep(3);
		
		start_time.sendKeys(tcData.get("MoveStartTime"));

		waitSleep(3);
		end_time.sendKeys(tcData.get("MoveEndTime"));
		//driver.findElement(By.xpath("//input[@type='time']")).sendKeys("8.30");
		waitSleep(3);
		//driver.findElement(By.xpath("(//input[@type='time'])[2]")).sendKeys("9");

		waitSleep(3);

		 System.out.println(tcData.get("MoveStartDate"));

		

		// waitSleep(3);
		 System.out.println(tcData.get("MoveStartTime"));

		

		// waitSleep(3);
		 System.out.println(tcData.get("MoveEndTime"));
		 waitSleep(3);
		Clear.click();
		waitSleep(3);

		 SelectDay.click();

		// Click on the day .
		//driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Th'])[2]")).click();
		waitSleep(3);

		Next.click();
		waitSleep(5);
		Yes.click();
		waitSleep(5);

		disposeUnitschkbox.click();

		// driver.findElement(By.xpath("//input[@name='disposeUnits']")).click();
		waitSleep(5);		
		Execute.click();
		waitSleep(58);
		
		//driver.findElement(By.xpath("//span[text()='Deals']")).click();
		
		//waitSleep(5);
		//driver.navigate().refresh();
		waitSleep(6);
		//airingschedule.click();
		
		//waitSleep(5);

		// Open the moved show
		builder.moveByOffset(-xint,-yint).click().build().perform();
		waitSleep(2);
		builder.moveByOffset(xint11,yint11).click().build().perform();
		waitSleep(2);
		 
		//builder.moveToElement(secondshow).build().perform();
		waitSleep(3);
		builder.contextClick().build().perform();
		waitSleep(3);

		viewdetails.click();

		waitSleep(3);
		File screenshotFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile3,
				new File("D:\\screenshot\\" + "Details PostMove" + System.currentTimeMillis() + ".png"));

		
		// String t4
		// =driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")).getText();

		String t4 = viewtotalPreMove.getText();
		String total3 = t4.replaceAll("[^0-9?!\\.]", "");
		int actualTotal = Integer.parseInt(total3);
		System.out.println("Total Postmove:" + actualTotal);

		
		  if (actualTotal == expTotal) { System.out.println("passed"); }
		 

		builder.sendKeys(Keys.ESCAPE).build().perform();

		waitSleep(4);


		// Reports-Move

		ReportingLink.click();
		waitSleep(4);

		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1100)", "");

		waitSleep(3);

		AiringMovesReport.click();

		waitSleep(3);

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

		Save.click();
		waitSleep(10);
		
		//Reports- show report 
		
		ReportingLink.click();
		waitSleep(4);
		serachreportpanel.click();
		waitSleep(2);
		serachreportpanel.sendKeys("unit for a show report");
		waitSleep(5);
		JavascriptExecutor jsw = (JavascriptExecutor)driver;
		 jsw.executeScript("window.scrollBy(0,1100)", "");
		 
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
		 
		 Show.sendKeys("MOM");
		// driver.findElement(By.id("mainReportViewer_ctl04_ctl11_ddValue")).sendKeys("ALL RISE");
		 
	
		 Thread.sleep(3000);
		Save.click();
		waitSleep(5);
		 
		 //Thread.sleep(3000);
		 
	}

}
