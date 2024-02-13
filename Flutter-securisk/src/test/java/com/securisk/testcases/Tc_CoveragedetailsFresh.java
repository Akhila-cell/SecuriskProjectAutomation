package com.securisk.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.Coveragedetailspage_Fresh;
import com.securisk.utilities.Reusablemethods;



public class Tc_CoveragedetailsFresh extends Tc_CorporateDetailsFresh {

	@Test(priority = 4)
	public void coveragedetailspage() throws Exception {
		Reusablemethods Rm = new Reusablemethods(driver);
		Coveragedetailspage_Fresh cd = new Coveragedetailspage_Fresh(driver);
		Thread.sleep(3000);
		test = reports.startTest("Verify the coveragedetails page");
		test.log(LogStatus.PASS, " Selecting the Policy Type as Floater");
		cd.clickOnPolicyType();
		Thread.sleep(3000);
		cd.select_Floater();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Selecting FamilyDefination as varied");
		cd.familyDefination_click();
		Thread.sleep(3000);
		cd.familyDefination_Varied();
		test.log(LogStatus.PASS, " Selecting Sum Insured as varied");
		Thread.sleep(2000);
		cd.sumInsured_Click();
		Thread.sleep(3000);
		cd.sumInsured_Varied();
		endReport();
		Thread.sleep(2000);
		test = reports.startTest("Verify the Family defination and sum insured in  coveragedetails page");
		test.log(LogStatus.PASS, " Selecting the family defintion checkbox as 1+3");
		cd.select_Fd();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Enter the Sum Insured as 1+3");
		cd.Enter_SI("50000");
		Thread.sleep(2000);
		endReport();
		test = reports.startTest("Verify I have EmployeeData and I don't have data in  coveragedetails page");
		test.log(LogStatus.PASS, " Click on I have Employee Data");
		cd.clickonihave_employeedata();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Uploading the EmployeeDependent Data");
		cd.clickon_employeedependentdata();
		Thread.sleep(2000);
		cd.upload_EDD();
		Thread.sleep(2000);
		cd.clickon_Uploadbutton();
		Thread.sleep(10000);
		test.log(LogStatus.PASS, " Checking the EDD by clicking on EyeIcon ");
		cd.clickoneyeicon();
		Rm.Screenshot(driver, "Securisk_Employeedependentdata1");
		// cd.Clickonfirstcheckbox();
		Thread.sleep(2000);
		cd.nextbutton_Coveagedetails();
		Thread.sleep(2000);
		endReport();

	}

}
