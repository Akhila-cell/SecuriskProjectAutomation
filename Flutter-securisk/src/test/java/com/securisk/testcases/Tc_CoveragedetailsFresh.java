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
<<<<<<< HEAD
		test.log(LogStatus.PASS, "Selecting policy type as floater");
		cd.clickOnPolicyType();
=======
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
>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c
		Thread.sleep(2000);
		//WaitUntilElementVisible(cd.clickonPloicyType);
		cd.select_Floater();
		Thread.sleep(2000);
		//WaitUntilElementVisible(cd.floater);
		test.log(LogStatus.PASS, "Selecting Familydefination as varied");
		WaitUntilElementVisible(cd.clickonfamilydefination);
		cd.familyDefination_click();
		WaitUntilElementVisible(cd.selectvariedinFD);
		cd.familyDefination_Varied();
		test.log(LogStatus.PASS, "Selecting sum insured as varied");
		WaitUntilElementVisible(cd.Clickonsuminsured);
		cd.sumInsured_Click();
		WaitUntilElementVisible(cd.selectvariedinSI);
		cd.sumInsured_Varied();
		endReport();
<<<<<<< HEAD
		test = reports.startTest("Verify the Family defination and sum insured in coveragedetails page");
		test.log(LogStatus.PASS, "selcting the family defination checkbox as 1+3");
		WaitUntilElementVisible(cd.selectFD);
		cd.select_Fd();
		WaitUntilElementVisible(cd.enterSumI);
		test.log(LogStatus.PASS, "Enter the sum insured as 1+3");
		cd.Enter_SI("50000");
		endReport();
		test = reports.startTest("Verify the i have employee data and i don't have data in coveragedetails page");
		test.log(LogStatus.PASS, "Click on i have employee data");
		WaitUntilElementVisible(cd.Ihave_employeedata);
		cd.clickonihave_employeedata();
		test.log(LogStatus.PASS, "Uploading the employee dependent Data");
		WaitUntilElementVisible(cd.employeedependentdata);
=======
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
>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c
		cd.clickon_employeedependentdata();
		cd.upload_EDD();
		WaitUntilElementVisible(cd.uploadbutton);
		cd.clickon_Uploadbutton();
<<<<<<< HEAD
		WaitUntilElementVisible(cd.Eyeicon);
		test.log(LogStatus.PASS, "Checking the EDD by clicking on eyeicon");
=======
		Thread.sleep(10000);
		test.log(LogStatus.PASS, " Checking the EDD by clicking on EyeIcon ");
>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c
		cd.clickoneyeicon();
		Rm.Screenshot(driver, "Securisk_Employeedependentdata1");
		WaitUntilElementVisible(cd.Clickonnextbutton);
		cd.nextbutton_Coveagedetails();
		Thread.sleep(2000);
		endReport();
<<<<<<< HEAD
=======

>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c
	}

}
