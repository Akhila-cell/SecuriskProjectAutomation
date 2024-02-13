package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimDetails_Renewal1  {
	private WebDriver driver;
	public ClaimDetails_Renewal1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//flt-semantics[@aria-label='OPD Details']")
	private WebElement opdDetails;
	@FindBy(xpath="(//input[@aria-label='Reimbursement'])[1]")
	private WebElement reibursement1;
	


	public void scrollup1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", opdDetails);
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].scrollIntoView();", reibursement1);
		  
	}
	@FindBy(xpath="(//*[@aria-label='Claim Details']/following::input[@aria-label='Reimbursement'])[1]")
	private WebElement reibursement2;
	public void setReinurshment1(String reiburse1) throws InterruptedException {
		Thread.sleep(3000);
		reibursement1.sendKeys(reiburse1);
	}
	@FindBy(xpath="(//*[@aria-label='Claim Details']/following::input[@aria-label='Cashless'])[1]")
	private WebElement cashless1;
	public void setcashless1(String cashless) throws InterruptedException {
		Thread.sleep(3000);
		cashless1.sendKeys(cashless);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[5]")
	private WebElement reibursement3;
	public void setReinurshment2(String reiburse2) throws InterruptedException {
		Thread.sleep(3000);
		reibursement3.sendKeys( reiburse2);
		
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[7]")
	private WebElement cashless2;
	public void setcashless2(String cashless1) throws InterruptedException {
		Thread.sleep(3000);
		cashless2.sendKeys(cashless1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[9]")
	private WebElement reibursement4;
	public void setReinurshment3(String reiburse3) throws InterruptedException {
		Thread.sleep(4000);
		reibursement4.sendKeys(reiburse3);
	}
	@FindBy(xpath="(//*[@aria-label='OPD Details']/following::input[@aria-label='Cashless'])[1]")
	private WebElement cashless3;
	public void setcashless3(String cashless2) throws InterruptedException {
		Thread.sleep(4000);
		cashless3.sendKeys(cashless2);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[13]")
	private WebElement reibursement5;
	public void setReinurshment4(String reiburse4) throws InterruptedException {
		Thread.sleep(4000);
		reibursement5.sendKeys(reiburse4);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[14]")
	private WebElement cashless4;
	public void setCashless4(String cashless3) throws InterruptedException {
		Thread.sleep(4000);
		cashless4.sendKeys(cashless3);
	}
	
	
	@FindBy(xpath="//flt-semantics[@aria-label='Corporate Buffer Details-Renewal']")
	private WebElement corporateBufferDetailsRenewal;
	@FindBy(xpath = "(//input[@aria-label='Reimbursement'])[1]")
	private WebElement reimbur;
	public void scrollUp2() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", corporateBufferDetailsRenewal);
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].scrollIntoView();", reimbur);
		  
		
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[2]")
	private WebElement reinurshment6;
	public void setReinurshment5(String reiburse5) throws InterruptedException {
		Thread.sleep(4000);
	reinurshment6.sendKeys(reiburse5);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[4]")
	private WebElement cashless5;
	public void setCashless5(String cashless4)throws InterruptedException {
		Thread.sleep(4000);
		cashless5.sendKeys(cashless4);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[6]")
	private WebElement reinurshment7;
	public void setReinurshment6(String reiburse6) throws InterruptedException {
		Thread.sleep(4000);
		reinurshment7.sendKeys(reiburse6);
	}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[8]")
	private WebElement cashless6;
	public void setCashless6(String cashless5) throws InterruptedException {
		Thread.sleep(4000);
		cashless6.sendKeys(cashless5);
	}
	
	@FindBy(xpath="//input[@aria-label='Corporate Buffer Amount']")
	private WebElement corporateBufferAmount;
	public void setCorporateBufferAmount(String amount) throws InterruptedException {
		Thread.sleep(4000);
		corporateBufferAmount.sendKeys(amount);
	}
	@FindBy(xpath="//input[@aria-label='Per Family Limit']")
	private WebElement perFamilyLimit;
	public void setPerFamilyLimit(String limit) throws InterruptedException {
		Thread.sleep(4000);
		perFamilyLimit.sendKeys(limit);
	}
	@FindBy(xpath="//input[@aria-label='Maximum No. of Cases']")
	private WebElement maxNoOfcases;
	public void setMaxnoOfcases(String num) throws InterruptedException {
		Thread.sleep(4000);
		maxNoOfcases.sendKeys(num);
	}
	@FindBy(xpath="//input[@aria-label='Per Family Maximum SI']")
	private WebElement perFamilyMaxSI;
	public void setPerFamilyMaxSI(String SI) throws InterruptedException {
		Thread.sleep(4000);
		perFamilyMaxSI.sendKeys(SI); 
	}
	@FindBy(xpath="//flt-semantics[@aria-label='NEXT']")
	private WebElement nextbtn5;
	public void clicknext5() throws InterruptedException {
		Thread.sleep(4000);
		nextbtn5.click();
	}
	
	

}
