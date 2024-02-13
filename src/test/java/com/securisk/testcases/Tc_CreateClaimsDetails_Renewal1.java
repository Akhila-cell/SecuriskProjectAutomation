package com.securisk.testcases;

import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.ClaimDetails_Renewal1;

public class Tc_CreateClaimsDetails_Renewal1 extends Tc_CreateExpiringDetails_REnewal1{
	@Test(priority = 7)
	public void claimsDetailsPage() throws InterruptedException {
		ClaimDetails_Renewal1 CDR =new ClaimDetails_Renewal1(driver);
		test = reports.startTest("ClaimsDetails functionality");
		Thread.sleep(5000);
		CDR.scrollup1();
		Thread.sleep(5000);
		CDR.setReinurshment1("20000");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim paid as on date successfully");
		Thread.sleep(4000);
		CDR.setcashless1("10000");
		test.log(LogStatus.PASS, "Entered the cashless for claim paid as on date successfully");
		Thread.sleep(4000);
		CDR.setReinurshment2("6000");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim outstanding as on date date successfully");
		Thread.sleep(4000);
		CDR.setcashless2("2000");
		test.log(LogStatus.PASS, "Entered the cashless for claim outstanding as on date date successfully");
		Thread.sleep(4000);
		CDR.setReinurshment3("6789");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim paid on  date for opd details successfully");
		Thread.sleep(4000);
		CDR.setcashless3("6060");
		test.log(LogStatus.PASS, "Entered the cashless for claim paid on  date for opd details successfully");
		Thread.sleep(4000);
		CDR.setReinurshment4("7000");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim outstanding as on date for opd details successfully");
		Thread.sleep(4000);
		CDR.setCashless4("4000");
		test.log(LogStatus.PASS, "Entered the cashless for claim outstanding as on  date for opd details successfully");
		Thread.sleep(5000);
		CDR.scrollUp2();
		Thread.sleep(5000);
		CDR.setReinurshment5("5698");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim paid as on  date for corporate buffer details successfully");
		Thread.sleep(5000);
		CDR.setCashless5("1234");
		test.log(LogStatus.PASS, "Entered the cashless for claim paid as on  date for corporate buffer details successfully");
		Thread.sleep(4000);
		CDR.setReinurshment6("346");
		test.log(LogStatus.PASS, "Entered the Reinurshment for claim outstanding as on  date for corporate buffer details successfully");
		Thread.sleep(5000);
		CDR.setCashless6("567");
		test.log(LogStatus.PASS, "Entered the cashless for claim outstanding as on  date for corporate buffer details successfully");
		Thread.sleep(5000);
		CDR.setCorporateBufferAmount("3456");
		test.log(LogStatus.PASS, "Entered the corporate buffer Amount successfully");
		Thread.sleep(5000);
		CDR.setPerFamilyLimit("400000");
		test.log(LogStatus.PASS, "Entered per fmailylimit successfully");
		Thread.sleep(5000);
		CDR.setMaxnoOfcases("3");
		test.log(LogStatus.PASS, "Entered the  Maxmium number of cases successfully");
		Thread.sleep(5000);
		CDR.setPerFamilyMaxSI("600000");
		test.log(LogStatus.PASS, "Entered the per familymaximum SI successfully");
		Thread.sleep(5000);
		CDR.clicknext5();
		test.log(LogStatus.PASS, "Navigated to policyTerm successfully");
		
		
		

}}
