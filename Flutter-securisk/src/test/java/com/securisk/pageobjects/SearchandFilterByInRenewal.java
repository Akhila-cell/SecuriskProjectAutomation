package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchandFilterByInRenewal {
	
	public SearchandFilterByInRenewal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//FilterByDropdown
	
			@FindBy(css="flt-semantics[aria-label='Filter By']")
			private WebElement FilterBy;
			
			public void FilterByDropdown() throws InterruptedException
			{
				Thread.sleep(2000);
				FilterBy.click();
			}

			//OPtioninFilterBy
			
			@FindBy(css="flt-semantics[aria-label='Hyderabad']")
			private WebElement OPtioninFilterBy;
			
			public void SelectionInFilterBy() throws InterruptedException
			{
				Thread.sleep(4000);
				OPtioninFilterBy.click();
			}
	
	//SearchOption
	
			@FindBy(css="input[aria-label='Search']")
			private WebElement SearchButton;
			
			public void Search(String name1) throws InterruptedException 
			{
				Thread.sleep(3000);
				SearchButton.sendKeys(name1);
			}

	
		
		
		
}
