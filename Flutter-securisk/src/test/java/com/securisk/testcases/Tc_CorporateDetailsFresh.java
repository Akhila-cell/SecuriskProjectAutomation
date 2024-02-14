package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import com.securisk.pageobjects.CorpporateDetailspage_Fresh;
import com.securisk.pageobjects.Coveragedetailspage_Fresh;

import com.securisk.utilities.Reusablemethods;


public class Tc_CorporateDetailsFresh extends Tc_RfqPageFresh {

	@Test(priority = 3)
	public void createrfq() throws InterruptedException, Throwable {

		Reusablemethods Rm = new Reusablemethods(driver);
		CorpporateDetailspage_Fresh CRFQ = new CorpporateDetailspage_Fresh(driver);
		Coveragedetailspage_Fresh cd = new Coveragedetailspage_Fresh(driver);
		test = reports.startTest("Verify the corporatedetails page");
		test.log(LogStatus.PASS, "Enter name of insured ");
		Thread.sleep(2000);
		CRFQ.createNameofInsured("Akhila");
		WaitUntilElementVisible(CRFQ.NameOfInsured);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter intermediaryname ");
		CRFQ.EnterIntermediaryName("Securisk");
		//WaitUntilElementVisible(CRFQ.NameOfIntermediary);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter Address ");
		CRFQ.EnterAddress("Hyderabad");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.Address);
		test.log(LogStatus.PASS, "Enter contactname in intermediary details ");
		CRFQ.contactNameinintermediarydetails("Siri");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.Contactnameintermediary);
		test.log(LogStatus.PASS, "Click on nature of bussiness ");
		CRFQ.natureOfBusiness();
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.Natureofbusines);
		test.log(LogStatus.PASS, "Select nature of business");
		CRFQ.selectnatureOB();
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.SelectNOB);
		test.log(LogStatus.PASS, "Enter email Id in intermediary details ");
		CRFQ.emailidinIntermediarydetails("securisk12@gmail.com");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.EmailidIn);
		test.log(LogStatus.PASS, "Enter contact name in details ");
		CRFQ.contactNameindetails("Sarwesh");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.Contactnamedetails);
		test.log(LogStatus.PASS, "Enter Phone number in intermediary ");
		CRFQ.phoneNumberinintermediary("9786563211");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.PhonenumberI);
		test.log(LogStatus.PASS, "Enter email id in details ");
		CRFQ.emailidinInDetails("akhila12@gmail.com");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.EmailidD);
		test.log(LogStatus.PASS, "Enter phone number in details ");
		CRFQ.phoneNumberinDetails("8897654320");
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.PhonenumberD);
		test.log(LogStatus.PASS, "Click on location dropdown ");
		CRFQ.clickonLocation();
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.Location);
		test.log(LogStatus.PASS, "select the location ");
		CRFQ.selectingLocation();
		Thread.sleep(2000);
		//WaitUntilElementVisible(CRFQ.SelectLocation);

		test.log(LogStatus.PASS, "Click on next button");
		CRFQ.clickonnextbutton();

		// Assert.assertTrue(cd.clickonPloicyType.isDisplayed(), "Corporate details not
		// entered successfully");
		try {
			boolean actual = cd.clickonPloicyType.isDisplayed();
			Assert.assertEquals(true, actual);
			test.log(LogStatus.PASS, " Corporate details entered successfully");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL, "Corporate details not entered successfully");
		}

		//Thread.sleep(2000);
		String Path = Rm.ScreenshotPath("CoverageDetailspage");
		test.log(LogStatus.PASS, test.addScreenCapture(Path) + "Corporate details entered successfully");
		Thread.sleep(3000);
		endReport();
		//Rm.Scrollup();
		
	}

}
