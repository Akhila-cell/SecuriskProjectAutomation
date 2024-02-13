package com.securisk.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CorporateDetails_Renewal {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CorporateDetails_Renewal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[aria-label='Name of Insured/Proposer']")
	private WebElement nameOfInsured;
	public void setNameOfInsured(String name) throws InterruptedException {
		nameOfInsured.sendKeys(name);
		Thread.sleep(2000);
		}
	@FindBy(css="input[aria-label='Address']")
	private WebElement address;
	public void setAddress(String addre) throws InterruptedException {
		address.sendKeys(addre);
		Thread.sleep(2000);
		
	}
	@FindBy(css="flt-semantics[aria-label='Nature of Business']")
	private WebElement natureOfBusiness;
	public void clickNatureOfBusiness() {
		natureOfBusiness.click();
	}
	@FindBy(css="flt-semantics[aria-label='Government']")
	private WebElement government;
	public void setGovernment() {
		government.click();
	}
	
	@FindBy(xpath ="(//input[@aria-label='Contact Name'])[2]")
	private WebElement contactName1;
	public void setContactName1(String name1) {
		contactName1.sendKeys(name1);
	}
	@FindBy(xpath ="(//input[@aria-label='Email Id'])[2]")
	private WebElement Email1;
	public void setEmail(String email1) {
		Email1.sendKeys(email1);
	}
	@FindBy(xpath ="(//input[@aria-label='Phone Number'])[2]")
	private WebElement phoneNum1;
	public void setPhoneNum(String phnum1) throws InterruptedException {
		phoneNum1.sendKeys(phnum1);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", nameOfIntermediary);
	}
	@FindBy(css="input[aria-label='Name of the Intermediary']")
	private WebElement nameOfIntermediary;
	public void setNameOfIntermediary(String nameOfInt) throws InterruptedException {
		
		
		 // js.executeScript("arguments[0].click()",nameOfIntermediary);
		  nameOfIntermediary.sendKeys(nameOfInt);
		  
		  System.out.println("enabled");
		 
		Thread.sleep(2000);
	}
	@FindBy(xpath="(//input[@aria-label='Contact Name'])[1]")
	private WebElement contactName2;
	public void setContactName(String name2) {
		contactName2.sendKeys(name2);
	}
	@FindBy(xpath = "(//input[@aria-label='Email Id'])[1]")
	private WebElement Email2;
	public void setEmail2(String email2) {
		Email2.sendKeys(email2);
	}
	@FindBy(xpath ="(//input[@aria-label='Phone Number'])[1]")
	private WebElement phoneNumber2;
	public void setPhoneNumber2(String phnum) {
		phoneNumber2.sendKeys(phnum);
	}
	@FindBy(css="flt-semantics[aria-label='----TPA DETAILS----']")
	private WebElement nameOfTPA;
	public void clickNameOfTPA() {
		nameOfTPA.click();	
	}
	@FindBy(css="flt-semantics[aria-label='HealthIndia']")
	private WebElement healthindia;
	public void setHealthIndia() throws InterruptedException {
		healthindia.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", contactName3);
	}
	@FindBy(xpath ="(//*[@aria-label='HealthIndia']/following::input[@data-semantics-role='text-field'])[2]")
	private WebElement contactName3;
	public void setcontactName3(String phnum) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", contactName3);
		Thread.sleep(2000);
		contactName3.sendKeys(phnum);
	}
	@FindBy(xpath ="(//*[@aria-label='HealthIndia']/following::input[@data-semantics-role='text-field'])[3]")
	private WebElement Email3;
	public void setEmail3(String email) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Email3);
		Email3.sendKeys(email);
	}
	//@FindBy(xpath ="(//*[@aria-label='HealthIndia']/following::input[@data-semantics-role='text-field'])[4]")
	@FindBy(xpath = "(//*[@aria-label='Phone Number'])")
	private WebElement phoneNumber3;
	public void setPhoneNumber3(String phnum) {
		phoneNumber3.sendKeys(phnum);
	}
	@FindBy(css="flt-semantics[aria-label='NEXT']")
	private WebElement nextbtn;
	public void clickNextbtn() throws InterruptedException {
		nextbtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by providing negative pixel values for vertical scroll
        js.executeScript("window.scrollBy(0, -250);");
	}
	@FindBy(css="flt-semantics[aria-label='-----Policy Type-----']")
	private WebElement policyType;
	public void clickPolicyType() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll up by providing negative pixel values for vertical scroll
       // js.executeScript("window.scrollBy(0, -250);");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", policyType);
		  Thread.sleep(2000);
		policyType.click();
	}
	public boolean displayedPolicyType() {
		policyType.isDisplayed();
		return true;
		
	}
	
	
	
	}
