package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryTpaPageElements;
import com.securisk.utilities.Reusablemethods;

public class IntermediaryEditTpa extends IntermediaryCreateTpaTest {

	@Test(priority = 2)
	public void editTpa() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryTpaPageElements tp = new IntermediaryTpaPageElements(driver);
		test = reports.startTest("Edit Tpa");
		WaitUntilElementVisible(tp.SearchField);
		tp.searchTpa("Test1");
		WaitUntilElementVisible(tp.ShowmenuBtn);
		tp.clickonShowMenu();	
		WaitUntilElementVisible(tp.EditTpaBtn);
		tp.clickOnEditTpa();
		WaitUntilElementVisible(tp.EditTpaLocation);
		tp.selectNewLocation();
		WaitUntilElementVisible(tp.PuneValue);
		tp.selectLocation("mumbai");
		test.log(LogStatus.PASS, "New Location selected");
		WaitUntilElementVisible(tp.SubmitTpaBtn);
		tp.clickonSubmitTpa();
		WaitUntilElementVisible(tp.ClosePopupbtn);
		Assert.assertTrue(tp.ConfirmUpdateTpa());
		String path= rc.ScreenshotPath("updateTpa");
		test.log(LogStatus.PASS,test.addScreenCapture(path)+" Tpa scucessfully Updated");
		tp.closePopUP();
		endReport();

	}
}
