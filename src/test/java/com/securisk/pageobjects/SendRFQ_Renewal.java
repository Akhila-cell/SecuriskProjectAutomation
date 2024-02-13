package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendRFQ_Renewal {
	private WebDriver driver;

	public SendRFQ_Renewal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="flt-semantics[aria-label='Employee Dependent Details']")
	private WebElement employeeDependentDetailsbtn;
	public void clickOnEDD() throws InterruptedException {
		Thread.sleep(3000);
		employeeDependentDetailsbtn.click(); 
	}
	@FindBy(css="flt-semantics[aria-label='Claims MIS']")
	private WebElement claimMisbtn;
	public void clickOnClaimMis() throws InterruptedException {
		Thread.sleep(3000);
		claimMisbtn.click(); 
	}
	@FindBy(css="flt-semantics[aria-label='Close']")
	private WebElement closeClaimmis;
	public void clickCloseClaim() throws InterruptedException {
		Thread.sleep(3000);
		closeClaimmis.click();
	}
	@FindBy(css="flt-semantics[aria-label='Send Email']")
	private WebElement sendEmailbtn;
	public void clickSendEmail() throws InterruptedException {
		Thread.sleep(3000);
		sendEmailbtn.click();
	}
	@FindBy(xpath="(//flt-semantics[@role='checkbox'])[1]")
	private WebElement emailcheckbox;
	public void clickOnEmail() throws InterruptedException {
		Thread.sleep(3000);
		emailcheckbox.click();
	}
	//@FindBy(xpath="(//flt-semantics[@aria-label='Ageband Analysis']/preceding::flt-semantics[@role='checkbox'])[18]")
//	private WebElement agebandAnalysis;
	@FindBy(xpath="(//flt-semantics[@aria-label='Ageband Analysis']/following::flt-semantics[@role='checkbox'])[1]")
	private WebElement employeeDetails;
	@FindBy (xpath = "(//flt-semantics[@aria-label='Ageband Analysis']/following::flt-semantics[@role='checkbox'])[2]")
	private WebElement IRDADetails;
	@FindBy(xpath="(//flt-semantics[@aria-label='Ageband Analysis']/following::flt-semantics[@role='checkbox'])[3]")
	private WebElement RFQcoverage;
	public void getData() throws InterruptedException {
		Thread.sleep(3000);
		//agebandAnalysis.click();
		Thread.sleep(3000);
		employeeDetails.click();
		Thread.sleep(3000);
		IRDADetails.click();
		Thread.sleep(3000);
		RFQcoverage.click();
	}
	@FindBy(xpath="(//flt-semantics[@aria-label='Send Email'])") 
	private WebElement sendEmail2;
	public void sendEmail() throws InterruptedException {
		Thread.sleep(3000);
		sendEmail2.click();
	}
	@FindBy(css="flt-semantics[aria-label='Ok']")
	private WebElement okbtn;
	public void clickOk() throws InterruptedException {
		Thread.sleep(3000);
		okbtn.click();
	}
	@FindBy(css="flt-semantics[aria-label='Download']")
	private WebElement downloadbtn;
	public void clickdownload() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
	}
	@FindBy(css="flt-semantics[aria-label='Age Banding Analysis']")
	private WebElement downloadAgebanding;
	
	public void clickAgebandingDownload() throws InterruptedException {
		Thread.sleep(4000);
		downloadAgebanding.click();
		
	}
	@FindBy(css="flt-semantics[aria-label='Claims Analysis']")
	private WebElement downloadClaimAnalysis;
	public void clickClaimAnalysis() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		downloadClaimAnalysis.click();
	}
	
	
	
	
	@FindBy(css="flt-semantics[aria-label='Claims Mis']")
	private WebElement downloadClaimMis;
	public void clickClaimMis() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		downloadClaimMis.click();
	}
	
	@FindBy(css="flt-semantics[aria-label='Employee Dependent Data']")
	private WebElement downoladEmployeeDependentData;
	public void clickEmployeedependentData() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		downoladEmployeeDependentData.click();
	}
	@FindBy(css="flt-semantics[aria-label='IRDA']")
	private WebElement downloadIRDA;
	public void clickIRDA() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		downloadIRDA.click();
	}
	@FindBy(css="flt-semantics[aria-label='RFQ Coverage']")
	private WebElement downloadRfqCoverage;
	public void clickRfqCoverage() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		downloadRfqCoverage.click();
	}
	@FindBy(css="flt-semantics[aria-label='Download All']")
	private WebElement dowloadAllFiles;
	public void clickAllFiles() throws InterruptedException {
		Thread.sleep(3000);
		downloadbtn.click();
		Thread.sleep(4000);
		dowloadAllFiles.click();
	}
	@FindBy(xpath="//flt-semantics[@aria-label='Close']")
	private WebElement closeDownloadbtn;
	public void  clickCloseDownload() throws InterruptedException {
		Thread.sleep(4000);
		closeDownloadbtn.click();
	}
}
