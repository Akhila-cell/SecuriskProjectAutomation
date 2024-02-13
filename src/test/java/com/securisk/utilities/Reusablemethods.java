package com.securisk.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
		System.out.println("Screenshot captured successfully");
	}
 
	public String ScreenshotPath(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File loc = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"./Screenshots" + "/" + filename + System.currentTimeMillis() + ".png");
		Files.copy(loc, file);
		return file.getAbsolutePath();
	}
	public static void scrollUp(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        
    }
	public static void uploadFileWithRobot(String filePath) throws AWTException, InterruptedException {
        // Create a Robot instance
        Robot robot = new Robot();

        // Delay to give time for the file dialog to open
        Thread.sleep(2000);

        // Copy file path to clipboard
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate CTRL+V to paste file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate ENTER to confirm file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
	public static void uploadFileWithRobot6(String filepath) {
		// TODO Auto-generated method stub
		
	}
	public static void ScrollupRobot() throws AWTException {
		 Robot robot = new Robot();

         // Simulate pressing the PAGE_UP key
         robot.keyPress(KeyEvent.VK_PAGE_UP);
         robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	public static void Scrollupheight(WebDriver driver) {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// Scroll up by providing negative pixel values for vertical scroll
		js1.executeScript("window.scrollBy(0, -250);");
		
	}
	public static void mouseMoveoutsideWindow() {
		try {
            // Create a Robot object
            Robot robot = new Robot();

            // Simulate pressing the Escape key
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }}
	public void mouseMoveoutsideWindow1() {
		 try {
	            // Create Robot instance
	            Robot robot = new Robot();

	            // Set the coordinates for a point outside the window
	            int outsideX = 100;  // Change these coordinates as needed
	            int outsideY = 100;

	            // Move the mouse to the specified location
	            robot.mouseMove(outsideX, outsideY);

	            // Simulate a mouse click outside the window
	            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
		 
 

}}
