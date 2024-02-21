package com.securisk.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorpporateDetailspage_Fresh;
import com.securisk.pageobjects.Rfqpage_Fresh_NonEB;
import com.securisk.utilities.Reusablemethods;



public class Tc_Rfqpage_NonEB_Fresh extends Tc_LoginPage{

	
		@Test
		public void rfqTestcase() throws InterruptedException, IOException {
		Reusablemethods Rm = new Reusablemethods(driver);
		CorpporateDetailspage_Fresh CRFQ =new CorpporateDetailspage_Fresh(driver);
		Rfqpage_Fresh_NonEB NonEB=new Rfqpage_Fresh_NonEB(driver);
		startReport("NOnEB&Fresh_Report");
		test=reports.startTest("Verify the Rfq button as NonEB ");
		//WaitUntilElementVisible(NonEB.RFQLink);
		Thread.sleep(2000);
		NonEB.Rfq();
		test.log(LogStatus.PASS,"RFQpage should be opened ");
		//Rm.ScreenshotPath("Rfq Page");
		//WaitUntilElementVisible(NonEB.CreateRFQ);
		Thread.sleep(2000);
		NonEB.CreateRfq();
		test.log(LogStatus.PASS,"Addrfqpage should be opened ");
		endReport();
		test=reports.startTest("Verify the product category dropdown");
		//WaitUntilElementVisible(NonEB.ProdCategory);
		Thread.sleep(2000);
		NonEB.selectProduct();
		test.log(LogStatus.PASS,"Click on product category dropdown");
		WaitUntilElementVisible(NonEB.Non_EB);
		NonEB.SelectNonEB();
		test.log(LogStatus.PASS,"Select NonEB in product category");
		//WaitUntilElementVisible(NonEB.ProdType);
		Thread.sleep(2000);
		NonEB.SelectProdType();
		endReport();
		test=reports.startTest("Verify the product type dropdown");
		test.log(LogStatus.PASS,"Click on product type dropdown");
		//WaitUntilElementVisible(NonEB.GHI);
		Thread.sleep(2000);
		NonEB.ghi();
		test.log(LogStatus.PASS,"Select Error&omissions in product type");
		endReport();
		test=reports.startTest("Verify the policy type dropdown");
		//WaitUntilElementVisible(NonEB.Policytype);
		Thread.sleep(2000);
		NonEB.SelectPolicyType();
		test.log(LogStatus.PASS,"Click on policy type dropdown");
		//WaitUntilElementVisible(NonEB.Fresh);
		Thread.sleep(2000);
		NonEB.SelectFresh();
		test.log(LogStatus.PASS,"Select fresh in product type");
		//WaitUntilElementVisible(NonEB.ClickButton);
		Thread.sleep(2000);
		NonEB.Submit();
		test.log(LogStatus.PASS,"Click on submit button");
		//Assert.assertTrue(CRFQ.NameOfInsured.isDisplayed(), "Login is not successfully");
		 try {
				boolean actual=CRFQ.NameOfInsured.isDisplayed();
				 Assert.assertEquals(true, actual);
				 test.log(LogStatus.PASS, "RFQ added successfully");
				}catch (Exception e) {
				System.out.println(e.getMessage());
				test.log(LogStatus.FAIL,"RFQ not added successfully");
			}
		Thread.sleep(2000);
		String Path =Rm.ScreenshotPath("Corporatedetailspage");
		test.log(LogStatus.PASS,test.addScreenCapture(Path) +"RFQ added successfully");
		Thread.sleep(2000);
		endReport();
	}

	}


