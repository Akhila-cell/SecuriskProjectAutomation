package com.securisk.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.ActionsInRenewal;

public class Tc_ActionsInRenewal extends Tc_SearchandFilterByInRenewal {
	
	@Test(priority = 5)
	public void ActionsTest() throws InterruptedException
	{
		ActionsInRenewal AR = new ActionsInRenewal(driver);
		test=reports.startTest("Showmenu of Renewals");
		AR.showmenuOfRenewals1();
		test.log(LogStatus.PASS,"Showmenu1 successfull");
		
		test=reports.startTest("ShowProducts of Renewals");
		AR.showproductsofshowmenu();
		test.log(LogStatus.PASS,"ShowProducts in showmenu successfull");
		
		AR.CancelProduct();
		test.log(LogStatus.PASS,"Cancel product of show product is successfull");
		
		AR.showmenuOfRenewals2();
		test.log(LogStatus.PASS,"Showmenu2 successfull");
	
		test=reports.startTest("Add Product");
		AR.addproduct();
		test.log(LogStatus.PASS,"Add Product successfully");
		
		AR.producttype();
		test.log(LogStatus.PASS,"product type successfull");
		
		AR.producttypedropdown();
		test.log(LogStatus.PASS,"Product type dropdown added successfully");
		
		AR.insuranceCompany();
		test.log(LogStatus.PASS,"Insurance company successfull");
		
		AR.insuranceCompanyDropdown();
		test.log(LogStatus.PASS,"Insurance Company dropdown successfull");
		
		AR.productAdd();
		test.log(LogStatus.PASS,"product Add successfull");
		
		AR.closePopup();
		test.log(LogStatus.PASS,"Close Popup successfull");
		
		AR.showmenuOfRenewals3();
		test.log(LogStatus.PASS,"showmenu3 successfull");

		test=reports.startTest("Add User");
		AR.addUser();
		test.log(LogStatus.PASS,"Add user is successfull");
		
		AR.employeeId("12345");
		test.log(LogStatus.PASS,"Emp Id entered successfully");
		
		AR.name("Vani");
		test.log(LogStatus.PASS,"name entered successfully");

		AR.designation();
		test.log(LogStatus.PASS,"designation is successfull");
		
		AR.designationDropdown();
		test.log(LogStatus.PASS,"designation dropdown is successfull");
		
		AR.emailId("sss@gmail.com");
		test.log(LogStatus.PASS,"EmailId entered successfully");
		
		AR.phoneNumber("0987654321");
		test.log(LogStatus.PASS,"Phone number entered successfully");
		
		AR.createButton();
		test.log(LogStatus.PASS,"CreateButton is successfull");
		
		AR.Close();
		test.log(LogStatus.PASS,"Close pop-up of Add user is successfull");
		
		AR.showmenuOfRenewals4();
		test.log(LogStatus.PASS,"showmenu is successfull");
		
		test=reports.startTest("Edit");
		AR.edit();
		test.log(LogStatus.PASS,"Edit is successfull");

// Need to copy paste
		
		AR.clientName("Ojas");
		test.log(LogStatus.PASS,"client name in edit is successfull");
		
		AR.clearlocation();
		test.log(LogStatus.PASS,"location cleared in edit is successfull");
		
		AR.locationInEdit();
		test.log(LogStatus.PASS,"location in edit is successfull");
		
		AR.update();
		test.log(LogStatus.PASS,"update in edit is successfull");
		
		AR.closeInEdit();
		test.log(LogStatus.PASS,"close in edit is successfull");
		
		test=reports.startTest("Products to Edit and Delete");
		AR.productstoEdit();
		test.log(LogStatus.PASS,"products to edit and delete is successfull");
		
		AR.productsMenu();
		test.log(LogStatus.PASS,"products menu is successfull");
	
		AR.deleteProducts();
		test.log(LogStatus.PASS,"delete the product is successfull");
		
		AR.confirmDelete();
		test.log(LogStatus.PASS,"confirm to delete is successfull");
		
		AR.ok();
		test.log(LogStatus.PASS,"successfully deleted message is successfull");
		
		test=reports.startTest("Users to Edit and Delete");
		AR.users1();
		test.log(LogStatus.PASS," Users is successfull");
		
		AR.menuUsers1();
		test.log(LogStatus.PASS,"User menu is successfull");
		
		test=reports.startTest("To delete the user in users is successful");
		AR.deleteUser();
		test.log(LogStatus.PASS,"delete is successfull");
		
		AR.confirmDeleteUser();
		test.log(LogStatus.PASS,"confirm to delete is successfull");
		
		AR.okInUser();
		test.log(LogStatus.PASS,"ok in user to delete is successfull");
		
		AR.users2();
		test.log(LogStatus.PASS,"users is successfull");
		
		AR.menuUsers2();
		test.log(LogStatus.PASS,"users menu is successfull");
		
		test=reports.startTest("Edit the user in users is successful");
		AR.editInUsers();
		test.log(LogStatus.PASS,"edit in user is successfull");
		
		AR.editId("10203");
		test.log(LogStatus.PASS,"Id in edit of user is successfull");
		
		AR.editName("vvv");
		test.log(LogStatus.PASS,"name in edit of user is successfull");
		
		AR.editDesignation();
		test.log(LogStatus.PASS,"designation in edit of user is successfull");
		
		AR.editdropdown();
		test.log(LogStatus.PASS,"designation dropdown in edit of user is successfull");
		
		AR.editGmail("vvv@gmail.com");
		test.log(LogStatus.PASS,"Gmail in edit of user is successfull");
		
		AR.editphnNum("1020304055");
		test.log(LogStatus.PASS,"phone number in edit of user is successfull");
		
		AR.submitInEdit();
		test.log(LogStatus.PASS,"submit button in edit of user is successfull");
		
		AR.close();
		test.log(LogStatus.PASS,"close in edit of user is successfull");
		
	}

}
