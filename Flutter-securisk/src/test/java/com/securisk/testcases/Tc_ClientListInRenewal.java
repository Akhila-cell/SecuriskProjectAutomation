package com.securisk.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.ClientListinRenewal;

public class Tc_ClientListInRenewal extends Tc_LoginPage{
	
	@Test(priority = 2)
	public void ClientTest() throws InterruptedException
	{
		ClientListinRenewal cl = new ClientListinRenewal(driver);
		test=reports.startTest("ClientList");
		cl.Client();
		test.log(LogStatus.PASS,"Selected Clientlist module");
		
		cl.Renewals();
		test.log(LogStatus.PASS, "Selected Renewals in ClientList");
		
		cl.CreateClient();
		test.log(LogStatus.PASS, "Creating client button succesfull");
	}
	

}
