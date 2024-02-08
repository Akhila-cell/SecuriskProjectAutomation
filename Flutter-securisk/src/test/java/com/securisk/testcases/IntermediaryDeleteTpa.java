package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryTpaPageElements;
import com.securisk.utilities.Reusablemethods;

public class IntermediaryDeleteTpa extends IntermediaryEditTpa {

	@Test(priority = 10)
	public void DeleteTpa() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryTpaPageElements tp = new IntermediaryTpaPageElements(driver);
		test = reports.startTest("Delete Tpa");
		WaitUntilElementVisible(tp.SearchField);
		tp.searchTpa("Test1");
		WaitUntilElementVisible(tp.ShowmenuBtn);
		tp.clickonShowMenu();
		WaitUntilElementVisible(tp.DeleteTpaBtn);
		tp.clickOnDeleteTpa();
		WaitUntilElementVisible(tp.ConfimDeleteYesBtn);
		tp.acceptDeleteTpa();
		WaitUntilElementVisible(tp.ConfirmDelete);
		Assert.assertTrue(tp.confirmDeleteTpa());
		String path = rc.ScreenshotPath("DeleteTPa");
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Delete Tpa Scucessfull");
		WaitUntilElementVisible(tp.OkBtn);
		tp.clickonOkBtn();
		endReport();

	}
}
