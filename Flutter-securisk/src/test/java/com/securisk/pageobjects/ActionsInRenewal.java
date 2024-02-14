package com.securisk.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsInRenewal {
	public ActionsInRenewal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//ShowMenu
//	(xpath="(//*[@aria-label='Actions']/following::flt-semantics[@aria-label='Show menu'])[3]")
	
	@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[4]")
	private WebElement Showmenu1;
	
	public void showmenuOfRenewals1() throws InterruptedException
	{
		Thread.sleep(4000);
		Showmenu1.click();
	}
	
	//show products
	
	@FindBy(css="flt-semantics[aria-label='Show Products']")
	private WebElement ShowProducts;
	
	public void showproductsofshowmenu() throws InterruptedException
	{
		Thread.sleep(2000);
		ShowProducts.click();
	}
	
	//CloseShowproducts
	
	@FindBy(xpath = "//*[@aria-label='Products']/descendant::flt-semantics[@role='button']")
	private WebElement CloseProduct;
	
	public void CancelProduct() throws InterruptedException
	{
		Thread.sleep(2000);
		CloseProduct.click();
	}
	
	//show menu

	@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[4]")
	private WebElement Showmenu2;
	
	public void showmenuOfRenewals2() throws InterruptedException
	{
		Thread.sleep(4000);
		Showmenu2.click();
	}
	
	//Add Product
	
	@FindBy(css="flt-semantics[aria-label='Add Product']")
	private WebElement Toaddproduct;
	
	public void addproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		Toaddproduct.click();
	}
	
	//Product type
	
	@FindBy(css="flt-semantics[aria-label='ProductType']")
	private WebElement Toproducttype;
	
	public void producttype() throws InterruptedException
	{
		Thread.sleep(2000);
		Toproducttype.click();
	}
	
	//Producttype dropdown
	
//	@FindBy(css="flt-semantics[aria-label='Poultry']")
	@FindBy(xpath="(//*[@aria-label='new product (a)'])[6]")
	private WebElement Toproductdropdown;
	
	public void producttypedropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		Toproductdropdown.click();
	}

	//InsuranceCompany
	
	@FindBy(css="flt-semantics[aria-label='InsuranceCompany']")
	private WebElement ToInsuranceCompany;
	
	public void insuranceCompany() throws InterruptedException
	{
		Thread.sleep(2000);
		ToInsuranceCompany.click();
	}
	
	//InsuranceCompany Dropdown

	@FindBy(css="flt-semantics[aria-label='Ageon Life Insurance Co Ltd']")
	private WebElement ToInsuranceDropdown;
	
	public void insuranceCompanyDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		ToInsuranceDropdown.click();
	}
	
	//product add
	
	@FindBy(css="flt-semantics[aria-label='Product Add']")
	private WebElement Toproductadd;
	
	public void productAdd() throws InterruptedException
	{
		Thread.sleep(2000);
		Toproductadd.click();
	}
	
	//close 
	
		@FindBy(css="flt-semantics[aria-label='Close']")
		private WebElement Toclosepopup;
		
		public void closePopup() throws InterruptedException
		{
			Thread.sleep(2000);
			Toclosepopup.click();
		}
		
	//show menu

