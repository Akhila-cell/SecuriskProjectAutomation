package com.securisk.testcases;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryInsurerListPage;
import com.securisk.utilities.Reusablemethods;

public class IntermediaryCreateInsurerTest extends IntermediaryDeleteTpaTest {

	@Test(priority = 11)
	public void createInsurer() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		test = reports.startTest("createInsurer");
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		WaitUntilElementVisible(il.IntermediaryDropdown);
		il.clickOnIntermediary();
		WaitUntilElementVisible(il.InsurerlistButton);
		il.clickOnInsureList();
		WaitUntilElementVisible(il.CreateInsurerBtn);
		il.clickOnCreateInsure();
		WaitUntilElementVisible(il.Insusernametextfield);
		il.enterInsurerName("DemoInsurer");
		WaitUntilElementVisible(il.InsurerLocationDropdown);
		il.clickonLocation();
		WaitUntilElementVisible(il.BangaloreValue);
		il.selectLocation("Bangalore");
		WaitUntilElementVisible(il.EmailTextField);
		il.enterEmail("Demo@gmail.com");
		WaitUntilElementVisible(il.ManagerNameTextField);
		il.enterManagerName("Chandra");
		WaitUntilElementVisible(il.PhoneNumberField);
		il.enterPhonenumber("6655443322");
		WaitUntilElementVisible(il.CreateBtn);
		String path = rc.ScreenshotPath("createInsurer");
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Create user");
		il.clickOnCreate();
		endReport();

	}

	@Test(priority = 12)
	public void addUser() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		test = reports.startTest("Add User");
		WaitUntilElementVisible(il.SearchField);
		il.searchInsurer("Demo");
		WaitUntilElementVisible(il.ActionsShowMenu);
		il.clickOnActions();
		WaitUntilElementVisible(il.AddUserBtn);
		il.clickOnAddUser();
		WaitUntilElementVisible(il.EmailTextField);
		il.enterEmail("Test@gmail.com");
		WaitUntilElementVisible(il.ManagerNameTextField);
		il.enterManagerName("Tester");
		WaitUntilElementVisible(il.PhoneNumberField);
		il.enterPhonenumber("5544998877");
		WaitUntilElementVisible(il.InsurerLocationDropdown);
		il.clickonLocation();
		WaitUntilElementVisible(il.PuneValue);
		il.selectLocation("Pune");
		WaitUntilElementVisible(il.SubmitBtn);
		il.clickOnSubmit();
		WaitUntilElementVisible(il.ConfirmAdduserText);
		String path = rc.ScreenshotPath("Add User");
		Assert.assertTrue(il.confirmAddUser());
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Add user scucessfull");
		WaitUntilElementVisible(il.ClosePopupbtn);
		il.closePopUP();
		endReport();
	}

	@Test(priority = 13)
	public void editUser() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		test = reports.startTest("EditUser");
		WaitUntilElementVisible(il.SearchField);
		il.searchInsurer("DemoInsurer");
		WaitUntilElementVisible(il.Userbutton);
		il.clickOnUser();
		try {
			WaitUntilElementVisible(il.userShowmenubutton);
			il.clickOnUserShowMenu();
		} catch (StaleElementReferenceException e) {
			WaitUntilElementVisible(il.userShowmenubutton);
			il.clickOnUserShowMenu();
		}
		WaitUntilElementVisible(il.Edituserbutton);
		il.clickOnUserEdit();
		WaitUntilElementVisible(il.EditManagerField);
		il.clickManagerName();
		il.editManagerName("sekhar");
		WaitUntilElementVisible(il.EditLocation);
		il.editUserLocation();
		WaitUntilElementVisible(il.MumbaiValue);
		il.selectLocation("Mumbai");
		WaitUntilElementVisible(il.SubmitBtn);
		il.clickOnSubmit();
		WaitUntilElementVisible(il.ConfirmEditUser);
		String path = rc.ScreenshotPath("EditUser");
		Assert.assertTrue(il.confirmUserEdit());
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Edit user scucessfull");
		WaitUntilElementVisible(il.ClosePopupbtn);
		il.closePopUP();
		endReport();

	}
	@Test(priority = 14)
	public void deleteUser() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		test = reports.startTest("Delete User");
		WaitUntilElementVisible(il.SearchField);
		il.searchInsurer("DemoInsurer");
		WaitUntilElementVisible(il.Userbutton);
		il.clickOnUser();
		try {
			WaitUntilElementVisible(il.userShowmenubutton);
			il.clickOnUserShowMenu();
		} catch (StaleElementReferenceException e) {
			WaitUntilElementVisible(il.userShowmenubutton);
			il.clickOnUserShowMenu();
		}
		WaitUntilElementVisible(il.DeleteUserBtn);
		il.clickOnDeleteUser();
		WaitUntilElementVisible(il.ConfimDeleteYesBtn);
		il.acceptDelete();
		WaitUntilElementVisible(il.ConfirmDeleteUser);
		Assert.assertTrue(il.confirmUserDelete());
		String path = rc.ScreenshotPath("Delete User");
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Delete user scucessfull");
		WaitUntilElementVisible(il.OkBtn);
		il.clickonOkBtn();
		endReport();
	}
	@Test(priority = 15)
	public void editInsurer() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		test = reports.startTest("edit Insurer");
		WaitUntilElementVisible(il.SearchField);
		il.searchInsurer("Demo");
		WaitUntilElementVisible(il.ActionsShowMenu);
		il.clickOnActions();
		WaitUntilElementVisible(il.EditInsurerbutton);
		il.clickOnInsurerEdit();
		WaitUntilElementVisible(il.EditLocation);
		il.editUserLocation();
		WaitUntilElementVisible(il.HydValue);
		il.selectLocation("Hyderabad");
		WaitUntilElementVisible(il.SubmitBtn);
		il.clickOnSubmit();
		WaitUntilElementVisible(il.ConfirmEditInsurer);
		String path = rc.ScreenshotPath("EditInsurer");
		Assert.assertTrue(il.confirmInsurerEdit());
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Edit Insurer scucessfull");
		WaitUntilElementVisible(il.ClosePopupbtn);
		il.closePopUP();
		endReport();

	}

	@Test(priority = 16)
	public void deleteInsurer() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
		test = reports.startTest("Delete Insurer");
		WaitUntilElementVisible(il.SearchField);
		il.searchInsurer("Demo");
		WaitUntilElementVisible(il.ActionsShowMenu);
		il.clickOnActions();
		WaitUntilElementVisible(il.DeleteInsurerBtn);
		il.clickOnDeleteInsurer();
		WaitUntilElementVisible(il.ConfimDeleteYesBtn);
		il.acceptDelete();
		WaitUntilElementVisible(il.ConfirmDeleteInsurer);
		Assert.assertTrue(il.confirmInsurerDelete());
		String path = rc.ScreenshotPath("Delete User");
		test.log(LogStatus.PASS, test.addScreenCapture(path) + "Delete user scucessfull");
		WaitUntilElementVisible(il.OkBtn);
		il.clickonOkBtn();
		endReport();	
	}
}
