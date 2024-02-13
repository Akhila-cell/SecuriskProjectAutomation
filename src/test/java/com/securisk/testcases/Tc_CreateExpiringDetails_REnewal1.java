package com.securisk.testcases;

import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.ExpiringPolicyDetails_Renewal1;

public class Tc_CreateExpiringDetails_REnewal1 extends Tc_CreateCoverageDetails_Renewal1 {
	@Test(priority = 6)
	public void expiryDetailsPage() throws InterruptedException {

		ExpiringPolicyDetails_Renewal1 EDP = new ExpiringPolicyDetails_Renewal1(driver);
		test = reports.startTest("ExpiringDetails functionality");
		Thread.sleep(3000);

		EDP.getScroll();
		Thread.sleep(3000);
		

		EDP.clickOnStartDate();
		test.log(LogStatus.PASS, "Clicked on startdate successfully");
		Thread.sleep(5000);
		EDP.setStartDate();
		test.log(LogStatus.PASS, " startdate selected successfully");
		Thread.sleep(6000);
		EDP.clickOk();
		test.log(LogStatus.PASS, " startdate displayed successfully");
		Thread.sleep(3000);
		EDP.setPremiumPaidInspection("788");
		test.log(LogStatus.PASS, "entered premiumPaidinception successfully");
		Thread.sleep(3000);
		EDP.setDatePremium("4");
		test.log(LogStatus.PASS, "Entered the date of premium successfully");
		Thread.sleep(3000);
		EDP.setAdditionPremium("4567");
		test.log(LogStatus.PASS, "Entered additionPremium successfully");
		Thread.sleep(3000);
		EDP.setDeletionPremium("2345");
		test.log(LogStatus.PASS, "Entered the deletionPremium successfully");
		Thread.sleep(3000);
		EDP.setPolicyType("GHI");
		test.log(LogStatus.PASS, "Entered policyType successfully");
		Thread.sleep(3000);
		EDP.setActiveYear("2024");
		test.log(LogStatus.PASS, "Entered the activeyear successfully");
		Thread.sleep(5000);
		EDP.scrollUp2();
		Thread.sleep(5000);
		EDP.setNoOfMemberInception("6");
		test.log(LogStatus.PASS, "Entered the number of memberInception successfully");
		Thread.sleep(3000);
		EDP.setAdditionalYear("10");
		test.log(LogStatus.PASS, "Entered the additionalYear successfully");
		Thread.sleep(3000);
		EDP.setDeletionDuringYear("4");
		test.log(LogStatus.PASS, "Entered the deletionduring year successfully");
		Thread.sleep(3000);
		EDP.setTotalMemberDate("8");
		test.log(LogStatus.PASS, "Entered the Totalmember date successfully");
		Thread.sleep(3000);
		EDP.setNoOfMemberCovered("7");
		test.log(LogStatus.PASS, "Entered the number of member covered successfully");
		Thread.sleep(3000);
		EDP.setDependent("6");
		test.log(LogStatus.PASS, "Entered the dependent number successfully");
		Thread.sleep(5000);
		EDP.clickFamilyDetails();
		test.log(LogStatus.PASS, "Clicked on familyDetails successfully");
		Thread.sleep(3000);
		EDP.setFamilyDetails();
		test.log(LogStatus.PASS, "FamilyDetails is selected successfully");
		Thread.sleep(3000);
		EDP.setNoofFamilies("4");
		test.log(LogStatus.PASS, "entered the number of families successfully");
		Thread.sleep(3000);
		EDP.clickAdditionalRelationCovered();
		test.log(LogStatus.PASS, "Clicked on the additionalRelationCovered successfully");
		Thread.sleep(3000);
		EDP.clickYes();
		test.log(LogStatus.PASS, "Clicked on yesbutton successfully");
		Thread.sleep(3000);
		EDP.clickRevisedFamilyDefination();
		test.log(LogStatus.PASS, "Clicked on revisedFamilydEfination successfully");
		Thread.sleep(3000);
		EDP.clickNo();
		test.log(LogStatus.PASS, "Clicked on no successfully");
		Thread.sleep(3000);
		EDP.clicknext();
		test.log(LogStatus.PASS, "Clicked on nextbutton successfully");

	}

}
