package com.securisk.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.AddRfq_Renewal;

public class Tc_CreateRFQ_Renewal extends Tc_AddRfqPage_Renewal {
	@Test(priority = 3)
	public void createRfqAction() throws InterruptedException {

		AddRfq_Renewal ar = new AddRfq_Renewal(driver);
		test = reports.startTest("RFQ creation functionality");
		Thread.sleep(2000);
		ar.selectproductcategory();
		test.log(LogStatus.PASS, "Clicked on the  productcategory dropdown successfully");
		Thread.sleep(2000);
		ar.setEB();
		test.log(LogStatus.PASS, "Selected productcategory as EB successfully");

		Thread.sleep(2000);
		ar.selectproducType();
		test.log(LogStatus.PASS, "Clicked on the productType succefully ");

		Thread.sleep(2000);
		ar.setGHI();
		test.log(LogStatus.PASS, "GHI is Selected Successfully");
		Thread.sleep(2000);
		ar.selectPolicyType();
		test.log(LogStatus.PASS, "Clicked on the PolicyType succesfully ");
		Thread.sleep(2000);

		ar.setRenewal();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Renewal Is selected successfully");
		ar.clicksubmitRfq();
		test.log(LogStatus.PASS, "Clicked on the submit button successfully");
		Assert.assertEquals(true, ar.nameOfInsureddisplayed());

	}
}