//		@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[5]")
		@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[3]")
		private WebElement Showmenu3;
		
		public void showmenuOfRenewals3() throws InterruptedException
		{
			Thread.sleep(4000);
			Showmenu3.click();
		}
		
	//Add user
		
		@FindBy(css="flt-semantics[aria-label='Add User']")
		private WebElement ToAdduser;
		
		public void addUser() throws InterruptedException
		{
			Thread.sleep(2000);
			ToAdduser.click();
		}
	
	//***Create user***Employee Id
		
		@FindBy(css="input[aria-label='Employee Id']")
		private WebElement ToEmployeeid;
		
		public void employeeId(String user) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEmployeeid.sendKeys(user);
		}
	
	//Name in create user
		
		@FindBy(css="input[aria-label='Name']")
		private WebElement ToName;
		
		public void name(String user1) throws InterruptedException
		{
			Thread.sleep(2000);
			ToName.sendKeys(user1);

		}
	//designation
		
		@FindBy(css="flt-semantics[aria-label='Designation']")
		private WebElement Todesignation;
		
		public void designation() throws InterruptedException
		{
			Thread.sleep(2000);
			Todesignation.click();
		}
		
	//designation dropdown
		
		@FindBy(css="flt-semantics[aria-label='Vice President']")
		private WebElement Todesignationdropdown;
		
		public void designationDropdown() throws InterruptedException
		{
			Thread.sleep(2000);
			Todesignationdropdown.click();
		}
		
	//EmailId
		
		@FindBy(css="input[aria-label='Email Id']")
		private WebElement ToEmailid;
		
		public void emailId(String Id) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEmailid.sendKeys(Id);
		}
		
	//phone number
		
		@FindBy(css="input[aria-label='Phone Number']")
		private WebElement TophoneNumber;
		
		public void phoneNumber(String phoneNum) throws InterruptedException
		{
			Thread.sleep(2000);
			TophoneNumber.sendKeys(phoneNum);
		}
		
	//Create button of Add user	
		
		@FindBy(css="flt-semantics[aria-label='Create']")
		private WebElement TocreateofAdduser;
		
		public void createButton() throws InterruptedException
		{
			Thread.sleep(2000);
			TocreateofAdduser.click();
		}
		
	//Close popup
		
		@FindBy(css="flt-semantics[aria-label='Close']")
		private WebElement CloseOfAdduser;
		
		public void Close() throws InterruptedException
		{
			Thread.sleep(2000);
			CloseOfAdduser.click();
		}
	
	//showmenu4

		@FindBy(xpath="(//*[@aria-label=\"Show menu\"])[4]")
		private WebElement Showmenu4;
		
		public void showmenuOfRenewals4() throws InterruptedException
		{
			Thread.sleep(4000);
			Showmenu4.click();
		}	
   
   //***Edit***
		
		@FindBy(css="flt-semantics[aria-label='Edit']")
		private WebElement ToEdit;
		
		public void edit() throws InterruptedException
		{
			Thread.sleep(2000);
			ToEdit.click();

		}
		
	//Client name
		
		@FindBy(css="input[aria-label='Client Name']")
		private WebElement ToClientname;
		
		public void clientName(String clientname) throws InterruptedException
		{
			Thread.sleep(2000);
			ToClientname.click();
			ToClientname.clear();
			ToClientname.sendKeys(clientname);
		}
		
		
//Need to copy paste		
		
	//Location in edit
		
		@FindBy(xpath="//flt-semantics[contains(@aria-label,'Location')]")
		private WebElement Toclear;
		
		public void clearlocation() throws InterruptedException
		{
			Thread.sleep(2000);
			Toclear.click();
		}
		
		@FindBy(css="flt-semantics[aria-label='Mumbai - Head Office']")
		private WebElement TolocationinEdit;
		
		public void locationInEdit() throws InterruptedException
		{
			Thread.sleep(2000);
			TolocationinEdit.click();
		}
		
	//update in edit
		
		@FindBy(css="flt-semantics[aria-label='Update']")
		private WebElement Toupdate;
		
		public void update() throws InterruptedException
		{
			Thread.sleep(2000);
			Toupdate.click();
		}
		
	//close
		
		@FindBy(css="flt-semantics[aria-label='Close']")
		private WebElement Toclose;
		
		public void closeInEdit() throws InterruptedException
		{
			Thread.sleep(2000);
			Toclose.click();
		}
		
	//	products for edit and delete
		@FindBy(xpath="(//*[@aria-label='1'])[5]")
		private WebElement Toproducts;
		
		public void productstoEdit() throws InterruptedException
		{
			Thread.sleep(2000);
			Toproducts.click();
		}
		
	//	products menu
		
		@FindBy(css="flt-semantics[aria-label='Show menu']")
		private WebElement Toshowmenu;
		
		public void productsMenu() throws InterruptedException
		{
			Thread.sleep(2000);
			Toshowmenu.click();
		}
    // Edit
		
