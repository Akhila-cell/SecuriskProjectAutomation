package com.securisk.pageobjects;

import java.awt.AWTException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.securisk.utilities.Reusablemethods;


public class CoverageDetails_Renewal1 {
	private WebDriver driver;
	Reusablemethods rm = new Reusablemethods(driver);

	public CoverageDetails_Renewal1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "flt-semantics[aria-label=\"-----Policy Type-----\"]")
	WebElement clickonPloicyType;

	public void clickOnPolicyType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonPloicyType);

		Thread.sleep(5000);
		clickonPloicyType.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Non-Floater\"]")
	WebElement selectOptionFromPolicyType;

	public void selectOptionFromPolicyType() {
		selectOptionFromPolicyType.click();
	}

	// select the option from family definition

	@FindBy(css = "flt-semantics[aria-label=\"-----Family Defination-----\"]")
	WebElement clickOnFamilyDefinition;

	public void clickOnFamilyDefinition() {
		clickOnFamilyDefinition.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Fixed\"]")
	WebElement selectOptionFromFamiliyDefinition;

	public void selectOptionFromFamilyDefinition() {
		selectOptionFromFamiliyDefinition.click();
	}

	// select option from sum insured

	@FindBy(css = "flt-semantics[aria-label=\"-----Sum Insured-----\"]")
	WebElement clickOnSumInsured;

	public void clickOnSumInsured() {
		clickOnSumInsured.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Fixed\"]")
	WebElement selectOptionFromSumInsured;

	public void selectOptionFromSumInsured() {
		selectOptionFromSumInsured.click();
	}

	// Click on I have Employee Data

	@FindBy(xpath = "//flt-semantics[@aria-checked=\"false\"]")
	WebElement clickOnIHaveEmployeeData;

	public void clickOnIHaveEmployeeData() {
		clickOnIHaveEmployeeData.click();
	}

	// Upload the Employee data file

	@FindBy(xpath = "(//flt-semantics[@aria-label=\"Employee & Dependent Data \"]/following-sibling::flt-semantics[@role='button'])[1]")
	WebElement clickOnEmployeeDependenData;

	public void clickOnEmployeeDependentData() throws InterruptedException, AWTException {
		clickOnEmployeeDependenData.click();
		Thread.sleep(4000);
		String path = "C:\\Users\\ss22055\\Downloads\\Automation\\Flutter_auto\\src\\test\\java\\com\\testdata\\securisk\\Alacriti.xlsx";
		Reusablemethods.uploadFileWithRobot(path);

	}

	@FindBy(xpath = "//flt-semantics[@aria-label=\"Upload\"]")
	WebElement clickOnUpload;

	public void clickOnUpload() {
		clickOnUpload.click();

	}

	@FindBy(xpath = "(//flt-semantics[@aria-label=\"Claims Mis(Excel)\"]/following-sibling::flt-semantics[@role=\"button\"])[1]")
	WebElement clickOnClaimsMISExcel;

	public void clickOnClaimsMISExcel() throws InterruptedException, AWTException {

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickOnClaimsMISExcel);
		Thread.sleep(10000);
		clickOnClaimsMISExcel.click();
		Thread.sleep(4000);

		String path = "C:\\Users\\ss22055\\Downloads\\Automation\\Flutter_auto\\src\\test\\java\\com\\testdata\\securisk\\HealthIndia.xlsx";
		Reusablemethods.uploadFileWithRobot(path);
		Thread.sleep(5000);

	}

//Upload the CliamsMIS file

	@FindBy(xpath = "//flt-semantics[@aria-label=\"Upload\"]")
	WebElement clickOnUploadbtn;

	public void clickOnUploadbtn() throws InterruptedException {

		clickOnUploadbtn.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "(//flt-semantics[@role=\"radio\"])[3]")
	WebElement selectFamilyDef1;

	public void selectFamilyDef1() throws InterruptedException {

		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", selectFamilyDef1);
		Thread.sleep(4000);

		selectFamilyDef1.click();
	}

	@FindBy(xpath = "//input[@aria-label=\"Sum Insured\"]")
	WebElement SI;

	/*
	 * @FindBy(xpath = "//flt-semantics[@aria-label=\"BACK\"]") WebElement Backbtn;
	 */

	public void getSumInsured() throws InterruptedException {
		Actions a = new Actions(driver);

		a.sendKeys(SI, "300000").build().perform();
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", clickOnClaimsMISExcel);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//flt-semantics[@aria-label=\"NEXT\"]")
	WebElement Nextbtn;

	public void getScrollDown() throws InterruptedException {
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", Nextbtn);
		Thread.sleep(12000);
	}

	public void getNextbtn() throws InterruptedException {

		Thread.sleep(8000);

		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 * wait.until(ExpectedConditions.visibilityOf(Nextbtn));
		 */
		Thread.sleep(8000);

		Nextbtn.click();
	}

}
