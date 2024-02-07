package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.securisk.utilities.genericMethods;

public class ClientList {
	WebDriver driver;
	public ClientList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	genericMethods g=new genericMethods();
	
	@FindBy(xpath="//flt-semantics[contains(@aria-label,'Client List')]")
	public WebElement ClientList;
	@FindBy(css="flt-semantics[aria-label='Active']")
	public WebElement ActiveOption;
	
	
	public void dropdownClient() {
		ClientList.isEnabled();
		ClientList.click();

		
	}
	public void ActuveOp() {
		ActiveOption.click();
		
	}

	
		
		
	}


