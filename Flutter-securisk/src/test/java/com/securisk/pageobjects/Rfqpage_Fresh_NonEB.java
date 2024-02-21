package com.securisk.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rfqpage_Fresh_NonEB {
	
	WebDriver driver;
	public Rfqpage_Fresh_NonEB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(css = "flt-semantics[aria-label='RFQ']")

		public WebElement RFQLink;

		public void Rfq() throws InterruptedException {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", RFQLink);
		}

		@FindBy(css = "flt-semantics[aria-label='Create RFQ']")
		public WebElement CreateRFQ;

		public void CreateRfq() {
			CreateRFQ.click();

		}

		@FindBy(css = "flt-semantics[aria-label=\"------Select Product Category------\"]")
		public WebElement ProdCategory;

		public void selectProduct() {

			ProdCategory.click();

		}

//		@FindBy(css = "flt-semantics[aria-label='NON-EB']")
//		WebElement NonEb;
	//
//		public void SelectNonEb() {
//			NonEb.click();
//		}

		@FindBy(xpath = "//*[@aria-label=\"NON-EB\"]")
		public WebElement Non_EB;

		public void SelectNonEB() {
			Non_EB.click();
		}

		@FindBy(css = "flt-semantics[aria-label=\"------Select Product type------\"]")
		public WebElement ProdType;

		public void SelectProdType() {
			ProdType.click();
		}

		@FindBy(xpath = "[//*@aria-label=\"Errors & Omissions\"]")
		public WebElement GHI;

		public void ghi() {
			GHI.click();
		}

		@FindBy(css = "flt-semantics[aria-label=\"------Select Policy Type------\"]")
		public WebElement Policytype;

		public void SelectPolicyType() {
			Policytype.click();
		}
		@FindBy(css = "flt-semantics[aria-label=\"Fresh\"]")
		public WebElement Fresh;
		public void SelectFresh() {
			Fresh.click();
		}
		@FindBy(css = "flt-semantics[aria-label=\"Submit\"]")
		public WebElement ClickButton;
		public void Submit() throws InterruptedException {
			ClickButton.click();
			//Thread.sleep(2000);
		}

}
