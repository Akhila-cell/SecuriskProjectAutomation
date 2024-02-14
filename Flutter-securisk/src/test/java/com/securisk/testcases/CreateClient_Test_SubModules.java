package com.securisk.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.Active_CreateClient;
import com.securisk.pageobjects.ClientList;
import com.securisk.pageobjects.Loginpage;
import com.securisk.utilities.Reusablemethods;

public class CreateClient_Test_SubModules extends BaseClass {
	public CreateClient_Test_SubModules() {
		super(driver, wait);

	}

	                                      // Login
	@Test(priority = 1)
	public void loginApplication() throws Exception {

		Tc_LoginPage lp = new Tc_LoginPage();
		

		lp.launch();
		Thread.sleep(4000);
	    Active_CreateClient cl = new Active_CreateClient(driver);
	    startReport("CreateClientActive");
	    test = reports.startTest("Test cases for create dropdown");
	
		cl.dropdownClient();
		test.log(LogStatus.PASS, " Client List button Cliecked Successfully");
		Thread.sleep(4000);
		cl.ActuveOp();
		test.log(LogStatus.PASS, "Under Client List Active Sub-Module Clicked Successfully");
		Thread.sleep(4000);
		endReport();
	}

	@Test(priority = 2)
	public void createClient() throws Exception {

		Active_CreateClient aa = new Active_CreateClient(driver);
		test = reports.startTest("Test cases for create client");

		
		aa.Create_Client();

		test.log(LogStatus.PASS, "Create Client Button Clicked Successfully");
		Thread.sleep(2000);
		aa.client_Name();
		test.log(LogStatus.PASS, "Client Name Entered Successfully");
		Thread.sleep(2000);
		aa.client_Location();
		test.log(LogStatus.PASS, "Client Location Entered Successfully");
		Thread.sleep(2000);
		aa.location_Drop_Name();
		test.log(LogStatus.PASS, "Under Location DropDown Location Selected Successfully");
		Thread.sleep(2000);

		aa.product_Type();
		test.log(LogStatus.PASS, " Under Create Client Product Type clicked Successfully");
		Thread.sleep(2000);
		aa.product_Drop_Type();
		test.log(LogStatus.PASS, " Under Create Client Product Type Selected Successfully");
		Thread.sleep(2000);
		aa.isurance_Company();
		test.log(LogStatus.PASS, " Under Create Insurance Company clicked Successfully");
		Thread.sleep(2000);

		aa.insurance_Drop_CompanyName();
		test.log(LogStatus.PASS, " Under Create Insurance Company Selected Successfully");
		Thread.sleep(2000);

		aa.create_Client_Button();
		test.log(LogStatus.PASS, " Under Create Client Created Successfully");
		Thread.sleep(2000);
		endReport();
	}
//	@Test(priority = 3)
//	public void search_Option() throws Exception {
//		Active_CreateClient cl = new Active_CreateClient(driver);
//		//startReport("Test cases for create client");
//		test = reports.startTest("Create Client");
//		cl.dropdownClient();
//		test.log(LogStatus.PASS, " Client List button Cliecked Successfully");
//		Thread.sleep(4000);
//		cl.ActuveOp();
//		test.log(LogStatus.PASS, "Under Client List Active Sub-Module Clicked Successfully");
//		Thread.sleep(4000);
//	}

	@Test(priority = 3) // Search Options
	public void search() throws Exception {
		Active_CreateClient aa = new Active_CreateClient(driver);
		test = reports.startTest("Test cases for Search Options ");

		aa.filterOpp();
		test.log(LogStatus.PASS, " UnderClient List Filter Option clicked Successfully");
		Thread.sleep(2000);

		aa.filter_Click();
		test.log(LogStatus.PASS, " UnderClient List Filter Option Selected Successfully");
		Thread.sleep(2000);

		aa.searchop();
		test.log(LogStatus.PASS, " UnderClient Search Option clicked Successfully");
		Thread.sleep(2000);
		endReport();
		// driver.navigate().refresh();
	}

	@Test(priority = 4)
	public void actions() throws Exception { // Show products

		Active_CreateClient aa = new Active_CreateClient(driver);
		test = reports.startTest("Test cases for show products");

		aa.showMenu_Dots();
		Thread.sleep(6000);
		aa.showproducts_Option();
		startReport("Test cases for Show products");
		test.log(LogStatus.PASS, " UnderClient after creating client Show products option clicked Successfully");
		Thread.sleep(6000);
		aa.close_Button();

		test.log(LogStatus.PASS,
				" UnderClient after creating client After displaying Show products option it is closed Successfully");
		Thread.sleep(4000);
		endReport();

	}

