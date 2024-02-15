package com.securisk.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorpporateDetailspage_Fresh;
import com.securisk.pageobjects.PolicyTermspage_Fresh;
import com.securisk.pageobjects.RfqPage_Fresh;
import com.securisk.pageobjects.SendRfqpage_Fresh;
import com.securisk.utilities.Reusablemethods;

public class Tc_PolicytermsFresh extends Tc_CoveragedetailsFresh {
	
	@Test(priority = 5)
	public void PolicytermsPage() throws InterruptedException, AWTException
	{
		PolicyTermspage_Fresh pt = new PolicyTermspage_Fresh(driver);
		test = reports.startTest("Verify the PolicyTermsPage");
		test.log(LogStatus.PASS, " Click on EditButton");
		pt.clickonEditButton();
		Thread.sleep(2000);
		
		//pt.clickonEditCoverages("Fever");
		//Thread.sleep(2000);
		test.log(LogStatus.PASS, " Enter the data in Limits/Remarks TextBox");
		pt.clickon_Edit_Maternity_Limit_Remarks("Yes");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Verify the ANVM EditButton");
		pt.clickon_Edit_ANVMissed();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Enter the data in Limits/Remarks2 TextBox");
		pt.clickon_Edit_ANVMissed_Limit_Remarks2("yes");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Verify the Waiverintimationclause EditButton");
		pt.clickon_Edit_Waiverofintimationclause();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Enter the data in Limits/Remarks3 TextBox");
		pt.clickon_Edit_Waiverofintimationclause_Limit_Remarks3("Yes");
		//pt.clickonaddPolicy();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Verify the PermanentpartialDisability EditButton");
		pt.Clickon_Edit_Permanentpartial_Disability();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Enter the data in Limits/Remarks4 TextBox");
		pt.clickon_Edit_TemporarilyTotalDisability_Limits_Remarks4("yes");
		Thread.sleep(3000);
		test.log(LogStatus.PASS, " Verify the OPDCover EditButton");
		pt.Clickon_Edit_OPDCover();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Enter the data in Limits/Remarks5 TextBox");
		pt.clickon_Edit_OPDCover_Limits_Remarks5("YES");
		Thread.sleep(2000);
		pt.clickonnext();
		endReport();
		
		SendRfqpage_Fresh SRFQ = new SendRfqpage_Fresh(driver);
		test = reports.startTest("Verify the EmployeeDepedentButton");
		test.log(LogStatus.PASS, " Click on EmployeeDepedentButton");
		WaitUntilElementVisible(SRFQ.clickon_EmployeeDepedent);
		SRFQ.clickonEmployeeDepedent();
		Thread.sleep(5000);
		test = reports.startTest("Verify the SendEmailButton");
		test.log(LogStatus.PASS, " Click onSendEmailButton");
		WaitUntilElementVisible(SRFQ.clickon_SendEmail);
		SRFQ.clickonSendEmail();
		test.log(LogStatus.PASS, " Click on SendEmailCheckbox");
		WaitUntilElementVisible(SRFQ.clickonCheckbox_SendEmail);
		SRFQ.clickonCheckboxSendEmail();
		test.log(LogStatus.PASS, " Click on AgebandingCheckbox");
		WaitUntilElementVisible(SRFQ.checkon_Agebanding);
		SRFQ.checkonAgebanding();
		test.log(LogStatus.PASS, " Click on EmployeeDetailsCheckbox");
		WaitUntilElementVisible(SRFQ.checkon_EmployeeDetails);
		SRFQ.checkonEmployeeDetails();
		test.log(LogStatus.PASS, " Click on RFQCheckbox");
		WaitUntilElementVisible(SRFQ.checkon_RFQ);
		SRFQ.checkonRFQ();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Click on SendemailButton");
		WaitUntilElementVisible(SRFQ.clickon_SendemailButton);
		SRFQ.clickonSendemailButton();
		test.log(LogStatus.PASS, " Click on popupsentEmailSucess");
		WaitUntilElementVisible(SRFQ.clickon_popupsentEmailSucess);
		SRFQ.clickonpopupsentEmailSucess();
		Thread.sleep(5000);
//		WaitUntilElementVisible(SRFQ.clickon_warning);
//		SRFQ.clickonwarning();
//		Thread.sleep(5000);
		test = reports.startTest("Verify the DownloadButton");
		test.log(LogStatus.PASS, " Click on Download");
		WaitUntilElementVisible(SRFQ.clickon_Download);
		SRFQ.clickonDownload();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, " Click on ABADownloadButton");
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
//		Thread.sleep(2000);
		WaitUntilElementVisible(SRFQ.clickon_Close);
		SRFQ.clickonClose();
		Thread.sleep(5000);
		SRFQ.clickOnHomeButton();

}
	
 
}


