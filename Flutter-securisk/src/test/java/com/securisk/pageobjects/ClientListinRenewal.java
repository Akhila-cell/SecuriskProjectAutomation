package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientListinRenewal {
	
	public ClientListinRenewal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//***CLIENTLIST***
	
	@FindBy(xpath="//flt-semantics[contains(@aria-label,'Client List')]")
	private WebElement ClientOption;
	
	public void Client() throws InterruptedException
	{
		Thread.sleep(5000);
		ClientOption.isEnabled();
		ClientOption.click();
	}
	
	//Renewals
	
	@FindBy(css="flt-semantics[aria-label='Renewals']")
	private WebElement RenewalOfClientlist;
	
	public void Renewals() throws InterruptedException
	{
		Thread.sleep(3000);
		RenewalOfClientlist.click();
	}
	
	//CreateClient
	
	@FindBy(css="flt-semantics[aria-label='Create Client']")
	private WebElement CreateClientbutton;
	
	public void CreateClient() throws InterruptedException 
	{
		Thread.sleep(3000);
		CreateClientbutton.click();
	}
	
}
