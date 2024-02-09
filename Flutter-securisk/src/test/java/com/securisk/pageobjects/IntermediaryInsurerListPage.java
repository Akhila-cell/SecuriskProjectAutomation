package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntermediaryInsurerListPage {
	WebDriver driver;

	public IntermediaryInsurerListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Intermediary Details')]")
	public WebElement IntermediaryDropdown;
	@FindBy(css = "flt-semantics[aria-label='Insurer List']")
	public WebElement InsurerlistButton;
	@FindBy(css = "flt-semantics[aria-label='Create Insurer']")
	public WebElement CreateInsurerBtn;
	@FindBy(css = "input[aria-label='Insurer Name']")
	public WebElement Insusernametextfield;
	@FindBy(css = "flt-semantics[aria-label='Location']")
	public WebElement InsurerLocationDropdown;
	@FindBy(css = "flt-semantics[aria-label='Hyderabad']")
	public WebElement HydValue;
	@FindBy(css = "flt-semantics[aria-label='Chennai']")
	public WebElement ChennaiValue;
	@FindBy(css = "flt-semantics[aria-label='Mumbai - Head Office']")
	public WebElement MumbaiHeadValue;
	@FindBy(css = "flt-semantics[aria-label='Mumbai']")
	public WebElement MumbaiValue;
	@FindBy(css = "flt-semantics[aria-label='Pune']")
	public WebElement PuneValue;
	@FindBy(css = "flt-semantics[aria-label='Bangalore']")
	public WebElement BangaloreValue;
	@FindBy(css = "input[aria-label='Email']")
	public WebElement EmailTextField;
	@FindBy(css = "input[aria-label='Manager Name']")
	public WebElement ManagerNameTextField ;
	@FindBy(css = "input[aria-label='Phone Number']")
	public WebElement PhoneNumberField ;
	@FindBy(css = "flt-semantics[aria-label='Create']")
	public WebElement CreateBtn ;
	
	public void clickOnIntermediary() {
		IntermediaryDropdown.isEnabled();
		IntermediaryDropdown.click();
	}

	public void clickOnInsureList() {
		InsurerlistButton.isEnabled();
		InsurerlistButton.click();
	}
	public void enterInsurerName(String Name) {
		Insusernametextfield.isEnabled();
		Insusernametextfield.click();
		Insusernametextfield.sendKeys(Name);
	}
	public void clickOnCreateInsure() {
		CreateInsurerBtn.isEnabled();
		CreateInsurerBtn.click();
	}

	public void clickonLocation() {
		InsurerLocationDropdown.isEnabled();
		InsurerLocationDropdown.click();
	}

	public void selectLocation(String Location) {
		if (Location.equalsIgnoreCase("Hyderabad")) {
			HydValue.isEnabled();
			HydValue.click();
		} else if (Location.equalsIgnoreCase("Chennai")) {
			ChennaiValue.isEnabled();
			ChennaiValue.click();
		} else if (Location.equalsIgnoreCase("Mumbai")) {
			MumbaiValue.isEnabled();
			MumbaiValue.click();
		} else if (Location.equalsIgnoreCase("Bangalore")) {
			BangaloreValue.isEnabled();
			BangaloreValue.click();
		} else if (Location.equalsIgnoreCase("pune")) {
			PuneValue.isEnabled();
			PuneValue.click();
		} else if (Location.equalsIgnoreCase("MunbaiHead")) {
			MumbaiHeadValue.isEnabled();
			MumbaiHeadValue.click();
		}
	}
	
	public void enterEmail(String email) {
		EmailTextField.isEnabled();
		EmailTextField.click();
		EmailTextField.sendKeys(email);
	}
	
	public void enterManagerName(String name) {
		ManagerNameTextField.isEnabled();
		ManagerNameTextField.click();
		ManagerNameTextField.sendKeys(name);
	}
	
	public void enterPhonenumber(String number) {
		PhoneNumberField.isEnabled();
		PhoneNumberField.click();
		PhoneNumberField.sendKeys(number);
	}
	public void clickOnCreate() {
		CreateBtn.isEnabled();
		CreateBtn.click();
	}



}

