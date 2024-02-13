package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpiringPolicyDetails_Renewal1 {
	private WebDriver driver;

	public ExpiringPolicyDetails_Renewal1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@aria-label=\"Premium Paid at Inception\"]")
	private WebElement PPI;

	public void getScroll() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", PPI);

		Thread.sleep(3000);
	}

	@FindBy(xpath = "(//input[@data-semantics-role='text-field'])[3]")
	private WebElement startDate;

	public void clickOnStartDate() throws InterruptedException {

		Thread.sleep(5000);
		startDate.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//flt-semantics[@aria-label='15, Thursday, February 15, 2024']")
	private WebElement getStartDate;

	public void setStartDate() {
		getStartDate.click();
	}

	@FindBy(css = "flt-semantics[aria-label='OK']")
	private WebElement okbtn;

	public void clickOk() throws InterruptedException {
		Thread.sleep(2000);
		okbtn.click();
	}

	@FindBy(xpath = "//input[@aria-label='Premium Paid at Inception']")
	private WebElement premiumPaidInspection;

	public void setPremiumPaidInspection(String amount) throws InterruptedException {
		Thread.sleep(3000);
		premiumPaidInspection.sendKeys(amount);
	}

	@FindBy(xpath = "//input[@aria-label='As on Date Premium']")
	private WebElement asOnDatePremium;

	public void setDatePremium(String date) throws InterruptedException {
		Thread.sleep(3000);
		asOnDatePremium.sendKeys(date);
	}

	@FindBy(xpath = "//input[@aria-label='Addition Premium']")
	private WebElement additionPremium;

	public void setAdditionPremium(String amount1) throws InterruptedException {
		Thread.sleep(3000);
		additionPremium.sendKeys(amount1);
	}

	@FindBy(xpath = "//input[@aria-label='Deletion Premium']")
	private WebElement deletionPremium;

	public void setDeletionPremium(String premium1) throws InterruptedException {
		Thread.sleep(2000);
		deletionPremium.sendKeys(premium1);
	}

	@FindBy(xpath = "//input[@aria-label='Policy Type']")
	private WebElement policyType;

	public void setPolicyType(String Type) throws InterruptedException {
		Thread.sleep(2000);
		policyType.sendKeys(Type);
	}

	@FindBy(xpath = "//input[@aria-label='Active Years']")
	private WebElement activeyear;

	public void setActiveYear(String year) throws InterruptedException {
		Thread.sleep(2000);
		activeyear.sendKeys(year);
	}

	@FindBy(xpath = "//input[@aria-label='Total Members as on Date']")
	private WebElement totalMemberDate;
	@FindBy(xpath = "//input[@aria-label='No.of Members at Inception']")
	private WebElement noOfMemberInception;

	public void scrollUp2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", totalMemberDate);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", noOfMemberInception);

	}

	public void setNoOfMemberInception(String num) throws InterruptedException {
		Thread.sleep(3000);
		noOfMemberInception.sendKeys(num);
	}

	@FindBy(css = "[aria-label='Additions During the year']")
	private WebElement additionalDuringYear;

	public void setAdditionalYear(String year) throws InterruptedException {
		Thread.sleep(2000);
		additionalDuringYear.sendKeys(year);
	}

	@FindBy(xpath = "//input[@aria-label='Deletion During the year']")
	private WebElement deletionDuringYear;

	public void setDeletionDuringYear(String year1) throws InterruptedException {
		Thread.sleep(3000);
		deletionDuringYear.sendKeys("year1");
	}

	@FindBy(xpath = "//input[@aria-label='Total Members as on Date']")
	private WebElement totalMemberDate1;

	public void setTotalMemberDate(String totalnum) throws InterruptedException {
		Thread.sleep(2000);
		totalMemberDate1.sendKeys(totalnum);

	}

	@FindBy(xpath = "//input[@aria-label='No.of Members to be Covered']")
	private WebElement noOfMemberCovered;

	public void setNoOfMemberCovered(String member) throws InterruptedException {
		Thread.sleep(2000);
		noOfMemberCovered.sendKeys(member);
	}

	@FindBy(xpath = "//input[@aria-label='Dependent']")
	private WebElement dependent;

	public void setDependent(String dependentnum) throws InterruptedException {
		Thread.sleep(2000);
		dependent.sendKeys(dependentnum);
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='Family Details'])[1]")
	private WebElement familydetailsdropdown;

	public void clickFamilyDetails() throws InterruptedException {
		Thread.sleep(2000);
		familydetailsdropdown.click();
	}

	@FindBy(xpath = "//flt-semantics[@aria-label='1 + 3']")
	private WebElement getfamilydetails;

	public void setFamilyDetails() throws InterruptedException {
		Thread.sleep(3000);
		getfamilydetails.click();
	}

	@FindBy(xpath = "(//input[@aria-label='No.of Families'])")
	private WebElement noOfFamilies;

	public void setNoofFamilies(String familynum) throws InterruptedException {
		Thread.sleep(2000);
		noOfFamilies.sendKeys(familynum);
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='Family Details'])[2]")
	private WebElement familyDefinationAdditionalRelationCoverd;

	public void clickAdditionalRelationCovered() throws InterruptedException {
		Thread.sleep(2000);
		familyDefinationAdditionalRelationCoverd.click();
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='YES'])")
	private WebElement yesbtn;

	public void clickYes() throws InterruptedException {
		Thread.sleep(2000);
		yesbtn.click();
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='Family Details'])[2]")
	private WebElement revisedFamilyDefination;

	public void clickRevisedFamilyDefination() throws InterruptedException {
		Thread.sleep(2000);
		revisedFamilyDefination.click();
	}

	@FindBy(xpath = "(//flt-semantics[@aria-label='NO'])")
	private WebElement nobtn;

	public void clickNo() throws InterruptedException {
		Thread.sleep(2000);
		nobtn.click();
	}

	@FindBy(xpath = "//flt-semantics[@aria-label='NEXT']")
	private WebElement nextbtn4;

	public void clicknext() throws InterruptedException {
		Thread.sleep(2000);
		nextbtn4.click();
	}

}
