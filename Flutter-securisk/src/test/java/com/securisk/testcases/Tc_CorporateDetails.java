package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorpporateDetailspage;
import com.securisk.pageobjects.Coveragedetailspage;
import com.securisk.pageobjects.Reusablemethods;

public class Tc_CorporateDetails extends Tc_RfqPage {

	@Test(priority = 3)
	public void createrfq() throws InterruptedException, Throwable {

		Reusablemethods Rm = new Reusablemethods(driver);
		CorpporateDetailspage CRFQ = new CorpporateDetailspage(driver);
		Coveragedetailspage cd = new Coveragedetailspage(driver);
		test = reports.startTest("Verify the corporatedetails page");
		test.log(LogStatus.PASS, "Enter name of insured ");
		CRFQ.createNameofInsured("Akhila");
		//Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter intermediaryname ");
		CRFQ.EnterIntermediaryName("Securisk");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter Address ");
		CRFQ.EnterAddress("Hyderabad");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter contactname in intermediary details ");
		CRFQ.contactNameinintermediarydetails("Siri");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Click on nature of bussiness ");
		CRFQ.natureOfBusiness();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Select nature of business");
		CRFQ.selectnatureOB();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter email Id in intermediary details ");
		CRFQ.emailidinIntermediarydetails("securisk12@gmail.com");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter contact name in details ");
		CRFQ.contactNameindetails("Sarwesh");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter Phone number in intermediary ");
		CRFQ.phoneNumberinintermediary("9786563211");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter email id in details ");
		CRFQ.emailidinInDetails("akhila12@gmail.com");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Enter phone number in details ");
		CRFQ.phoneNumberinDetails("8897654320");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Click on location dropdown ");
		CRFQ.clickonLocation();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "select the location ");
		CRFQ.selectingLocation();
		Thread.sleep(2000);

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

		Thread.sleep(2000);
		String Path = Rm.ScreenshotPath("CoverageDetailspage");
		test.log(LogStatus.PASS, test.addScreenCapture(Path) + "Corporate details entered successfully");
		Thread.sleep(3000);
		endReport();
		//Rm.Scrollup();
		
		
		//Thread.sleep(3000);
	}

}
