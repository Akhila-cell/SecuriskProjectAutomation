package com.securisk.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyTerms_Renewal1 {
	private WebDriver driver;
	public PolicyTerms_Renewal1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//flt-semantics[@role='button'])[12]")
	private WebElement editbtn;
	public void scrollUp1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) this.driver;
 
		js.executeScript("arguments[0].scrollIntoView();", editbtn);
 
		
		Thread.sleep(3000);
	}
	public void clickEdit() throws InterruptedException {
		Thread.sleep(4000);
		editbtn.click();
	}
	@FindBy(xpath = "(//*[@aria-label='Limits/Remarks'])[1]")
	WebElement MaternityLimitRemarks;
 
	public void clickontMaternityLimitRemarks(String Remarks) throws InterruptedException {
		MaternityLimitRemarks.click();
 
		MaternityLimitRemarks.sendKeys(Remarks);
		Thread.sleep(2000);
	}
	
	//@FindBy(css="flt-semantics[aria-label^='Proposed Scope of Cover'] flt-semantics[id^='flt-semantic-node-']")
	//private List<WebElement> policytermsList;
	
	@FindBy(css="flt-semantic-node-1745")
	private WebElement ambulanceRemarkEdit;
	
	
	public void clickAmbulanceRemarkEdit() throws InterruptedException {
		Thread.sleep(2000);
		ambulanceRemark.click();
		
//		WebElement policyterms = policytermsList.get(policytermsList.size() - 4);
//		policyterms.click();
//		
		
		
		//
		

}
	@FindBy(xpath="(//input[@data-semantics-role='text-field'])[22]")
	private WebElement ambulanceRemark;
	public void AmbulanceRemark(String Remark2) throws InterruptedException {
		Thread.sleep(4000);
		ambulanceRemark.sendKeys(Remark2);
	}
	@FindBy(css="#flt-semantic-node-1647")
	private WebElement edit5;
	public void clickedit5() throws InterruptedException {
		Thread.sleep(4000);
		edit5.click();
	}
	
	@FindBy(css="#flt-semantic-node-1675")
	private WebElement edit6;
	public void clickedit6() throws InterruptedException {
		Thread.sleep(4000);
		edit6.click();
	}
	
	@FindBy(css="#flt-semantic-node-1703")
	private WebElement edit7;
	public void clickEdit7() throws InterruptedException {
		Thread.sleep(4000);
		edit7.click();
	}
	@FindBy(css="#flt-semantic-node-1785")
	private WebElement edit8;
	public void clickEdit8() throws InterruptedException {
		Thread.sleep(4000);
		edit7.click();
	}
	
	
	@FindBy(xpath="(//flt-semantics[@role='button'])[40]")
	private WebElement addbtn;
	public void clickadd() throws InterruptedException {
		Thread.sleep(3000);
		addbtn.click();
	}
	
	@FindBy(xpath="(//flt-semantics[@role='button'])[39]")
	private WebElement deletebtn;
	public void clickDelete() throws InterruptedException {
		Thread.sleep(3000);
		deletebtn.click();
	}
	@FindBy(xpath="//flt-semantics[@aria-label='NEXT']")
	private WebElement next5;
	public void clickNext5() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", addbtn);
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].scrollIntoView();", next5);
		  Thread.sleep(3000);
		next5.click();
	}
	

}
