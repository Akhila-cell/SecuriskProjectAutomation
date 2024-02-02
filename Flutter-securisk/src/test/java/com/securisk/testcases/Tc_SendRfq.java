package com.securisk.testcases;

import org.testng.annotations.Test;

import com.securisk.pageobjects.SendRfqpage;

public class Tc_SendRfq  extends Tc_Policyterms {
	
	@Test(priority = 4)
	public void coveragedetailspage() throws InterruptedException
	{
		SendRfqpage SRFQ = new SendRfqpage(driver);
		SRFQ.clickonEmployeeDepedent();
		SRFQ.clickonSendEmail();
		SRFQ.clickonInsurerdSendemail();
		SRFQ.checkonAgebanding();
		SRFQ.checkonEmployeeDetails();
		SRFQ.checkonRFQ();
		SRFQ.clickonSendemailButton();
		SRFQ.clickonDownload();
		SRFQ.clickonABADownload();
		SRFQ.clickonRFQDownload();
		SRFQ.clickon_EDDDownload();
		SRFQ.clickonZIPDownload();
		SRFQ.clickonClose();
		

}
}
