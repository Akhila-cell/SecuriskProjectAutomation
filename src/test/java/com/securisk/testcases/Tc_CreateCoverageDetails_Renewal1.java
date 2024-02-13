package com.securisk.testcases;

import java.awt.AWTException;


import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CoverageDetails_Renewal1;

public class Tc_CreateCoverageDetails_Renewal1 extends Tc_CreateCorporateDetails_Renewal {
	@Test(priority=5)
	public void coverageDetailsPage() throws InterruptedException, AWTException
	{
		CoverageDetails_Renewal1 Cdp=new CoverageDetails_Renewal1(driver);
		
		
		test = reports.startTest("CoverageDetails functionality");
		
		Thread.sleep(3000);
		
		Cdp.clickOnPolicyType();
		
		
		
		Thread.sleep(3000);
		
		Cdp.selectOptionFromPolicyType();
		test.log(LogStatus.PASS,"PolicyType Selected Successfully");
		
		Thread.sleep(3000);
		
		Cdp.clickOnFamilyDefinition();
		
		Thread.sleep(3000);
		
		Cdp.selectOptionFromFamilyDefinition();
		
		Thread.sleep(3000);
		test.log(LogStatus.PASS,"FamilyDefinition Selected Successfully");
		
		Cdp.clickOnSumInsured();
		
		Thread.sleep(3000);
		
		Cdp.selectOptionFromSumInsured();
		
		Thread.sleep(7000);
		test.log(LogStatus.PASS,"SumInsured Selected Successfully");
		
		Cdp.clickOnIHaveEmployeeData();
		
		Thread.sleep(20000);
		test.log(LogStatus.PASS,"IHaveEmployeeData Selected Successfully");
		
		Cdp.clickOnEmployeeDependentData();
		Thread.sleep(10000);
		
		Cdp.clickOnUpload();
		
		Thread.sleep(10000);
		test.log(LogStatus.PASS,"EmployeeDependent file uploaded Successfully");
		Cdp.clickOnClaimsMISExcel();
		Thread.sleep(20000);
		
		
		
		Cdp.clickOnUploadbtn();
		
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS,"EmployeeDependent file uploaded Successfully");
		
		Cdp.selectFamilyDef1();
		
		Thread.sleep(5000);
	test.log(LogStatus.PASS,"1+3 selected Successfully");
	
	Cdp.getSumInsured();
	Thread.sleep(5000);
	
	test.log(LogStatus.PASS,"SumInsured entered Successfully");
	
	Cdp.getScrollDown();
	
	Thread.sleep(8000);
	Cdp.getNextbtn();
	
	Thread.sleep(10000);
	test.log(LogStatus.PASS,"Successfully entered to Expiring Details Page");
	}
}


