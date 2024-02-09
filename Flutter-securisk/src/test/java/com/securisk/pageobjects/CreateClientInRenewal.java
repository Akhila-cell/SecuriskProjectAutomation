package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateClientInRenewal {
       WebDriver driver;
	
	public CreateClientInRenewal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//***CreateClientDropdown***
	//ClientName
	
	@FindBy(css="input[aria-label='Client Name']")
	private WebElement ClientNameOfcreateclient;
	
	public void clientNameinCreateClient(String clientname) throws InterruptedException 
	{
		Thread.sleep(4000);
		ClientNameOfcreateclient.sendKeys(clientname);
		//gm.textField(ClientNameOfcreateclient, "Vani");
	}

	//Location
	
	@FindBy(css="flt-semantics[aria-label='Location']")
	private WebElement LocationofCreateClient;
	
	public void locationinCreateClient() throws InterruptedException
	{
		Thread.sleep(3000);
		LocationofCreateClient.click();
	}
	
	//LocationDropdown
	
	@FindBy(css="flt-semantics[aria-label='Hyderabad']")
	private WebElement LocationDropdown;
	
	public void location() throws InterruptedException
	{
		Thread.sleep(3000);
		LocationDropdown.click();
	}
	
	//ProductType
	
	@FindBy(css="flt-semantics[aria-label='ProductType']")
	private WebElement ProducttypeofCreateclient;
	
	public void productType() throws InterruptedException
	{
		Thread.sleep(2000);
		ProducttypeofCreateclient.click();
	}
	
	//Product
	
	@FindBy(xpath="(//*[@aria-label='new product (a)'])[6]")
//	@FindBy(css=" flt-semantics[aria-label='Poultry']")
	private WebElement Product;
	
	public void products() throws InterruptedException
	{
		Thread.sleep(2000);
		Product.click();
	}
	
	//InsuranceCompany
	@FindBy(css=" flt-semantics[aria-label='InsuranceCompany']")
	private WebElement Insurance;
	
	public void insuranceCompany() throws InterruptedException
	{
		Thread.sleep(2000);
		Insurance.click();
	}
	
	//InsuranceCompanydropdown
	
	@FindBy(css=" flt-semantics[aria-label='BAJAJ Allianz Co.Ltd ']")
	private WebElement InsuranceDrop;
	
	public void insuranceCompanyDropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		InsuranceDrop.click();
	}
	 
	//CreateButton
	
	@FindBy(css=" flt-semantics[aria-label='Create']")
	private WebElement Create;
	
	public void createbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		Create.click();
		System.out.println("Client created successfully");
	}
			 
			
	
			

}
