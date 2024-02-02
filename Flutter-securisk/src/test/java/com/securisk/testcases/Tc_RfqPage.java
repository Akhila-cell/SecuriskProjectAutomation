package com.securisk.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorpporateDetailspage;
import com.securisk.pageobjects.Reusablemethods;
import com.securisk.pageobjects.RfqPage;

public class Tc_RfqPage extends Tc_LoginPage{
	@Test(priority = 2)
	public void rfqTestcase() throws InterruptedException, IOException {
	Reusablemethods Rm = new Reusablemethods(driver);
	CorpporateDetailspage CRFQ =new CorpporateDetailspage(driver);
	RfqPage RP =new RfqPage(driver);
	Thread.sleep(2000);
	test=reports.startTest("Verify the Rfq button");
	RP.Rfq();
	test.log(LogStatus.PASS,"RFQpage should be opened ");
	Rm.ScreenshotPath("Rfq Page");
	RP.CreateRfq();
	test.log(LogStatus.PASS,"Addpage should be opened ");
	Thread.sleep(2000);
	endReport();
	test=reports.startTest("Verify the product category dropdown");
	RP.selectProduct();
	test.log(LogStatus.PASS,"Click on product category dropdown");
	Thread.sleep(2000);
	RP.SelectEB();
	test.log(LogStatus.PASS,"Select EB in product category");
	Thread.sleep(2000);
	RP.SelectProdType();
	endReport();
	test=reports.startTest("Verify the product type dropdown");
	test.log(LogStatus.PASS,"Click on product type dropdown");
	Thread.sleep(2000);
	RP.ghi();
	test.log(LogStatus.PASS,"Select GHI in product type");
	Thread.sleep(2000);
	endReport();
	test=reports.startTest("Verify the policy type dropdown");
	RP.SelectPolicyType();
	test.log(LogStatus.PASS,"Click on policy type dropdown");
	Thread.sleep(2000);
	RP.SelectFresh();
	test.log(LogStatus.PASS,"Select fresh in product type");
	Thread.sleep(2000);
	RP.Submit();
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
