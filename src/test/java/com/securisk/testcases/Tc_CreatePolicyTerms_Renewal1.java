package com.securisk.testcases;

import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.PolicyTerms_Renewal1;

public class Tc_CreatePolicyTerms_Renewal1 extends Tc_CreateClaimsDetails_Renewal1{
	@Test(priority = 8)
	public void policyTermsPage() throws InterruptedException {
		PolicyTerms_Renewal1 PTR=new PolicyTerms_Renewal1(driver);
		test = reports.startTest("PolicyTerms functionality");
		Thread.sleep(5000);
		PTR.scrollUp1();
		Thread.sleep(4000);
		PTR.clickEdit();
		test.log(LogStatus.PASS, "Clicked editbutton successfully");
		Thread.sleep(4000);
		PTR.clickontMaternityLimitRemarks("I agree");
		test.log(LogStatus.PASS, "Entered the remark for maternity successfully");
		Thread.sleep(4000);
		PTR.clickAmbulanceRemarkEdit();
		test.log(LogStatus.PASS, "Clicked editbutton successfully");
		Thread.sleep(4000);
		//PTR.AmbulanceRemark("yes agree");
		test.log(LogStatus.PASS, "Entered the remark  successfully");
		PTR.clickedit5();
		Thread.sleep(4000);
		PTR.clickedit6();
		Thread.sleep(4000);
		PTR.clickEdit7();
		Thread.sleep(4000);
		PTR.clickEdit8();
		Thread.sleep(4000);
		PTR.clickadd();
		test.log(LogStatus.PASS, "Clicked on add button successfully");
		Thread.sleep(4000);
		PTR.clickDelete();
		test.log(LogStatus.PASS, "Clicked on the editbutton successfully");
		Thread.sleep(4000);
		PTR.clickNext5();
		test.log(LogStatus.PASS, "Navigated to nextPage successfully");
		
	}

}