	@Test(priority = 5) // Add Products
	public void showProducts() throws Exception {


		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for Add product");


		aa.showMenu_Dots();

		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
		Thread.sleep(6000);

		aa.addProduct_Option();

		test.log(LogStatus.PASS, " UnderClient after creating client add products option clicked Successfully");
		Thread.sleep(5000);
		aa.product_Type1();
		test.log(LogStatus.PASS,
				" UnderClient after creating client add products option Product type clicked Successfully");
		Thread.sleep(2000);
		aa.covid_Policy();

		test.log(LogStatus.PASS,
				" UnderClient after creating client add products option Product type Selected Successfully");
		Thread.sleep(2000);
		aa.insurance_Company1();

		test.log(LogStatus.PASS,
				" UnderClient after creating client add products option  Insurance Company clicked Successfully");
		Thread.sleep(2000);
		aa.insurance_Drop_CompanyName();

		test.log(LogStatus.PASS,
				" UnderClient after creating client add products option  Insurance Company Name Selected Successfully");
		Thread.sleep(2000);
		aa.Product_Add1();

		test.log(LogStatus.PASS, " UnderClient after creating client add products option  Product Added Successfully");
		Thread.sleep(2000);
		aa.product_Close();
		test.log(LogStatus.PASS,
				" UnderClient after creating After Adding the products close pop-up closed Successfully");
		Thread.sleep(2000);
		endReport();

	}

	@Test(priority = 6) // Add user
	public void addUser() throws Exception {

		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for add user");

		aa.showMenu_Dots();

		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
		Thread.sleep(5000);

		aa.client_AddUser();
		test.log(LogStatus.PASS, " UnderClient after creating client under Actions Add User clicked Successfully");
		Thread.sleep(5000);

		aa.employee_Id();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User EmployeeId Entered Successfully");
		Thread.sleep(7000);

		aa.employeeName();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User Employee Name Entered Successfully");
		Thread.sleep(5000);

		aa.designation();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions Add User Designation clicked Successfully");
		Thread.sleep(5000);

		aa.regionalHead();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User Designation Entered Successfully");
		Thread.sleep(5000);

		aa.emailId();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User email Entered Successfully");
		Thread.sleep(8000);

		aa.phone_Number();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User Phone Number Entered Successfully");
		Thread.sleep(7000);

		aa.create_User();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User,After entering all the details User button clicked Successfully");
		Thread.sleep(5000);

		aa.close_User();
		test.log(LogStatus.PASS,
				" UnderClient after creating client under Actions after clicking on Add User,After entering all the details User will create then Close pop-up clicked Successfully");
		Thread.sleep(5000);
		endReport();

	}

	@Test(priority =7 ) // Delete Product
	public void productNumber() throws Exception {

		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for delete product");


		aa.deleteProduct();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user clicking on product is successfully");

		Thread.sleep(5000);

		aa.product_No();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user click on productno then in that dots are selecting is successfully");
		Thread.sleep(5000);

		aa.delete_Product();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user product deleting is successfully");
		Thread.sleep(5000);
		
		aa.delete_Yes();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user product deleted pop-up clicked  successfully");
		Thread.sleep(5000);
		
		aa.prouductDelete_ok();
		test.log(LogStatus.PASS, "Product deleted  successfully");
		Thread.sleep(5000);
		endReport();
	}
	@Test(priority =8 ) // Delete Product
	public void productNumber2() throws Exception {

		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for delete product");


		aa.deleteProduct2();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user clicking on product is successfully");

		Thread.sleep(5000);

		aa.product_No();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user click on productno then in that dots are selecting is successfully");
		Thread.sleep(5000);

		aa.delete_Product();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user product deleting is successfully");
		Thread.sleep(5000);
		
		aa.delete_Yes();
		test.log(LogStatus.PASS,
				" UnderClient in Actions after creation of product and user product deleted pop-up clicked  successfully");
		Thread.sleep(5000);
		
		aa.prouductDelete_ok();
		test.log(LogStatus.PASS, "Product deleted  successfully");
		Thread.sleep(5000);
		endReport();
	}


