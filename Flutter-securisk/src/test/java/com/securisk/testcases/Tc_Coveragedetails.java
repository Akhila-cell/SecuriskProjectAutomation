package com.securisk.testcases;

import org.testng.annotations.Test;

import com.securisk.pageobjects.Coveragedetailspage;
import com.securisk.utilities.Reusablemethods;

public class Tc_Coveragedetails extends Tc_CorporateDetails{
	
	@Test(priority = 4)
	public void coveragedetailspage() throws Exception
	{
		Reusablemethods Rm = new Reusablemethods(driver);
		Coveragedetailspage cd = new Coveragedetailspage(driver);
		Thread.sleep(5000);
		cd.clickOnPolicyType();
		Thread.sleep(3000);
		cd.select_Floater();
		Thread.sleep(3000);
		cd.familyDefination_click();
		Thread.sleep(3000);
		cd.familyDefination_Varied();
		Thread.sleep(2000);
		cd.sumInsured_Click();
		Thread.sleep(3000);
		cd.sumInsured_Varied();
		Thread.sleep(2000);
		cd.select_Fd();
		Thread.sleep(2000);
		cd.Enter_SI("50000");
		Thread.sleep(2000);
		cd.clickonihave_employeedata();
		Thread.sleep(2000);
		cd.clickon_employeedependentdata();
		Thread.sleep(2000);
		cd.upload_EDD();
		Thread.sleep(2000);
		cd.clickon_Uploadbutton();
		Thread.sleep(10000);
		cd.clickoneyeicon();
		Rm.Screenshot(driver, "Securisk_Employeedependentdata1");
		//cd.Clickonfirstcheckbox();
		Thread.sleep(2000);
		cd.nextbutton_Coveagedetails();
		
	
	}

}
