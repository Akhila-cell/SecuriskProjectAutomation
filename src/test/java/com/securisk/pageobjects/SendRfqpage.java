package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendRfqpage {
	
WebDriver driver;
	
	public SendRfqpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@aria-label='Employee Dependent Details']")
	WebElement clickon_EmployeeDepedent;

	public void clickonEmployeeDepedent() throws InterruptedException {

		clickon_EmployeeDepedent.click();
	}

	@FindBy(xpath = "//*[@aria-label='Send Email']")
	WebElement clickon_SendEmail;

	public void clickonSendEmail() throws InterruptedException {

		clickon_SendEmail.click();
	}

	@FindBy(xpath = "//*[@aria-checked='false'])[6]")
	WebElement clickon_InsurerSendemail;

	public void clickonInsurerdSendemail() throws InterruptedException {

		clickon_InsurerSendemail.click();
	}

	@FindBy(xpath = "(//*[@aria-checked='false'])[15]")
	WebElement checkon_Agebanding;

	public void checkonAgebanding() throws InterruptedException {

		checkon_Agebanding.click();
	}

	@FindBy(xpath = "(//*[@aria-checked='false'])[16]")
	WebElement checkon_EmployeeDetails;

	public void checkonEmployeeDetails() throws InterruptedException {

		checkon_EmployeeDetails.click();
	}

	@FindBy(xpath = "(//*[@aria-checked='false'])[18]")
	WebElement checkon_RFQ;

	public void checkonRFQ() throws InterruptedException {

		checkon_RFQ.click();
	}
	
	
	@FindBy(xpath = "//*[@aria-label='Send Email']")
	WebElement clickon_SendemailButton;

	public void clickonSendemailButton() throws InterruptedException {

		clickon_SendemailButton.click();
	}
	
	@FindBy(xpath = "//*[@aria-label='Download']")
	WebElement clickon_Download;

	public void clickonDownload() throws InterruptedException {

		clickon_Download.click();
	}
	
	
	@FindBy(xpath = "//*[@aria-label='Age Banding Analysis']")
	WebElement clickon_ABADownload;

	public void clickonABADownload() throws InterruptedException {

		clickon_ABADownload.click();
	}
	@FindBy(xpath = "//*[@aria-label='RFQ Coverage']")
	WebElement clickon_RFQDownload;

	public void clickonRFQDownload() throws InterruptedException {

		clickon_RFQDownload.click();
	}
	@FindBy(xpath = "//*[@aria-label='Employee Dependent Data']")
	WebElement clickon_EDDDownload;

	public void clickon_EDDDownload() throws InterruptedException {

		clickon_EDDDownload.click();
	}
	//scroll //*[@aria-label='Download All']
	@FindBy(xpath = "//*[@aria-label='Download All']")
	WebElement clickon_ZIPDownload;

	public void clickonZIPDownload() throws InterruptedException {

		clickon_ZIPDownload.click();
	}
	//*[@aria-label='Close']
	@FindBy(xpath = "//*[@aria-label='Close']")
	WebElement clickon_Close;

	public void clickonClose() throws InterruptedException {

		clickon_Close.click();
	}

}
