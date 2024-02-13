package com.securisk.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryProductsPage;
import com.securisk.utilities.Reusablemethods;



public class IntermediaryDeleteProductTest extends IntermediaryEditProductTest {

	@Test(priority = 7)

	public void deleteProduct() throws IOException, Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		test = reports.startTest("Delete Product");
//		ip.clickOnProducts();
//		WaitUntilElementVisible(ip.FilterDropdown);
//		ip.Filtertype();
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		test.log(LogStatus.PASS, "Product Searched");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		test.log(LogStatus.PASS, "ShowMenu Clicked");
		WaitUntilElementVisible(ip.DeleteProductBtn);
		ip.clickOnProductDelete();
		test.log(LogStatus.PASS, "Clicked on Delete");
		WaitUntilElementVisible(ip.ConfimDeleteYesBtn);
		String path=rc.ScreenshotPath("Delete");
		ip.acceptDeleteProduct();
		test.log(LogStatus.PASS,test.addScreenCapture(path)+ "Product Deleted scucessfully");
		WaitUntilElementVisible(ip.OkBtn);
		ip.clickonOkBtn();
		endReport();
	}

}
