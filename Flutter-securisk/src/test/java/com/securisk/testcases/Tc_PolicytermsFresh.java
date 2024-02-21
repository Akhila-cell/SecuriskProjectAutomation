package com.securisk.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.PolicyTermspage_Fresh;
import com.securisk.pageobjects.SendRfqpage_Fresh;

public class Tc_PolicytermsFresh extends Tc_CoveragedetailsFresh {
	
	@Test(priority = 5)
	public void PolicytermsPage() throws InterruptedException, AWTException
	{
		PolicyTermspage_Fresh pt = new PolicyTermspage_Fresh(driver);
		SendRfqpage_Fresh SRFQ = new SendRfqpage_Fresh(driver);
		test=reports.startTest("Verify the PolicytermsPge");
		test.log(LogStatus.PASS,"Click on EditButton ");
		pt.clickonEditButton();
		//WaitUntilElementVisible(pt.clickon_EditButton);
		
		//pt.clickonEditCoverages("Fever");
		//Thread.sleep(2000);
		test.log(LogStatus.PASS," Enter the data in Limits/Remarks Textbox ");
		pt.clickon_Edit_Maternity_Limit_Remarks("Yes");
		Thread.sleep(2000);
		
		//WaitUntilElementVisible(pt.Edit_Maternity_Limit_Remarks);
		test.log(LogStatus.PASS,"Verify the ANVMissed EditButton");
		pt.clickon_Edit_ANVMissed();
		//WaitUntilElementVisible(pt.Edit_ANVMissed);
		Thread.sleep(3000);
		test.log(LogStatus.PASS,"Enter the data in Limits/Remarks2 Textbox");
		pt.clickon_Edit_ANVMissed_Limit_Remarks2("yes");
		Thread.sleep(3000);
		//WaitUntilElementVisible(pt.Edit_ANVMissed_Limit_Remarks2);
		test.log(LogStatus.PASS,"Verify the Waiverofintimationclause EditButton");
		pt.clickon_Edit_Waiverofintimationclause();
		Thread.sleep(3000);
		//WaitUntilElementVisible(pt.Edit_Waiverofintimationclause);
		test.log(LogStatus.PASS,"Enter the data in Limits/Remarks3 Textbox");
		pt.clickon_Edit_Waiverofintimationclause_Limit_Remarks3("Yes");
		Thread.sleep(2000);
		//WaitUntilElementVisible(pt.Edit_Waiverofintimationclause_Limit_Remarks3);
		//pt.clickonaddPolicy();
		//Thread.sleep(2000);
		test.log(LogStatus.PASS,"Verify the Permanentpartial_Disability EditButton");
		pt.Clickon_Edit_Permanentpartial_Disability();
		Thread.sleep(3000);
		//WaitUntilElementVisible(pt.Edit_Permanentpartial_Disability);
		test.log(LogStatus.PASS,"Enter the data in Limits/Remarks4 Textbox");
		pt.clickon_Edit_TemporarilyTotalDisability_Limits_Remarks4("yes");
		Thread.sleep(3000);
		//WaitUntilElementVisible(pt.Edit_Permanentpartial_Disability_Limits_Remarks4);
		test.log(LogStatus.PASS,"Verify the OPDCover EditButton");
		pt.Clickon_Edit_OPDCover();
		Thread.sleep(2000);
		//WaitUntilElementVisible(pt.Edit_OPDCover);
		test.log(LogStatus.PASS,"Enter the data in Limits/Remarks5 Textbox");
		pt.clickon_Edit_OPDCover_Limits_Remarks5("YES");
		Thread.sleep(3000);
		//WaitUntilElementVisible(pt.Edit_OPDCover_Limits_Remarks5);
		pt.clickonnext();
		endReport();
		WaitUntilElementVisible(SRFQ.clickon_EmployeeDepedent);
		SRFQ.clickonEmployeeDepedent();
		//WaitUntilElementVisible(SRFQ.clickon_SendEmail);
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
//		SRFQ.clickonDownload();
//		driver.switchTo().alert().accept();
//		test.log(LogStatus.PASS, " Click on RFQDownloadButton");
//		WaitUntilElementVisible(SRFQ.clickon_RFQDownload);
//		SRFQ.clickonRFQDownload();
//		Thread.sleep(2000);
//		SRFQ.clickonDownload();
//		test.log(LogStatus.PASS, " Click on EDDDownloadButton");
//		WaitUntilElementVisible(SRFQ.clickon_EDDDownload);
//		SRFQ.clickon_EDDDownload();
//		Thread.sleep(2000);
//		SRFQ.clickonDownload();
//		test.log(LogStatus.PASS, " Click on ZIPDownloadButton");
//		WaitUntilElementVisible(SRFQ.clickon_ZIPDownload);
//		SRFQ.clickonZIPDownload();
		//Thread.sleep(2000);
		WaitUntilElementVisible(SRFQ.clickon_Close);
		SRFQ.clickonClose();
		
}}


