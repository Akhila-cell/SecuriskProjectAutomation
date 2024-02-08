package com.securisk.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.securisk.pageobjects.PolicyTermspage_Fresh;

public class Tc_PolicytermsFresh extends Tc_CoveragedetailsFresh {
	
	@Test(priority = 5)
	public void PolicytermsPage() throws InterruptedException, AWTException
	{
		PolicyTermspage_Fresh pt = new PolicyTermspage_Fresh(driver);
		pt.clickonEditButton();
		Thread.sleep(2000);
		
		//pt.clickonEditCoverages("Fever");
		//Thread.sleep(2000);
		
		pt.clickon_Edit_Maternity_Limit_Remarks("Yes");
		Thread.sleep(3000);
		pt.clickon_Edit_ANVMissed();
		Thread.sleep(3000);
		pt.clickon_Edit_ANVMissed_Limit_Remarks2("yes");
		Thread.sleep(3000);
		pt.clickon_Edit_Waiverofintimationclause();
		Thread.sleep(3000);
		pt.clickon_Edit_Waiverofintimationclause_Limit_Remarks3("Yes");
		//pt.clickonaddPolicy();
		Thread.sleep(2000);
		pt.Clickon_Edit_Permanentpartial_Disability();
		Thread.sleep(3000);
		pt.clickon_Edit_TemporarilyTotalDisability_Limits_Remarks4("yes");
		Thread.sleep(3000);
		pt.Clickon_Edit_OPDCover();
		Thread.sleep(2000);
		pt.clickon_Edit_OPDCover_Limits_Remarks5("YES");
		Thread.sleep(2000);
		pt.clickonnext();
	
 
}

}
