package com.securisk.utilities;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class Reusablemethods {
	WebDriver driver;
	public Reusablemethods(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void back1()
	{
		driver.navigate().back();
	}
	public void forward1()
	{
		driver.navigate().forward();
	}
	public void minimize1()
	{
		driver.manage().window().maximize();
	}
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void Scrollup()
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_UP);
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-1000)");
		System.out.println("Scroll");
	}
	
	public void Screenshot(WebDriver driver,String Screenname) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshots"+Screenname+".png");
		Files.copy(src, trg);
//		System.out.println("Screenshot captured successfully");
	}
 
	public String ScreenshotPath(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File loc = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"./Screenshots" + "/" + filename + System.currentTimeMillis() + ".png");
		Files.copy(loc, file);
		return file.getAbsolutePath();
	}
	
	public void doubleClickText(WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element);
	}
 

}
