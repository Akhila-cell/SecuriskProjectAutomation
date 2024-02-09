package com.securisk.testcases;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import com.securisk.pageobjects.IntermediaryInsurerListPage;
import com.securisk.utilities.Reusablemethods;

public class IntermediaryCreateInsurerTest extends BaseClass {
	public IntermediaryCreateInsurerTest() {
		super(driver, wait);

	}

	@Test(priority = 2)
	public void createInsurer() throws Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		Tc_LoginPage tc = new Tc_LoginPage();
		tc.launch();
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
		il.enterManagerName("Tester");
		WaitUntilElementVisible(il.PhoneNumberField);
		il.enterPhonenumber("6655443322");
		WaitUntilElementVisible(il.CreateBtn);
		il.clickOnCreate();

	}
	
	@Test(priority = 3)
	public void editUser() {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryInsurerListPage il = new IntermediaryInsurerListPage(driver);
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
		rc.doubleClickText(il.EditManagerField);
	}

}