//		@FindBy(css="flt-semantics[aria-label='Edit']")
//		private WebElement ToEditProducts;
//		
//		public void editinProducts() throws InterruptedException
//		{
//			Thread.sleep(2000);
//			ToEditProducts.click();
//		}

     // delete
		
		@FindBy(css="flt-semantics[aria-label='Delete']")
		private WebElement TodeleteProducts;
		
		public void deleteProducts() throws InterruptedException
		{
			Thread.sleep(2000);
			TodeleteProducts.click();
		}

     // To confirm the delete
		
		@FindBy(css="flt-semantics[aria-label='Yes']")
		private WebElement Toconfirmthedelete;
		
		public void confirmDelete() throws InterruptedException
		{
			Thread.sleep(2000);
			Toconfirmthedelete.click();
		}
		
	// delete successfull
		
		@FindBy(css="flt-semantics[aria-label='OK']")
		private WebElement ToOk;
		
		public void ok() throws InterruptedException
		{
			Thread.sleep(2000);
			ToOk.click();
		}
		
	// users
		
		@FindBy(css="flt-semantics[aria-label='3']")
		private WebElement ToUsers1;
		
		public void users1() throws InterruptedException
		{
			Thread.sleep(2000);
			ToUsers1.click();
		}
		
	//menu of users
		
		@FindBy(css="flt-semantics[aria-label='Show menu']")
		private WebElement ToMenu1;
		
		public void menuUsers1() throws InterruptedException
		{
			Thread.sleep(2000);
			ToMenu1.click();
		}
		
	//delete in users
		
		@FindBy(css="flt-semantics[aria-label='Delete']")
		private WebElement TodeletetheUsers;
		
		public void deleteUser() throws InterruptedException
		{
			Thread.sleep(2000);
			TodeletetheUsers.click();
		}
		
	//Sure to delete	
		
		@FindBy(css="flt-semantics[aria-label='Yes']")
		private WebElement Toconfirm;
		
		public void confirmDeleteUser() throws InterruptedException
		{
			Thread.sleep(2000);
			Toconfirm.click();
		}
		
		
		
	//Ok in users
		
		@FindBy(css="flt-semantics[aria-label='OK']")
		private WebElement ToOkUser;
		
		public void okInUser() throws InterruptedException
		{
			Thread.sleep(2000);
			ToOkUser.click();
		}
		
	// users
		
//		@FindBy(css="flt-semantics[aria-label='3']")
		@FindBy(xpath="(//*[@aria-label='2'])[2]")
		private WebElement ToUsers2;
		
		public void users2() throws InterruptedException
		{
			Thread.sleep(2000);
			ToUsers2.click();
		}
		
	//menu of users
		
		@FindBy(css="flt-semantics[aria-label='Show menu']")
		private WebElement ToMenu2;
		
		public void menuUsers2() throws InterruptedException
		{
			Thread.sleep(2000);
			ToMenu2.click();
		}
		
	//edit in users
		
		@FindBy(css="flt-semantics[aria-label='Edit']")
		private WebElement ToEditUser;
		
		public void editInUsers() throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditUser.click();
		}
		
	//update page for users***Employee id
		
		@FindBy(css="input[aria-label='Employee Id']")
		private WebElement ToEdittheUser;
		
		public void editId(String ID) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEdittheUser.click();
			ToEdittheUser.clear();
			ToEdittheUser.sendKeys(ID);
		}
		
	// Name in users to edit
		
		@FindBy(css="input[aria-label='Name']")
		private WebElement ToEditName;
		
		public void editName(String nametoEdit) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditName.click();
			ToEditName.clear();
			ToEditName.sendKeys(nametoEdit);
		}
		
	// designation in users to edit	
		
//		@FindBy(css="//flt-semantics[contains(@aria-label,'Designation')]")
		@FindBy(xpath="(//flt-semantics[@role='button'])[2]")
		private WebElement ToEditDesignation;
		
		public void editDesignation() throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditDesignation.click();
		}
		
	// Designation dropdown in edit the users
		
		@FindBy(css="flt-semantics[aria-label='Director']")
		private WebElement ToEditdropdown;
		
		public void editdropdown() throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditdropdown.click();
		}
		
	//	gmail in edit the user
		
		@FindBy(css="input[aria-label='Email']")
		private WebElement ToEditGmail;
		
		public void editGmail(String mail) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditGmail.click();
			ToEditGmail.clear();
			ToEditGmail.sendKeys(mail);
		}
		
	// phone number in edit
		
		@FindBy(css="input[aria-label='Phone Number']")
		private WebElement ToEditPhnNum;
		
		public void editphnNum(String num) throws InterruptedException
		{
			Thread.sleep(2000);
			ToEditPhnNum.click();
			ToEditPhnNum.clear();
			ToEditPhnNum.sendKeys(num);
		}
		
	//	submit button of edit in users
		
		@FindBy(css="flt-semantics[aria-label='Submit']")
		private WebElement ToSubmit;
		
		public void submitInEdit() throws InterruptedException
		{
			Thread.sleep(2000);
			ToSubmit.click();
		}
		
	//close in edit of users
		
		@FindBy(css="flt-semantics[aria-label='Close']")
		private WebElement TocloseInEdit;
		
		public void close() throws InterruptedException
		{
			Thread.sleep(2000);
			TocloseInEdit.click();
		}
		
		
		
		
		
}
