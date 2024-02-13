package com.securisk.testcases;

import org.testng.annotations.Test;



import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.SendRFQ_Renewal;
import com.securisk.utilities.Reusablemethods;

public class Tc_CreateSendRFQ_Renewal1 extends Tc_CreatePolicyTerms_Renewal1{
	@Test(priority=9)
	public void sendRfqPage() throws InterruptedException {
		SendRFQ_Renewal SRR=new SendRFQ_Renewal(driver);
		Reusablemethods rm=new Reusablemethods(driver);
		test = reports.startTest("SendRFQ functionality");
		Thread.sleep(5000);
		SRR.clickOnEDD();
		test.log(LogStatus.PASS, "Employeedependent data displayed successfully");
		Thread.sleep(5000);
		Reusablemethods.mouseMoveoutsideWindow(); 
		Thread.sleep(5000);
	    SRR.clickOnClaimMis();
	    test.log(LogStatus.PASS, "ClaimMis data displayed successfully");
	    Thread.sleep(5000);
	    SRR.clickCloseClaim();
	    test.log(LogStatus.PASS, "Clicked closebutton of claimMis successfully");
	    Thread.sleep(5000);
	    SRR.clickSendEmail();
	    test.log(LogStatus.PASS, "Clicked sendEmail successfully");
	    SRR.clickOnEmail();
	    Thread.sleep(5000);
	    test.log(LogStatus.PASS, "Email is selected successfully");
	    SRR.getData();
	    Thread.sleep(5000);
	    test.log(LogStatus.PASS, "Requirement document selected successfully");
	    SRR.sendEmail();
	    Thread.sleep(10000);
	    SRR.clickOk();
	    Thread.sleep(8000);
	    test.log(LogStatus.PASS, "Email sent successfully to the respective mail id");
	    SRR.clickdownload();
	    Thread.sleep(5000);
	    test.log(LogStatus.PASS, "Clicked on download button successfully ");
	    SRR.clickAgebandingDownload();
	    Thread.sleep(5000);
	    test.log(LogStatus.PASS, "Agebandinding downloaded successfully ");
	    SRR.clickClaimAnalysis();
	    Thread.sleep(9000);
	    test.log(LogStatus.PASS, "ClaimAnalysis downloaded successfully ");
	    Thread.sleep(9000);
	    
	    SRR.clickClaimMis();
	    test.log(LogStatus.PASS, "ClaimMis downloaded successfully ");
	    Thread.sleep(9000);
	    SRR.clickEmployeedependentData();
	    test.log(LogStatus.PASS, "EmployeedependentData downloaded successfully ");
	    Thread.sleep(9000);
	    SRR.clickIRDA();
	    test.log(LogStatus.PASS, "IRDA downloaded successfully ");
	    Thread.sleep(5000);
	    SRR.clickRfqCoverage();
	    test.log(LogStatus.PASS, "RfqCoverage downloaded successfully ");
	    Thread.sleep(5000);
	    SRR.clickAllFiles();
	    test.log(LogStatus.PASS, "AllFiles zip downloaded successfully ");
	    Thread.sleep(5000);
	   // SRR.clickCloseDownload();
	    test.log(LogStatus.PASS, "close download successfully ");
	    
		
		
	}

}
