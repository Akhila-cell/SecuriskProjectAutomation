package com.securisk.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coveragedetailspage {
	WebDriver driver;
	public Coveragedetailspage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#flt-semantic-node-449")
	public WebElement clickonPloicyType;
	
	
	public void clickOnPolicyType() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("arguments[0].scrollIntoView();", clickonPloicyType);
	       
		Thread.sleep(2000);
		clickonPloicyType.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='Floater']")
	public WebElement floater;

	public void select_Floater() throws InterruptedException {
		
		 floater.click();
	}
	
	@FindBy(xpath ="//*[@aria-label='------Family Defination------']")
	public WebElement clickonfamilydefination;

	public void familyDefination_click() throws InterruptedException {
		
				clickonfamilydefination.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='Varied']")
	public WebElement selectvariedinFD;

	public void familyDefination_Varied() throws InterruptedException {
		
		selectvariedinFD.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='------Sum Insured-------']")
	public WebElement Clickonsuminsured;

	public void sumInsured_Click() throws InterruptedException {
		
		Clickonsuminsured.click();
	}
	@FindBy(xpath = "(//*[@aria-label='Varied'])[1]")
	public WebElement selectvariedinSI;

	public void sumInsured_Varied() throws InterruptedException {
		
		selectvariedinSI.click();
	}
	
	@FindBy(css = "#flt-semantic-node-489")
	public WebElement selectFD;

	public void select_Fd() throws InterruptedException {

		selectFD.click();
	}

	// @FindBy(xpath="(//*[@aria-label='Sum Insured'])[2]")
	// @FindBy(css="#flt-semantic-node-527 > input")
	@FindBy(xpath = "(//*[@aria-label=\"Sum Insured\"])[2]")
	public WebElement enterSumI;

	public void Enter_SI(String enterSI) throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) this.driver;
//		js.executeScript("arguments[0].click()", enterSumI);
//		Thread.sleep(3000);
		enterSumI.sendKeys(enterSI);
	}
	
	
	@FindBy(css="#flt-semantic-node-453")
	public WebElement Ihave_employeedata;

	public void clickonihave_employeedata() throws InterruptedException {
		
		Ihave_employeedata.click();
	}

	@FindBy(css="#flt-semantic-node-500")
	public WebElement employeedependentdata;

	public void clickon_employeedependentdata() throws InterruptedException {
		
		employeedependentdata.click();
	}
	
	public void upload_EDD() throws AWTException
	{
		Robot rb = new Robot();
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\as22118\\Downloads\\Allcombination_collaborate 1.xlsx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	 }

	@FindBy(xpath ="//*[@aria-label='Upload']")
	public WebElement uploadbutton;

	public void clickon_Uploadbutton() throws InterruptedException {
		
		uploadbutton.click();
	}
	//*[@id='flt-semantic-node-1224']
	@FindBy(css ="#flt-semantic-node-519")
	public WebElement Eyeicon;

	public void clickoneyeicon() throws InterruptedException, AWTException {
		Thread.sleep(10000);
		Eyeicon.click();
		Thread.sleep(2000);
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_ESCAPE);
		rb1.keyRelease(KeyEvent.VK_ESCAPE);           
	}

	@FindBy(xpath ="//*[@aria-label='NEXT']")
	public WebElement Clickonnextbutton;
	
	public void nextbutton_Coveagedetails() {
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Clickonnextbutton);
		
	}
	
	
}
