package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryProductsPage;
import com.securisk.pageobjects.Reusablemethods;



public class IntemediaryAddCoverageTest extends Baseclass {

	public IntemediaryAddCoverageTest() {
		super(driver, wait);
	}

	@Test(priority = 2)
	public void addCoverage() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		Tc_LoginPage tc= new Tc_LoginPage();
		tc.launch();
		startReport("Intermediary Addcoverage");
		test = reports.startTest("AddCoverage With Valid Data");
		WaitUntilElementVisible(ip.IntermediaryDropdown);
		ip.clickOnIntermediary();
		Thread.sleep(2000);
		WaitUntilElementVisible(ip.ProductsButton);
		ip.clickOnProducts();
		WaitUntilElementVisible(ip.FilterDropdown);
		ip.Filtertype();
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.AddCoverageBtn);
		ip.clickOnAddCoverage();
		test.log(LogStatus.PASS, "Clicked on Add coverage");
		WaitUntilElementVisible(ip.EnterCoverageField);
		ip.enterCoverageName("Test");
		test.log(LogStatus.PASS, "Coverage name Entered");
		WaitUntilElementVisible(ip.AddBtn);
		ip.clickOnAddBtn();
		WaitUntilElementVisible(ip.OkBtn);
		Assert.assertEquals(true, ip.coverageAdded());
		String path =rc.ScreenshotPath("Add coverage");
		test.log(LogStatus.PASS,test.addScreenCapture(path) +"Coverage Added Scucessfully");
		ip.clickonOkBtn();
		endReport();
	}
	
	@Test(priority = 3)
	public void addCoverageWithInvalidata() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		test = reports.startTest("AddCoverage With InValid Data");
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.AddCoverageBtn);
		ip.clickOnAddCoverage();
		test.log(LogStatus.PASS, "Clicked on Add coverage");
		WaitUntilElementVisible(ip.AddBtn);
		ip.clickOnAddBtn();
		WaitUntilElementVisible(ip.OkBtn);
		try {
			Assert.assertEquals(true, ip.coverageAdded());
			String path =rc.ScreenshotPath("Add coverage");
			test.log(LogStatus.PASS,test.addScreenCapture(path) +"Coverage Added Scucessfully");
			ip.clickonOkBtn();
		} catch (Exception e) {
			String path =rc.ScreenshotPath("Add coverage");
			test.log(LogStatus.FAIL,test.addScreenCapture(path) +"Coverage Added Scucessfully");
			ip.clickonOkBtn();
		}
		ip.clickonOkBtn();
		endReport();
	
	}
}
