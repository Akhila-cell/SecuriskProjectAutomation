package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
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

	 //@FindBy(xpath="//*[@id='flt-semantic-node-628']")
	@FindBy(css = "#flt-semantic-node-630")
	
	// @FindBy(css="#flt-semantic-node-628 > input")
	WebElement clickon_EditButton;

	public void clickonEditButton() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) this.driver;

		js.executeScript("arguments[0].scrollIntoView();", clickon_EditButton);

		clickon_EditButton.click();
		Thread.sleep(3000);
		//clickon_EditButton.clear();
	}

	// @FindBy(css = "#flt-semantic-node-628 > input")
	@FindBy(css = "#flt-semantic-node-628 > input")
	WebElement Edit_Coverages;

	public void clickonEditCoverages(String EditCoverage) throws InterruptedException {
		 Edit_Coverages.click();
		 Thread.sleep(2000);

		Edit_Coverages.clear();
		Thread.sleep(2000);
		Edit_Coverages.sendKeys(EditCoverage);

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "clickon_edit")

		clickon_EditButton.click();
	}

	@FindBy(xpath = "//*[@aria-label='Limits/Remarks']")
	WebElement Edit_Limit_Remarks;

	public void clickonEdit_Limit_Remarks(String Remarks) throws InterruptedException {
		Edit_Limit_Remarks.click();
		Thread.sleep(2000);
		Edit_Limit_Remarks.sendKeys(Remarks);
		Thread.sleep(4000);
	}

	@FindBy(css = "#flt-semantic-node-694")
	WebElement clickon_addPolicyterms;

	public void clickonaddPolicy() throws InterruptedException {

		clickon_addPolicyterms.click();
	}

	// @FindBy(xpath = "//*[@aria-label='NEXT']")
	@FindBy(css = "flt-semantics[aria-label='NEXT']")
	WebElement clickon_Next;

	public void clickonnext() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
		// js.executeScript("scroll(0, 250);");

		js.executeScript("arguments[0].scrollIntoView();", clickon_Next);
		Thread.sleep(5000);

		clickon_Next.click();
	}
}
