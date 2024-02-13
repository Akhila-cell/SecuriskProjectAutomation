package com.securisk.testcases;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.AddRfq_Renewal;

public class Tc_AddRfqPage_Renewal extends Tc_LoginPage {

	@Test(priority = 2)
	public void rfqClickAction() throws InterruptedException {
		AddRfq_Renewal ar = new AddRfq_Renewal(driver);
		Thread.sleep(8000);
		test = reports.startTest("RFQ functionality");
		ar.ClickonRFQ();
		test.log(LogStatus.PASS, "Clicked on RFQ button successfully");
		Thread.sleep(10000);
		ar.clickcreateRFq();
		test.log(LogStatus.PASS, "Clicked on createRFQ button successfully");
		Thread.sleep(2000);
		Assert.assertEquals(true, ar.displayproductcategory());
	}
}
