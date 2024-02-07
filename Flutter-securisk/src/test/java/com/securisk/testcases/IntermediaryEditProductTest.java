package com.securisk.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.IntermediaryProductsPage;
import com.securisk.utilities.Reusablemethods;


public class IntermediaryEditProductTest extends IntemediaryAddCoverageTest {
	
	
	@Test(priority = 6)
	public void editProduct() throws Exception {
		IntermediaryProductsPage ip= new IntermediaryProductsPage(driver);
		Reusablemethods rc = new Reusablemethods(driver);
		test = reports.startTest("Edit Product");
		WaitUntilElementVisible(ip.IntermediaryDropdown);
		ip.clickOnIntermediary();
		Thread.sleep(3000);
		WaitUntilElementVisible(ip.ProductsButton);
		ip.clickOnProducts();
		WaitUntilElementVisible(ip.FilterDropdown);
		ip.Filtertype();
		WaitUntilElementVisible(ip.SearchField);
		ip.searchProduct("Demo");
		WaitUntilElementVisible(ip.ShowmenuBtn);
		ip.clickonShowMenu();
		WaitUntilElementVisible(ip.EditProductBtn);
		ip.clickOnEditProduct();
		test.log(LogStatus.PASS, "Edit product clicked ");
		WaitUntilElementVisible(ip.EditProductnameField);
		ip.updateProductName("Demo1");
		WaitUntilElementVisible(ip.EditProductTypedropdown);
		ip.updateProductType();
		WaitUntilElementVisible(ip.NonEBValue);
		ip.selectNonEBProduct();
		WaitUntilElementVisible(ip.UpdateProductBtn);
		ip.clickOnUpdateProduct();
		test.log(LogStatus.PASS, "Update product clicked");
		WaitUntilElementVisible(ip.OkBtn);
		Assert.assertTrue(ip.ProductEdited());
		String path=rc.ScreenshotPath("EditProduct");
		test.log(LogStatus.PASS,test.addScreenCapture(path)+ "Product Edited scucessfully");
		ip.clickonOkBtn();
		endReport();
		
	
	}

}
