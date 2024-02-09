package com.securisk.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CreateClientInRenewal;

public class Tc_CreateClientInRenewal extends Tc_ClientListInRenewal{
	
	@Test(priority = 3)
	public void CreateClientTest() throws InterruptedException
	{
		CreateClientInRenewal CC= new CreateClientInRenewal(driver);
		
		test=reports.startTest("Createclient");
		CC.clientNameinCreateClient("SSS");
		test.log(LogStatus.PASS,"Clientname entered successfully");
		
		CC.locationinCreateClient();
		test.log(LogStatus.PASS,"Location in create client successfull");
		CC.location();
		test.log(LogStatus.PASS,"Location selected successfully");
		
		CC.productType();
		test.log(LogStatus.PASS,"producttype selected successfully");
		CC.products();
		test.log(LogStatus.PASS,"product selected succesfully");
		
		CC.insuranceCompany();
		test.log(LogStatus.PASS,"Insurance selected successfully");
		CC.insuranceCompanyDropdown();
		test.log(LogStatus.PASS,"Insurance company selected successfully");
		
		CC.createbutton();
		test.log(LogStatus.PASS,"Client created successfully");
	}

}
