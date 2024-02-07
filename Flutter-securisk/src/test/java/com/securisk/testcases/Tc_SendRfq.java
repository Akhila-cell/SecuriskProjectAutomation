package com.securisk.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.securisk.pageobjects.SendRfqpage;

public class Tc_SendRfq  extends Tc_Policyterms {
	
	@Test(priority = 6)
	public void coveragedetailspage() throws InterruptedException, AWTException
	{
		SendRfqpage SRFQ = new SendRfqpage(driver);
		WaitUntilElementVisible(SRFQ.clickon_EmployeeDepedent);
		SRFQ.clickonEmployeeDepedent();
		WaitUntilElementVisible(SRFQ.clickon_SendEmail);
		SRFQ.clickonSendEmail();
		WaitUntilElementVisible(SRFQ.clickonCheckbox_SendEmail);
		SRFQ.clickonCheckboxSendEmail();
		WaitUntilElementVisible(SRFQ.checkon_Agebanding);
		SRFQ.checkonAgebanding();
		WaitUntilElementVisible(SRFQ.checkon_EmployeeDetails);
		SRFQ.checkonEmployeeDetails();
		WaitUntilElementVisible(SRFQ.checkon_RFQ);
		SRFQ.checkonRFQ();
		WaitUntilElementVisible(SRFQ.clickon_SendemailButton);
		SRFQ.clickonSendemailButton();
		WaitUntilElementVisible(SRFQ.clickon_warning);
		SRFQ.clickonwarning();
		WaitUntilElementVisible(SRFQ.clickon_Download);
		SRFQ.clickonDownload();
		WaitUntilElementVisible(SRFQ.clickon_ABADownload);
		SRFQ.clickonABADownload();
		WaitUntilElementVisible(SRFQ.clickon_RFQDownload);
		SRFQ.clickonRFQDownload();
		WaitUntilElementVisible(SRFQ.clickon_EDDDownload);
		SRFQ.clickon_EDDDownload();
		WaitUntilElementVisible(SRFQ.clickon_ZIPDownload);
		SRFQ.clickonZIPDownload();
		WaitUntilElementVisible(SRFQ.clickon_Close);
		SRFQ.clickonClose();
		

}
}
