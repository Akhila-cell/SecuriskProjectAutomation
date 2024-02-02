package com.securisk.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class policyTermspage {

	
	WebDriver driver;
	public policyTermspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#flt-semantic-node-628")
	WebElement clickon_edit;
	
	@FindBy(xpath ="(((//*[@aria-label=\"Limits/Remarks\"])[2])/following::flt-semantics[@role='button'])[1]")
	WebElement Edit_Coverages;
 
	public void clickonedit() throws InterruptedException {
		
		
		Edit_Coverages.clear();
		Edit_Coverages.sendKeys("Maternity");
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "clickon_edit")
 
		clickon_edit.click();
	}
	@FindBy(css = "#flt-semantic-node-1363")
	WebElement clickon_addPolicyterms;
 
	public void clickonaddPolicy() throws InterruptedException {
 
		clickon_addPolicyterms.click();
	}
 
	@FindBy(xpath="//*[@aria-label='NEXT']")
	WebElement clickon_Next;
	public void clickonnext() throws InterruptedException {
 
		clickon_Next.click();
	}
}

