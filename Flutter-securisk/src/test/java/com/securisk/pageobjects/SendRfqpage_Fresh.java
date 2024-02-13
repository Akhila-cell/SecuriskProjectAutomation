package com.securisk.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendRfqpage_Fresh {

	WebDriver driver;

	public SendRfqpage_Fresh(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath = "//*[@aria-label='Employee Dependent Details']")
	@FindBy(css = "flt-semantics[aria-label='Employee Dependent Details']")
	public
	WebElement clickon_EmployeeDepedent;
	// public WebElement clickon_EmployeeDepedent;

	public void clickonEmployeeDepedent() throws InterruptedException, AWTException {

		clickon_EmployeeDepedent.click();
		Thread.sleep(2000);
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_ESCAPE);
		rb1.keyRelease(KeyEvent.VK_ESCAPE);

	}

	// @FindBy(xpath = "//*[@aria-label='Send Email']")
	@FindBy(css = "flt-semantics[aria-label='Send Email']")
	public WebElement clickon_SendEmail;
	//WebElement clickon_SendEmail;

	public void clickonSendEmail() throws InterruptedException {

		clickon_SendEmail.click();
	}

	//@FindBy(css = "#flt-semantic-node-1163")
	@FindBy(css="#flt-semantic-node-734")
	//@FindBy(xpath="//*[@aria-label='sanjukta.senapati@ojas-it.com']/preceding-sibling::flt-semantics[@role='checkbox']")
	public WebElement clickonCheckbox_SendEmail;
	//WebElement clickonCheckbox_SendEmail;

	public void clickonCheckboxSendEmail() throws InterruptedException {

		clickonCheckbox_SendEmail.click();
	}

	/*
	 * @FindBy(xpath = "//*[@aria-checked='false'])[6]") WebElement
	 * clickon_InsurerSendemail;
	 * 
	 * public void clickonInsurerdSendemail() throws InterruptedException {
	 * 
	 * clickon_InsurerSendemail.click(); }
	 */

	// @FindBy(xpath = "(//*[@role='checkbox'])[19]")
	@FindBy(css = "#flt-semantic-node-916")
	 public WebElement checkon_Agebanding;
	//WebElement checkon_Agebanding;

	public void checkonAgebanding() throws InterruptedException {

		checkon_Agebanding.click();
	}

	// @FindBy(xpath = "(//*[@aria-checked='false'])[16]")
	@FindBy(css = "#flt-semantic-node-918")
	 public WebElement checkon_EmployeeDetails;
	//WebElement checkon_EmployeeDetails;

	public void checkonEmployeeDetails() throws InterruptedException {

		checkon_EmployeeDetails.click();
	}

	// @FindBy(xpath = "(//*[@aria-checked='false'])[18]")
	@FindBy(css = "#flt-semantic-node-922")
	 public WebElement checkon_RFQ;
	//WebElement checkon_RFQ;

	public void checkonRFQ() throws InterruptedException {

		checkon_RFQ.click();
	}

	 @FindBy(xpath = "//*[@aria-label='Send Email']")
	//@FindBy(css = "#flt-semantic-node-941")
	 public WebElement clickon_SendemailButton;
	//WebElement clickon_SendemailButton;

	public void clickonSendemailButton() throws InterruptedException {

		clickon_SendemailButton.click();
	}
	@FindBy(css="#flt-semantic-node-1011")
	public WebElement clickon_popupsentEmailSucess;
	public void clickonpopupsentEmailSucess() throws InterruptedException {

		clickon_popupsentEmailSucess.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//*[@aria-label='Download']")
	//@FindBy(css = "#flt-semantic-node-706")
	 public WebElement clickon_Download;
	//WebElement clickon_Download;

	public void clickonDownload() throws InterruptedException {

		clickon_Download.click();
	}

	@FindBy(css = "#flt-semantic-node-952")
	 public WebElement clickon_warning;
	//WebElement clickon_warning;

	public void clickonwarning() throws InterruptedException {
		clickon_warning.click();
	}

	 @FindBy(xpath = "//*[@aria-label='Age Banding Analysis']")
	//@FindBy(css = "flt-semantics[aria-label='Age Banding Analysis']")
	 public WebElement clickon_ABADownload;
	//WebElement clickon_ABADownload;

	public void clickonABADownload() throws InterruptedException {

		clickon_ABADownload.click();
	}

	@FindBy(xpath = "//*[@aria-label='RFQ Coverage']")
	 public WebElement clickon_RFQDownload;
	//WebElement clickon_RFQDownload;

	public void clickonRFQDownload() throws InterruptedException {

		clickon_RFQDownload.click();
	}

	@FindBy(xpath = "//*[@aria-label='Employee Dependent Data']")
	 public WebElement clickon_EDDDownload;
	//WebElement clickon_EDDDownload;

	public void clickon_EDDDownload() throws InterruptedException {

		clickon_EDDDownload.click();
	}

	// scroll //*[@aria-label='Download All']
	@FindBy(xpath = "//*[@aria-label='Download All']")
	 public WebElement clickon_ZIPDownload;
	//WebElement clickon_ZIPDownload;

	public void clickonZIPDownload() throws InterruptedException {

		clickon_ZIPDownload.click();
	}

	// *[@aria-label='Close']
	@FindBy(xpath = "//*[@aria-label='Close']")
	 public WebElement clickon_Close;
	//WebElement clickon_Close;

	public void clickonClose() throws InterruptedException {

		clickon_Close.click();
	}

}
