package com.securisk.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.CorpporateDetailspage_Fresh;
import com.securisk.pageobjects.RfqPage_Fresh;
import com.securisk.utilities.Reusablemethods;

public class Tc_RfqPageFresh extends Tc_LoginPage{
	@Test(priority = 2)
	public void rfqTestcase() throws InterruptedException, IOException {
	Reusablemethods Rm = new Reusablemethods(driver);
	CorpporateDetailspage_Fresh CRFQ =new CorpporateDetailspage_Fresh(driver);
	RfqPage_Fresh RP =new RfqPage_Fresh(driver);
	test=reports.startTest("Verify the Rfq button");
	WaitUntilElementVisible(RP.RFQLink);
	RP.Rfq();
	test.log(LogStatus.PASS,"RFQpage should be opened ");
	//Rm.ScreenshotPath("Rfq Page");
	WaitUntilElementVisible(RP.CreateRFQ);
	RP.CreateRfq();
	test.log(LogStatus.PASS,"Addpage should be opened ");
	endReport();
	test=reports.startTest("Verify the product category dropdown");
	WaitUntilElementVisible(RP.ProdCategory);
	RP.selectProduct();
	test.log(LogStatus.PASS,"Click on product category dropdown");
	WaitUntilElementVisible(RP.EB);
	RP.SelectEB();
	test.log(LogStatus.PASS,"Select EB in product category");
	WaitUntilElementVisible(RP.ProdType);
	RP.SelectProdType();
	endReport();
	test=reports.startTest("Verify the product type dropdown");
	test.log(LogStatus.PASS,"Click on product type dropdown");
	WaitUntilElementVisible(RP.GHI);
	RP.ghi();
	test.log(LogStatus.PASS,"Select GHI in product type");
	endReport();
	test=reports.startTest("Verify the policy type dropdown");
	WaitUntilElementVisible(RP.Policytype);
	RP.SelectPolicyType();
	test.log(LogStatus.PASS,"Click on policy type dropdown");
	WaitUntilElementVisible(RP.Fresh);
	RP.SelectFresh();
	test.log(LogStatus.PASS,"Select fresh in product type");
	WaitUntilElementVisible(RP.ClickButton);
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
