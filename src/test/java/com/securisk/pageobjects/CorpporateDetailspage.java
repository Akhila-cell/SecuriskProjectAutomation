package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorpporateDetailspage {
	WebDriver driver;
	public CorpporateDetailspage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@aria-label='Name of the Insured/Proposer']")
	public WebElement NameOfInsured;

	public void createNameofInsured(String name) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", NameOfInsured);
		Thread.sleep(3000);
		NameOfInsured.sendKeys(name);
		
     //Actions ac = new Actions(driver);
     //ac.moveToElement(NameOfInsured).click().sendKeys("Akhila").build().perform();
     // NameOfInsured.sendKeys("Akhila");
	}

	@FindBy(xpath = "//*[@aria-label='Name of the Intermediary']")
	public WebElement NameOfIntermediary;

	public void EnterIntermediaryName(String intername) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", NameOfIntermediary);
		Thread.sleep(3000);
		NameOfIntermediary.sendKeys(intername);
	}

	@FindBy(xpath = "//*[@aria-label='Address']")
	public WebElement Address;

	public void EnterAddress(String add) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Address);
		Thread.sleep(3000);
		Address.sendKeys(add);
	}

	@FindBy(xpath = "//*[@aria-label='Contact Name']")
	public WebElement Contactnameintermediary;

	public void contactNameinintermediarydetails(String cname) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Contactnameintermediary);
		Thread.sleep(3000);
		Contactnameintermediary.sendKeys(cname);
	}
	@FindBy(xpath = "//*[@aria-label='Nature of the Business']")
	public WebElement Natureofbusines;

	public void natureOfBusiness() throws InterruptedException {
		
		Natureofbusines.click();
	}
		
	@FindBy(xpath = "//*[@aria-label='Pharma']")
	public WebElement SelectNOB;

	public void selectnatureOB() throws InterruptedException {
		
		SelectNOB.click();
	}

	@FindBy(xpath = "//*[@aria-label='Email Id']")
	public WebElement EmailidIn;

	public void emailidinIntermediarydetails(String Inemailid) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", EmailidIn);
		Thread.sleep(2000);
		EmailidIn.sendKeys(Inemailid);
	}
	
	@FindBy(xpath = "//*[@aria-label='Contact Name']")
	public WebElement Contactnamedetails;

	public void contactNameindetails(String contactN) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", Contactnamedetails);
		Thread.sleep(2000);
		Contactnamedetails.sendKeys(contactN);
	}

	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	public WebElement PhonenumberI;

	public void phoneNumberinintermediary(String InPno) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", PhonenumberI);
		Thread.sleep(2000);
		PhonenumberI.sendKeys(InPno);
	}
	
	@FindBy(xpath = "//*[@aria-label='Email Id']")
	public WebElement EmailidD;

	public void emailidinInDetails(String Demailid) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", EmailidD);
		Thread.sleep(2000);
		EmailidD.sendKeys(Demailid);
	}
	
	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	public WebElement PhonenumberD;


	public void phoneNumberinDetails(String dPno)  throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].click()", PhonenumberD);
		Thread.sleep(2000);
		PhonenumberD.sendKeys(dPno);
	}
	
	@FindBy(xpath = "//*[@aria-label='Select location']")
	public WebElement Location;

	public void clickonLocation() throws InterruptedException {
		
		Location.click();
	}
	@FindBy(xpath = "//*[@aria-label='Hyderabad']")
	public WebElement SelectLocation;

	public void selectingLocation() throws InterruptedException {
		
		SelectLocation.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='NEXT']")
	public WebElement Nextbutton;

	public void clickonnextbutton() throws InterruptedException {
		
		Nextbutton.click();
	}
	
}
