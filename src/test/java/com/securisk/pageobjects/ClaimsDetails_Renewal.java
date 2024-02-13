package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClaimsDetails_Renewal {
	private WebDriver driver;
	public ClaimsDetails_Renewal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath  ="(//*[@aria-label='Claim Details']/following::input[@aria-label='Reimbursement'])[1]")
	private WebElement claimPaidAsOnDate;
	public void setclaimPaidDate(String amount1) {
		claimPaidAsOnDate.sendKeys(amount1);
	}
	@FindBy(xpath ="(//*[@aria-label='Claim Details']/following::input[@aria-label='Cashless'])[1]")
	private WebElement cashless1;
	public void setclassless1(String amount2) {
		cashless1.sendKeys(amount2);
	}
	@FindBy(xpath="(//*[@aria-label='Claim Details']/following::input[@aria-label='Reimbursement'])[2]")
	private WebElement claimsOutstandingAsOnDate;
	public void setclaimsOutstandingAsOnDate(String amount3) {
		claimsOutstandingAsOnDate.sendKeys(amount3);
	}
	@FindBy(xpath ="(//*[@aria-label='Claim Details']/following::input[@aria-label='Cashless'])[3]")
	private WebElement cashless2;
	public void setcashless2(String amount4) {
	cashless2.sendKeys(amount4);	
	}
	@FindBy(xpath="(//*[@aria-label='OPD Details']/following::input[@aria-label='Reimbursement'])[1]")
	private WebElement OpdclaimPaidAsOnDate;
	public void setOpdclaimPaidAsOnDate(String amount5) {
		OpdclaimPaidAsOnDate.sendKeys(amount5);
	}
	@FindBy(xpath = "(//*[@aria-label='OPD Details']/following::input[@aria-label='Cashless'])[1]")
	private WebElement cashless3;
	public void setCashless3(String amount6) {
		cashless3.sendKeys(amount6);
	}
	@FindBy(xpath = "(//*[@aria-label='OPD Details']/following::input[@aria-label='Reimbursement'])[2]")
	private WebElement OpdclaimsOutstandingAsOnDate;
	public void setOpdclaimsOutstandingAsOnDate(String amount7) {
		OpdclaimsOutstandingAsOnDate.sendKeys(amount7);
	}
	@FindBy(xpath = "(//*[@aria-label='OPD Details']/following::input[@aria-label='Cashless'])[2]")
	private WebElement cashless4;
	public void setcashless4(String amount8) {
		cashless4.sendKeys(amount8);
	}
	@FindBy(xpath = "(//*[@aria-label='Corporate Buffer Details']/following::input[@aria-label='Reimbursement'])[1]")
	private WebElement corporateBuffereClaims;
	public void setcorporateBufferClaims(String amount9) {
		corporateBuffereClaims.sendKeys(amount9);
		
	}
	@FindBy(xpath = "(//*[@aria-label='Corporate Buffer Details']/following::input[@aria-label='Cashless'])[2]")
	private WebElement cashless5;
	public void setcashless5(String amount10) {
		cashless5.sendKeys(amount10);
	}
	@FindBy(xpath = "['Corporate Buffer Details']/following::input[@aria-label='Reimbursement'])[3]")
	private WebElement corporateClaimsOutstand;
	public void setCorporateClaimOutstand(String amount11) {
	corporateClaimsOutstand.sendKeys(amount11);
	}
	@FindBy(xpath="(//*[@aria-label='Corporate Buffer Details']/following::input[@aria-label='Cashless'])[4]")
	private WebElement cashless6;
	public void setcashless6(String amount12) {
	cashless6.sendKeys(amount12);	
	}
	@FindBy(css="input[aria-label='Corporate Buffer Amount']")
	private WebElement corporateBufferamount;
	public void setCorporateBufferAmount(String amount13) {
		corporateBufferamount.sendKeys(amount13);
	}
	@FindBy(css ="input[aria-label='Per Family Limit']")
	private WebElement perfamilylLimit;
	public void setPerFamilyLimit(String amount14) {
		perfamilylLimit.sendKeys(amount14);
	}
	@FindBy(css= "input[aria-label='Maximum No. of Cases']")
	private WebElement maxNoOfCases;
	public void setMaxNumCases(String num) {
	maxNoOfCases.sendKeys(num);	
	}
	@FindBy(css= "input[aria-label='Per Family Maximum SI']")
	private WebElement perFamilyMaxSI;
	public void setperFamilyMaxSI(String num2) {
		perfamilylLimit.sendKeys(num2);
	}
	@FindBy(css="flt-semantics[aria-label='NEXT']")
	private WebElement nextbtn4;
	public void clicknext() {
		nextbtn4.click();
	}
	

}
