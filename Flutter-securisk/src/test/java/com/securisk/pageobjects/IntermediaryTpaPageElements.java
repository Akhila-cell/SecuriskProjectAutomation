package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntermediaryTpaPageElements {
	WebDriver driver;

	public IntermediaryTpaPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//flt-semantics[contains(@aria-label,'Intermediary Details')]")
	public WebElement IntermediaryDropdown;
	@FindBy(css = "flt-semantics[aria-label='TPA List']")
	public WebElement TPAButton;
	@FindBy(css = "flt-semantics[aria-label='Create TPA']")
	public WebElement CreateTpaBtn;
	@FindBy(css = "input[aria-label='TPA Name']")
	public WebElement TpaNameTextField;
	@FindBy(css = "flt-semantics[aria-label='Location']")
	public WebElement TpaLocationDropdown;
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
	@FindBy(css = "flt-semantics[aria-label='Create']")
	public WebElement CreateButton;
	@FindBy(css = "flt-semantics[aria-label='Tpa added successfully!']")
	public WebElement ConfirmCreateTpa;
	@FindBy(css = "flt-semantics[aria-label='Close']")
	public WebElement ClosePopupbtn;
	@FindBy(css = "input[aria-label='Search']")
	public WebElement SearchField;
	@FindBy(css = "flt-semantics[aria-label='Filter By']")
	public WebElement FilterDropdown;
	@FindBy(css = "flt-semantics[aria-label='Location']")
	public WebElement FilterLocation;
	@FindBy(xpath = "(//flt-semantics[@aria-label='Show menu'])[2]")
	public WebElement ShowmenuBtn;
	@FindBy(css = "flt-semantics[aria-label='Edit']")
	public WebElement EditTpaBtn;
	@FindBy(css = "//flt-semantics[contains(@aria-label,'Location')]")
	public WebElement EditTpaLocation;
	@FindBy(css = "flt-semantics[aria-label='Submit']")
	public WebElement SubmitTpaBtn;
	@FindBy(css = "flt-semantics[aria-label='Delete']")
	public WebElement DeleteTpaBtn;
	@FindBy(css = "flt-semantics[aria-label='Yes']")
	public WebElement ConfimDeleteYesBtn;
	@FindBy(css = "flt-semantics[aria-label='No']")
	public WebElement ConfimDeleteNoBtn;
	@FindBy(css = "flt-semantics[aria-label='OK']")
	public WebElement OkBtn;

	public void clickOnIntermediary() {
		IntermediaryDropdown.isEnabled();
		IntermediaryDropdown.click();
	}

	public void clickOnTPA() {
		TPAButton.isEnabled();
		TPAButton.click();
	}

	public void clickOnCreateTpa() {
		CreateTpaBtn.isEnabled();
		CreateTpaBtn.click();
	}

	public void enterTpaName(String name) throws InterruptedException {
		TpaNameTextField.isEnabled();
		TpaNameTextField.click();
		Thread.sleep(2000);
		TpaNameTextField.sendKeys(name);
	}

	public void clickonLocation() {
		TpaLocationDropdown.isEnabled();
		TpaLocationDropdown.click();
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

	public void clickOnCreate() {
		CreateButton.isEnabled();
		CreateButton.click();
	}

	public void closePopUP() {
		ClosePopupbtn.isEnabled();
		ClosePopupbtn.click();
	}

	public void searchTpa(String productname) {
		SearchField.isEnabled();
		SearchField.sendKeys(productname);
	}

	public void Filtertype() throws InterruptedException {
		FilterDropdown.isEnabled();
		FilterDropdown.click();
	}
	public void clickOnEditTpa() {
		EditTpaBtn.isEnabled();
		EditTpaBtn.click();	
	}
	
	public void selectNewLocation() {
		EditTpaLocation.isEnabled();
		EditTpaLocation.click();
		
	}
	public void clickonSubmitTpa() {
		SubmitTpaBtn.isEnabled();
		SubmitTpaBtn.click();
		
	}
	public void clickOnProductDelete() {
		DeleteTpaBtn.isEnabled();
		DeleteTpaBtn.click();
	}

	public void acceptDeleteProduct() {
		ConfimDeleteYesBtn.isEnabled();
		ConfimDeleteYesBtn.click();

	}

	public void clickonOkBtn() {
		OkBtn.isEnabled();
		OkBtn.click();
	}

	public void rejectDeleteProduct() {
		ConfimDeleteNoBtn.isEnabled();
		ConfimDeleteNoBtn.click();
	}
	

}
