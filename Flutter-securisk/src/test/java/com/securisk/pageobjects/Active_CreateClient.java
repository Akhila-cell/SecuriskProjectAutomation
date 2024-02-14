package com.securisk.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.securisk.utilities.genericMethods;

public class Active_CreateClient {
	WebDriver driver;

	public Active_CreateClient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	genericMethods gs = new genericMethods();

	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Client List')]")
	public WebElement ClientList;

	public void dropdownClient() {
		// ClientList.isEnabled();
		ClientList.click();

	}

	@FindBy(css = "flt-semantics[aria-label='Active']")
	public WebElement ActiveOption;

	public void ActuveOp() {
		ActiveOption.click();

	}

	// Create Client
	@FindBy(css = "flt-semantics[aria-label=\"Create Client\"]")
	WebElement CreateClient;

	public void Create_Client() {
		CreateClient.click();
	}

	@FindBy(css = "input[aria-label='Client Name']")
	WebElement ClientName;

	public void client_Name() {
		gs.textField(ClientName, "TCS");

	}

	@FindBy(css = "flt-semantics[aria-label='Location']")
	WebElement Location;

	public void client_Location() {
		Location.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Bangalore\"]")
	WebElement LoctationDrop;

	public void location_Drop_Name() {
		LoctationDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='ProductType']")
	WebElement Product;

	public void product_Type() {
		Product.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"new products\"]")
	WebElement ProductDrop;

	public void product_Drop_Type() {
		ProductDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='InsuranceCompany']")
	WebElement Insurance;

