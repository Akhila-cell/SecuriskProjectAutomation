package com.securisk.testcases;

import org.testng.annotations.Test;

import com.securisk.pageobjects.policyTermspage;

public class Tc_Policyterms extends Tc_Coveragedetails {
	
	@Test(priority = 5)
	public void PolicytermsPage() throws InterruptedException
	{
		policyTermspage pt = new policyTermspage(driver);
		pt.clickonedit();
		Thread.sleep(2000);
		pt.clickonaddPolicy();
		Thread.sleep(2000);
		pt.clickonnext();
	
 
}

}
