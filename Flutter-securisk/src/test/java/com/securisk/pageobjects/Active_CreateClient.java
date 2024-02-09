package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	@FindBy(css = "flt-semantics[aria-label='Create Client']")
	WebElement CreateClient;

	public void Create_Client() {
		CreateClient.click();
	}

	@FindBy(css = "input[aria-label='Client Name']")
	WebElement ClientName;

	public void client_Name() {
		gs.textField(ClientName, "KfinTechTCS");

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

	@FindBy(css = " flt-semantics[aria-label=\"Stationary\"]")
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
		Search.sendKeys("KfinTech");

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

	@FindBy(xpath = "(//*[@aria-label=\"new product (a)\"])[3]")
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
	
	@FindBy(css="flt-semantics[aria-label=\"9\"]")
	WebElement DeleteProduct;
	public void deleteProduct() {
		DeleteProduct.click();
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
	@FindBy(css = "flt-semantics[aria-label=\"8\"]")
	WebElement AddedUserNo;

	public void addedUserNo1() {
		AddedUserNo.click();
	}

	@FindBy(xpath = "(// flt-semantics[@aria-label=\"Show menu\"])[1]")
	WebElement AddedUserNo_Dots;

	public void addedUserNo_Dots() {
		AddedUserNo_Dots.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"Delete\"]")
	WebElement DeleteUser;

	public void deleteUser() {
		DeleteUser.click();
	}

	@FindBy(css = "flt-semantics[aria-label=\"Yes\"]")
	WebElement Deletete_User_Yes;

	public void deletete_User_Yes() {
		Deletete_User_Yes.click();
	}

	@FindBy(css = " flt-semantics[aria-label=\"OK\"]")
	WebElement Delete_User_Yes_Click;

	public void deletete_User_Yes_Click() {
		Delete_User_Yes_Click.click();
	}                                                             //EDIT
    @FindBy(css="flt-semantics[aria-label=\"Edit\"]")
    WebElement EditClick;
    public void editClick() {
	EditClick.click();
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
	public void empid_user() throws Exception {
		 Thread.sleep(3000);
		 EMPID.click();
		 Thread.sleep(3000);
		 EMPID.clear();
		 Thread.sleep(3000);
		 gs.textField(EmployeeId, "5678944");
	}
	@FindBy(css=" input[aria-label=\"Name\"]")
	WebElement EmpId_User;
	public void  empId_UserName() throws Exception {
		 Thread.sleep(3000);
		 EmployeeName.click();
		 Thread.sleep(3000);
		 EmployeeName.clear();
		 Thread.sleep(3000);
		 EmployeeName.sendKeys("Babitha");
		 //gs.textField(EmployeeName, "Babitha");
	}

	@FindBy(css = "flt-semantics[aria-label=\"CRM Executive\"]")
	WebElement Designation2;

	public void designation2() {
		Designation2.click();
	}
	@FindBy(css=" input[aria-label=\"Email\"]")
	WebElement EmailId_User;
	public void  emailId_User() throws Exception {
		EmailId_User.click();
		 Thread.sleep(3000);
		 EmailId_User.clear();
		 Thread.sleep(3000);
		gs.textField(EmailId,"babithamyakala@gmail.com");
	}
	@FindBy(css=" input[aria-label=\"Email\"]")
	WebElement Phone_User;
	public void  phone_User() throws Exception {
		 Phone_User.click();
		 Thread.sleep(3000);
		 Phone_User.clear();
		 Thread.sleep(3000);
		gs.textField(PhoneNumber,"1275489456");
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
}
