package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.Loginpage;
import com.securisk.utilities.Reusablemethods;

public class Tc_LoginPage extends Baseclass {

	public Tc_LoginPage() {
		super(driver, wait);

	}

	@Test(priority = 1)

	public void launch() throws Exception {
		Reusablemethods Rm = new Reusablemethods(driver);
		Loginpage Lp = new Loginpage(driver);
		Rm.maximize();
		startReport("EB&Fresh_Report");
		test=reports.startTest("Login with valid credentials");
		Lp.login1();
		test.log(LogStatus.PASS,"Loginpage entered successfully");
		Thread.sleep(2000);
		Lp.Username(username);
		test.log(LogStatus.PASS,"Email id entered successfully");
		Thread.sleep(2000);
		Lp.Password(pwd);
		test.log(LogStatus.PASS,"Password entered successfully");
		Thread.sleep(2000);
		Lp.FinalLogin();
		test.log(LogStatus.PASS,"Login is successfull and homepage is displayed");
		Thread.sleep(2000);
		
		//Assert.assertTrue(Lp.FinalLoginbutton.isDisplayed(), "Login is not successfully");
		
		try {
			boolean actual=Lp.FinalLoginbutton.isDisplayed();
			 Assert.assertEquals(true, actual);
			 test.log(LogStatus.PASS, "loginpage validate successfully");
			 //rm1.Screenshot(driver, "Loginpage123");
			
			}catch (Exception e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL,"loginpage not validated successfully");
		
  }
		Thread.sleep(2000);
		Rm.Screenshot(driver, "Homepage");
		endReport();
		
	}

}