	@Test(priority = 9) // Delete User
	public void userNoClick() throws Exception {
	
		Active_CreateClient aa = new Active_CreateClient(driver);
		test = reports.startTest("Test cases for delete user");

		aa.addedUserNo1();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then user numbers clicked is successfully");
		Thread.sleep(5000);
		aa.addedUserNo_Dots();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then  after clicking on user numbers  dots clicked is successfully");

		Thread.sleep(5000);
		aa.deleteUser();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then  after clicking on user numbers  dots delete option  clicked is successfully");

		Thread.sleep(8000);
		aa.deletete_User_Yes_Click();
		test.log(LogStatus.PASS, "user deleted successfully");
		Thread.sleep(5000);
		aa.deleteUser_FromUser();
		test.log(LogStatus.PASS, "user delete ok pop-up clicked successfully");
		endReport();

	}

	//@Test(priority = 9)                //edit 
	public void editClient() throws Exception {
		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for Edit");

		aa.showMenu_Dots();

		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
		Thread.sleep(5000);

		aa.editClick("Ojas");
		test.log(LogStatus.PASS, "Edit button clicked successfully");
		Thread.sleep(5000);
		aa.edit_List();
		
		test.log(LogStatus.PASS, "Edit list clicked successfully");
		Thread.sleep(5000);
		aa.clear();
		Thread.sleep(5000);
		aa.newName();
		Thread.sleep(5000);
		aa.new_ClientLoc();
		test.log(LogStatus.PASS, "new client name given successfully");
		Thread.sleep(5000);
		aa.new_Loc();
		test.log(LogStatus.PASS, "new client location given successfully");
		Thread.sleep(5000);
		aa.update_Edit();
		test.log(LogStatus.PASS, "Edit client Updated successfully");
		
		Thread.sleep(5000);
		aa.update_Close();
		test.log(LogStatus.PASS, "Edit client Updated and closed successfully");
		endReport();
		
	}
	
	//@Test(priority = 3)
	public void editUser() throws Exception {
		Active_CreateClient aa = new Active_CreateClient(driver);
		test = reports.startTest("Test cases for edit user");


		aa.editUserButton2();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then user numbers clicked is successfully");
		Thread.sleep(5000);
		aa.addedUserNo_Dots();
		test.log(LogStatus.PASS,
				" UnderClient After Adding user if we want to delete user then  after clicking on user numbers  dots clicked is successfully");

		Thread.sleep(5000);
		aa.editUserButton_userlist();
		test.log(LogStatus.PASS,"Edit user clicked successfully");
		Thread.sleep(8000);
		aa.empid_user("012");
		test.log(LogStatus.PASS,"Edit user emiid entered successfully");
		endReport();
//		Thread.sleep(5000);
//		aa.empId_UserName("Sheethal");
//		test.log(LogStatus.PASS,"Edited username entered successfully");
//		Thread.sleep(5000);
//		aa.designation2();
//		test.log(LogStatus.PASS,"Designation entered successfully");
//		Thread.sleep(5000);
//		
//		aa.emailId_User("sithu@gmail.com");
//		test.log(LogStatus.PASS,"email clicked and entered successfully");
//		Thread.sleep(5000);
//		
//		aa.phn("1234567894");
//		
//		test.log(LogStatus.PASS,"phone no field  clicked and entered successfully");
//		Thread.sleep(5000);
//		aa.submit_User();
//		test.log(LogStatus.PASS,"edited user submited successfully");
//		
//		
	}
	@Test(priority = 10)  //DeleteAll
	public void deleteAll() throws Exception {

		Active_CreateClient aa = new Active_CreateClient(driver);

		test = reports.startTest("Test cases for DeleteAll");

		aa.showMenu_Dots();

		test.log(LogStatus.PASS, " UnderClient after creating client Showmenu dots Clicked Successfully");
		Thread.sleep(5000);
		aa.delete_All();
		test.log(LogStatus.PASS, " It is clicked on delete  Successfully");
		Thread.sleep(5000);
        aa.deleteAll_Yes();
		test.log(LogStatus.PASS, " It is clicked on delete yes clicked Successfully");
		Thread.sleep(5000);
        aa.deleteAll_Yes_Ok();
        test.log(LogStatus.PASS, " It is clicked on delete yes ok clicked Successfully");
		Thread.sleep(5000);
		endReport();
	}

}
