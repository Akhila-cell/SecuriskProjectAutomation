package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobjects.IntermediaryProductsPage;
import pageobjects.Reusablemethods;

public class IntermediaryEditProductTest extends Baseclass {
	
	public IntermediaryEditProductTest() {
		super(driver, wait);
	}

	@Test(priority = 2)
	public void editProduct() throws Exception {
		IntermediaryProductsPage ip= new IntermediaryProductsPage(driver);
		Reusablemethods rc = new Reusablemethods(driver);
		Tc_LoginPage tc= new Tc_LoginPage();
		tc.launch();
		startReport("IntermediaryEditProduct");
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
