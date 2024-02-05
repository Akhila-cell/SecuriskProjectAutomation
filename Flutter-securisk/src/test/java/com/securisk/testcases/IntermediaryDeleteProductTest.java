package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobjects.IntermediaryProductsPage;
import pageobjects.Reusablemethods;

public class IntermediaryDeleteProductTest extends Baseclass {

	
	public IntermediaryDeleteProductTest() {
		super(driver, wait);
	}

	@Test(priority = 2)

	public void deleteProduct() throws IOException, Exception {
		Reusablemethods rc = new Reusablemethods(driver);
		Tc_LoginPage tc= new Tc_LoginPage();
		tc.launch();
		IntermediaryProductsPage ip = new IntermediaryProductsPage(driver);
		startReport("IntermediaryDeleteProduct");
		test = reports.startTest("Delete Product");
		WaitUntilElementVisible(ip.IntermediaryDropdown);
		ip.clickOnIntermediary();
		Thread.sleep(3000);
		WaitUntilElementVisible(ip.ProductsButton);
		ip.clickOnProducts();
		WaitUntilElementVisible(ip.FilterDropdown);
		ip.Filtertype();
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
