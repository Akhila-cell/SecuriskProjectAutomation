package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRfq_Renewal {
	 private WebDriver driver;
	 private WebDriverWait wait;

	public AddRfq_Renewal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(css = "flt-semantics[aria-label='RFQ']")
	// @FindBy(id ="flt-semantic-node-173")
	private WebElement RFQ;

	public void ClickonRFQ() {
		//WaitUntilElementVisible(RFQ);
		//RFQ.isEnabled();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", RFQ);
		//RFQ.click();
	}
	@FindBy(css="flt-semantics[aria-label='Create RFQ']")
	private  WebElement createRFQ;
	public void clickcreateRFq() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createRFQ);
		//Thread.sleep(2000);
		//RFQ.click();
		//movestatus.click()
	}
	@FindBy(css="flt-semantics[aria-label='------Select Product Category------']")
	private  WebElement productcategory;
	public void selectproductcategory() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", productcategory);
		Thread.sleep(2000);
		//RFQ.click();
		//movestatus.click()
	}
	public boolean displayproductcategory() {
		productcategory.isDisplayed();
		return true;
		
	}
	@FindBy(css="flt-semantics[aria-label='EB']")
	private WebElement selectEB;
	public void setEB() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", selectEB);
		Thread.sleep(2000);
	}
	@FindBy(css="flt-semantics[aria-label='------Select Product type------']")
	private WebElement producttype;
	public void selectproducType() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", producttype);
		Thread.sleep(2000);	
		
	}
	@FindBy(css="flt-semantics[aria-label='Group Health Insurance (GHI)']")
	private WebElement selectGHI;
	public void setGHI() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", selectGHI);
		Thread.sleep(2000);	
		
	}
	@FindBy(css="flt-semantics[aria-label='------Select Policy Type------']")
	private WebElement policyType;
	public void selectPolicyType() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", policyType);
		Thread.sleep(2000);	
		
	}
	@FindBy(css="flt-semantics[aria-label='Renewal']")
	private WebElement selectRenewal;
	public void setRenewal() throws InterruptedException {
		selectRenewal.click();	
		Thread.sleep(2000);	
	}
	@FindBy(css="flt-semantics[aria-label='Submit']")
	private WebElement submitbtn;
	public void clicksubmitRfq() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submitbtn);
		Thread.sleep(2000);	
	}
	@FindBy(css="input[aria-label='Name of Insured/Proposer']")
	private WebElement nameOfInsured;
	public void setNameOfInsured(String name) throws InterruptedException {
		nameOfInsured.sendKeys(name);
		Thread.sleep(2000);
		}
	public boolean nameOfInsureddisplayed() {
		nameOfInsured.isDisplayed();
		return true;
		
	}
	
	
	
	
	

}
