package com.securisk.testcases;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.securisk.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig Rc = new ReadConfig();
	public String url = Rc.AppURL();
	public String username = Rc.EnterUser();
	public String pwd = Rc.EnterPwd();
	public static ExtentReports reports;
	public static ExtentTest test;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public BaseClass(WebDriver driver, WebDriverWait wait) {
		BaseClass.driver = driver;
		BaseClass.wait = wait;
	}

	public void WaitUntilElementVisible(WebElement element) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.visibilityOf(element));
	}

	@BeforeSuite

	public void setup() throws InterruptedException {
		
		
		WebDriverManager.chromedriver( ).setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origin=*");
		driver = new ChromeDriver(op);
		driver.get(url);
//		System.out.println("Browser Launched");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"document.querySelector('flt-glass-pane').shadowRoot.querySelector('flt-semantics-placeholder').click({force: true});");
	}
	
	public void startReport(String filename) {
		reports = new ExtentReports("./Reports/"+filename+".html");
	}
	public void endReport() {
		reports.endTest(test);
	}

	@AfterSuite
	public void teardown() {
		//driver.close();;
		// reports.endTest(test);
		reports.flush();
	}

}
