package com.securisk.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryTpaPageElements;
import com.securisk.utilities.Reusablemethods;

public class IntermediaryCreateTpaTest  extends BaseClass{


	public IntermediaryCreateTpaTest() {
		super(driver, wait);
		
	}
	
	@Test(priority = 1)
	
	public void createTpa() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
//		Tc_LoginPage tc= new Tc_LoginPage();
//		tc.launch();
		startReport("CreateTpa");
		IntermediaryTpaPageElements tp = new IntermediaryTpaPageElements(driver);
		test = reports.startTest("AddTpa With Valid Data");
		WaitUntilElementVisible(tp.IntermediaryDropdown);
		tp.clickOnIntermediary();
		WaitUntilElementVisible(tp.TPAButton);
		tp.clickOnTPA();
		WaitUntilElementVisible(tp.CreateTpaBtn);
		tp.clickOnCreateTpa();
		WaitUntilElementVisible(tp.TpaNameTextField);
		tp.enterTpaName("Test1");
		WaitUntilElementVisible(tp.TpaLocationDropdown);
		tp.clickonLocation();
		WaitUntilElementVisible(tp.MumbaiValue);
		tp.selectLocation("Chennai");
		WaitUntilElementVisible(tp.CreateButton);
		tp.clickOnCreate();
		WaitUntilElementVisible(tp.ClosePopupbtn);
		Assert.assertTrue(tp.ConfirmCreateTpa());
		String path= rc.ScreenshotPath("CreateTpa");
		test.log(LogStatus.PASS,test.addScreenCapture(path)+" Tpa scucessfully created");
		tp.closePopUP();
	}
	
}