	public void isurance_Company() {
		Insurance.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Oriental Insurance Co.Ltd']")
	WebElement InsuraneDrop;

	public void insurance_Drop_CompanyName() {
		InsuraneDrop.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Create']")
	WebElement Create;

	public void create_Client_Button() {
		Create.click();
	}

	// Filter Option

	@FindBy(css = "flt-semantics[aria-label=\"Bangalore\"]")
	WebElement FilterClick;

	public void filter_Click() {
		FilterClick.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Filter By']")
	public WebElement Filter;

	public void filterOpp() {
		Filter.click();

	}

	// Search Option
	@FindBy(css = "input[aria-label='Search']")
	WebElement Search;

	public void searchop() {
		Search.sendKeys("TCS");

	}

	// Previous Button
	@FindBy(css = "flt-semantics[aria-label='Previous']")
	WebElement Previous;

	public void previous_Button() {
		Previous.click();
	}

	// Next Button
	@FindBy(css = "flt-semantics[aria-label='Next']")
	WebElement Next;

	public void next_Button() {
		Next.click();
	}

	// Show Products
	@FindBy(xpath = "(//flt-semantics[@aria-label='Show menu'])[2]")
	WebElement ShowMenuDots;

	public void showMenu_Dots() {
		ShowMenuDots.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Show Products\"]")
	WebElement Showproducts;

	public void showproducts_Option() {
		Showproducts.click();
	}

	@FindBy(xpath = "//*[@aria-label='Products']/descendant::flt-semantics[@role='button']")
	WebElement CloseButton;

	public void close_Button() {
		CloseButton.click();
	}

	// Add Product
	@FindBy(css = "flt-semantics[aria-label=\"Add Product\"]")
	WebElement AddProduct;

	public void addProduct_Option() {
		AddProduct.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"ProductType\"]")
	WebElement ProductType;

	public void product_Type1() {
		ProductType.click();
	}

	@FindBy(css = "(flt-semantics[aria-label='Shipping & Containers']")
	WebElement CovidPolicy;

	public void covid_Policy() {
		CovidPolicy.click();
	}

	@FindBy(xpath = "//*[@aria-label='InsuranceCompany']")
	WebElement InsuranceCompany;

	public void insurance_Company1() {
		InsuranceCompany.click();
	}

	@FindBy(css = " flt-semantics[aria-label='Kotak Mahindra Life Insurance Co.Ltd']")
	WebElement InsuranceCompanyName;

	public void insuranceCompany_Name() {
		InsuranceCompanyName.click();
	}

	@FindBy(xpath = "//*[@aria-label='Product Add']")
	WebElement ProductAdd1;

	public void Product_Add1() {
		ProductAdd1.click();
	}

	@FindBy(xpath = "//*[@aria-label='Close']")
	WebElement ProductClose;

	public void product_Close() {
		ProductClose.click();
	}

	// Add User
	@FindBy(xpath = "//*[@aria-label='Add User']")
	WebElement AddUser;

	public void client_AddUser() {
		AddUser.click();
	}

	@FindBy(xpath = "//*[@aria-label='Employee Id']")
	WebElement EmployeeId;

	public void employee_Id() {
		gs.textField(EmployeeId, "147589");

	}

	@FindBy(css = "input[aria-label='Name']")
	WebElement EmployeeName;

	public void employeeName() {
		gs.textField(EmployeeName, "Honey");

	}

	@FindBy(css = "flt-semantics[aria-label='Designation']")
	WebElement Designation;

	public void designation() {
		Designation.click();
	}

	@FindBy(xpath = "//*[@aria-label='Regional Head']")
	WebElement RegionalHead;

	public void regionalHead() {
		RegionalHead.click();
	}

	@FindBy(xpath = "//*[@aria-label='Email Id']")
	WebElement EmailId;

	public void emailId() {
		gs.textField(EmailId, "honey@gmail.com");

	}

	@FindBy(xpath = "//*[@aria-label='Phone Number']")
	WebElement PhoneNumber;

	public void phone_Number() {
		gs.textField(PhoneNumber, "9759154698");

	}

	@FindBy(css = "flt-semantics[aria-label='Create']")
	WebElement CreateUser;

	public void create_User() {
		CreateUser.click();
	}

	@FindBy(css = "flt-semantics[aria-label='Close']")
	WebElement CloseUser;

	public void close_User() {
		CloseUser.click();
	}

	                                          // Delete Product
	
	@FindBy(css="flt-semantics[aria-label=\"2\"]")
	WebElement DeleteProduct;
	public void deleteProduct() {
		DeleteProduct.click();
	}

	@FindBy(xpath="(//*[@aria-label=\"1\"])[2]")
	WebElement DeleteProduct2;
	public void deleteProduct2() {
		DeleteProduct2.click();
	}
	@FindBy(xpath = "(//*[@aria-label=\"Show menu\"])[1]")
	WebElement ProductNo;

	public void product_No() {
		ProductNo.click();
	}

	

	@FindBy(css= " flt-semantics[aria-label=\"Delete\"]")
	WebElement Delete_Product;

	public void delete_Product() {
		Delete_Product.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"Yes\"]")
	WebElement Delete_Yes;

	public void delete_Yes() {
		Delete_Yes.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"OK\"]")
	WebElement ProuductDelete_ok;

	public void prouductDelete_ok() {
		ProuductDelete_ok.click();
	}

	                                                        // delete User
	@FindBy(xpath = "(//*[@aria-label='1'])[2]")
	WebElement AddedUserNo;

	public void addedUserNo1() {
		AddedUserNo.click();
	}

	@FindBy(xpath = "//*[@aria-label=\"Show menu\"]")
	WebElement AddedUserNo_Dots;

	public void addedUserNo_Dots() {
		AddedUserNo_Dots.click();
	}

	@FindBy(xpath =  "//*[@aria-label=\"Delete\"]")
	WebElement DeleteUser;

	public void deleteUser() {
		DeleteUser.click();
	}

//	@FindBy(xpath = "//*[@aria-label=\"Delete\"]")
//	WebElement Deletete_User_Yes;
//
//	public void deletete_User_Yes() {
//		Deletete_User_Yes.click();
//	}

	@FindBy(xpath = "//*[@aria-label=\"Yes\"]")
	WebElement Delete_User_Yes_Click;

	public void deletete_User_Yes_Click() {
		Delete_User_Yes_Click.click();
	}   
	@FindBy(xpath = "//*[@aria-label='OK']")// flt-semantics[aria-label=\"OK\"]
	WebElement DeleteUserFromUser;
	
	public void deleteUser_FromUser() {
		 DeleteUserFromUser.isDisplayed();
		 DeleteUserFromUser.click();
	}
	//EDIT
    @FindBy(css="flt-semantics[aria-label=\"Edit\"]")
    WebElement EditClick;
    public void editClick(String edit) throws Exception {
	EditClick.click();
	Thread.sleep(3000);
	EditClick.clear();
	EditClick.sendKeys(edit);
	
}
	@FindBy(xpath= "//*[@aria-label='Client Name']")
	WebElement Edit;

	public void edit_List() throws Exception {
		Thread.sleep(3000);
		Edit.click();
	}
	public void clear() {
		
		Edit.clear();
	}
	public void newName() {
		gs.textField(ClientName, "Infosys");
	}

	@FindBy(xpath = "//*[contains(@aria-label,'Location')]")
	WebElement New_ClientLoc;

	public void new_ClientLoc() {
		New_ClientLoc.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"Bangalore\"]")
	WebElement LocationName3;

	public void new_Loc() {
		
		LocationName3.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"Update\"]")
	WebElement Update_Edit;

	public void update_Edit() {
		Update_Edit.click();

	}
	@FindBy(css="flt-semantics[aria-label=\"Close\"]")
	WebElement Update_Close;
	public void update_Close() {
		Update_Close.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"LOGIN\"]")
	WebElement Login;

	public void login() {
		Login.click();

	}
	                                                  //Edit user in the create user
	@FindBy(css="flt-semantics[aria-label=\"Edit\"]")
	WebElement EditUserButton_userlist;
	public void editUserButton_userlist() {
		EditUserButton_userlist.click();
	}
	@FindBy(css=" input[aria-label=\"Employee Id\"]")
	WebElement EMPID;
	public void empid_user(String empid) throws Exception {
		EMPID.click();
		Thread.sleep(8000);
		EMPID.clear();
		Thread.sleep(8000);
		EMPID.sendKeys(empid);
	}
	@FindBy(xpath="//*[@aria-label=\"Name\"]")
	WebElement EmpId_User;
	public void  empId_UserName(String  uName) throws Exception {
		
		EmpId_User.click();
		Thread.sleep(3000);
		EmpId_User.clear();
		Thread.sleep(3000);
		EmpId_User.sendKeys(uName);

	}
	

	@FindBy(xpath= "//*[@aria-label=\"Accounts Head\"]")
	WebElement Designation2;

	public void designation2( ) throws Exception {
		Designation2.click();
		
	}
	@FindBy(css=" input[aria-label=\"Email\"]")
	WebElement EmailId_User;
	public void  emailId_User(String email) throws Exception {
		EmailId_User.click();
		Thread.sleep(3000);
		EmailId_User.clear();
		Thread.sleep(3000);
		EmailId_User.sendKeys(email);
		
	}
	@FindBy(css=" input[aria-label=\"Phone Number\"]")
	WebElement Phone_User;
    public void phn(String phoneno) {
	Phone_User.click();
	Phone_User.clear();
	Phone_User.sendKeys(phoneno);
}
	@FindBy(css="flt-semantics[aria-label=\"Submit\"]")
	WebElement Submit_User;
	public void submit_User() {
		Submit_User.click();
	}
	
	
	@FindBy(xpath="(//*[@aria-label=\"8\"])[2]")
	WebElement EditUserButton2;
	public void editUserButton2() {
		EditUserButton2.click();
	}
	@FindBy(css="flt-semantics[aria-label='Delete']")
	WebElement deleteAll;
	public void delete_All() {
		deleteAll.click();
	}
	@FindBy(css="flt-semantics[aria-label='Yes']")
	WebElement DeleteAll_Yes;
	public void deleteAll_Yes() {
	DeleteAll_Yes.click();
	}
	@FindBy(css=" flt-semantics[aria-label='OK']")
	WebElement DeleteAll_Yes_Ok;
	public void deleteAll_Yes_Ok() {
		DeleteAll_Yes_Ok.click();
	}
}

