package com.securisk.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.securisk.pageobjects.SendRfqpage_Fresh;

public class Tc_SendRfqFresh  extends Tc_PolicytermsFresh {
	
	
	@Test
	public void coveragedetailspage() throws InterruptedException, AWTException
	{
		SendRfqpage_Fresh SRFQ = new SendRfqpage_Fresh(driver);
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_EmployeeDepedent);
		SRFQ.clickonEmployeeDepedent();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_SendEmail);
		SRFQ.clickonSendEmail();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickonCheckbox_SendEmail);
		SRFQ.clickonCheckboxSendEmail();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.checkon_Agebanding);
		SRFQ.checkonAgebanding();
		Thread.sleep(2000);
		//WaitUntilElementVisible(SRFQ.checkon_EmployeeDetails);
		SRFQ.checkonEmployeeDetails();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.checkon_RFQ);
		SRFQ.checkonRFQ();
		Thread.sleep(2000);
		//WaitUntilElementVisible(SRFQ.clickon_SendemailButton);
		SRFQ.clickonSendemailButton();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_warning);
		SRFQ.clickonwarning();
		Thread.sleep(2000);
		//WaitUntilElementVisible(SRFQ.clickon_Download);
		SRFQ.clickonDownload();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_ABADownload);
		SRFQ.clickonABADownload();
		Thread.sleep(2000);
		//WaitUntilElementVisible(SRFQ.clickon_RFQDownload);
		SRFQ.clickonRFQDownload();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_EDDDownload);
		SRFQ.clickon_EDDDownload();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_ZIPDownload);
		SRFQ.clickonZIPDownload();
		Thread.sleep(3000);
		//WaitUntilElementVisible(SRFQ.clickon_Close);
		SRFQ.clickonClose();
		

}
}
