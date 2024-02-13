package com.securisk.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorporateDetails_Renewal;
import com.securisk.utilities.Reusablemethods;

public class Tc_CreateCorporateDetails_Renewal  extends Tc_CreateRFQ_Renewal{
	@Test(priority = 3)
	public void createcorporateDetailsAction() throws InterruptedException {
		CorporateDetails_Renewal cd=new CorporateDetails_Renewal(driver);
		test=reports.startTest("CorporateDetails functionality");
		cd.setNameOfInsured("sanjukta");
		test.log(LogStatus.PASS, "Name of insured entered successfully");
		Thread.sleep(2000);
		cd.setAddress("hyderabad");
		test.log(LogStatus.PASS, "Address entered successfully");
		Thread.sleep(2000);
		cd.clickNatureOfBusiness();
		test.log(LogStatus.PASS, "Clicked on the  nature of business successfully");
		Thread.sleep(2000);
		cd.setGovernment();
		test.log(LogStatus.PASS, "Selected  nature of business as goverment successfully");
		Thread.sleep(2000);
		cd.setContactName1("Lokesh");
		test.log(LogStatus.PASS, "Entered the contactname successfully");
		Thread.sleep(2000);
		cd.setEmail("sanjukta@gmail.com");
		test.log(LogStatus.PASS, "Gmail entered successfully");
		Thread.sleep(2000);
		cd.setPhoneNum("1234567890");
		test.log(LogStatus.PASS, "Entered phonenumber successfully");
		Thread.sleep(5000);
		

		Reusablemethods.scrollUp(driver);
		cd.setNameOfIntermediary("senapati");
		test.log(LogStatus.PASS, "Entered the name of intermediary successfully");
		Thread.sleep(2000);
		cd.setContactName("khadar");
		test.log(LogStatus.PASS, "Entered contactname successfully");
		Thread.sleep(3000);
		cd.setEmail2("sanju@gmail.com");
		test.log(LogStatus.PASS, "Gmail entered successfully");
		Thread.sleep(2000);
		cd.setPhoneNumber2("9087654321");
		test.log(LogStatus.PASS, "phonenumber entered successfully");
		Thread.sleep(2000);
		cd.clickNameOfTPA();
		test.log(LogStatus.PASS, "Clicked on TPA successfully");
		Thread.sleep(2000);
		cd.setHealthIndia();
		test.log(LogStatus.PASS, "Healthindia selected successfully");
		Thread.sleep(2000);
		cd.setcontactName3("Shree");
		test.log(LogStatus.PASS, "Entered contactname successfully");
		Thread.sleep(2000);
		cd.setEmail3("shree@gmail.com");
		test.log(LogStatus.PASS, "Gmail entered successfully");
		Thread.sleep(2000);
		cd.setPhoneNumber3("2345678901");
		test.log(LogStatus.PASS, " entered  phonenumber successfully");
		Thread.sleep(2000);
		cd.clickNextbtn();
		test.log(LogStatus.PASS, "Clicked on nextbutton successfully");
		Assert.assertEquals(true, cd.displayedPolicyType());
		
	}

}
