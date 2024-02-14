package com.securisk.pageobjects;

import java.awt.AWTException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyTermspage_Fresh {

	WebDriver driver;

	public PolicyTermspage_Fresh(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//*[@id='flt-semantic-node-628']")
	@FindBy(css = "#flt-semantic-node-630")
	 //@FindBy(css="#flt-semantic-node-1358")
	 WebElement clickon_EditButton;

	public void clickonEditButton() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) this.driver;

		js.executeScript("arguments[0].scrollIntoView();", clickon_EditButton);

		clickon_EditButton.click();
		Thread.sleep(5000);

	}

	// @FindBy(xpath ="//*[@aria-label='Limits/Remarks']")
	@FindBy(css = "[aria-label='Limits/Remarks']")
	 WebElement Edit_Maternity_Limit_Remarks;

	public void clickon_Edit_Maternity_Limit_Remarks(String Remarks) throws InterruptedException, AWTException {
		Edit_Maternity_Limit_Remarks.click();

		Edit_Maternity_Limit_Remarks.sendKeys(Remarks);
		Thread.sleep(2000);

<<<<<<< HEAD
	}

	@FindBy(css = "#flt-semantic-node-662")
	 WebElement Edit_ANVMissed;

	public void clickon_Edit_ANVMissed() throws InterruptedException {
		Edit_ANVMissed.click();
	}

	// @FindBy(xpath="//*[@aria-label='Limits/Remarks']")
	@FindBy(css = "#flt-semantic-node-661 > input")
	 WebElement Edit_ANVMissed_Limit_Remarks2;

	public void clickon_Edit_ANVMissed_Limit_Remarks2(String Remarks2) throws InterruptedException {
		Edit_ANVMissed_Limit_Remarks2.sendKeys(Remarks2);
		
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-566")
 WebElement Edit_Waiverofintimationclause;

	public void clickon_Edit_Waiverofintimationclause() throws InterruptedException {
		Edit_Waiverofintimationclause.click();
	}

	// @FindBy(xpath="//*[@aria-label='Limits/Remarks']")
	// @FindBy(xpath="(//*[@aria-label='Limits/Remarks'])[16]")
	@FindBy(css = "#flt-semantic-node-565 > input")
	 WebElement Edit_Waiverofintimationclause_Limit_Remarks3;
=======
	}

	@FindBy(css = "#flt-semantic-node-662")
	WebElement Edit_ANVMissed;

	public void clickon_Edit_ANVMissed() throws InterruptedException {
		Edit_ANVMissed.click();
	}

	// @FindBy(xpath="//*[@aria-label='Limits/Remarks']")
	@FindBy(css = "#flt-semantic-node-661 > input")
	WebElement Edit_ANVMissed_Limit_Remarks2;

	public void clickon_Edit_ANVMissed_Limit_Remarks2(String Remarks2) throws InterruptedException {
		Edit_ANVMissed_Limit_Remarks2.sendKeys(Remarks2);
		;
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-566")
	WebElement Edit_Waiverofintimationclause;

	public void clickon_Edit_Waiverofintimationclause() throws InterruptedException {
		Edit_Waiverofintimationclause.click();
	}

	/*
	 * @FindBy(css="#flt-semantic-node-694 > input") WebElement
	 * Edit_EducationofBenfit; public void clickon_Edit_EducationofBenfit() throws
	 * InterruptedException { Edit_EducationofBenfit.click(); }
	 */

	// @FindBy(xpath="//*[@aria-label='Limits/Remarks']")
	// @FindBy(xpath="(//*[@aria-label='Limits/Remarks'])[16]")
	@FindBy(css = "#flt-semantic-node-565 > input")
	WebElement Edit_Waiverofintimationclause_Limit_Remarks3;

	public void clickon_Edit_Waiverofintimationclause_Limit_Remarks3(String Remarks3) throws InterruptedException {
		Edit_Waiverofintimationclause_Limit_Remarks3.sendKeys(Remarks3);
		;
	}

	/*
	 * JavascriptExecutor executor = (JavascriptExecutor) driver;
	 * Thread.sleep(2000); try { executor.executeScript(
	 * "document.querySelector(\"html > body > flutter-view > flt-semantics-host > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics > flt-semantics-container > flt-semantics[aria-label*='NEXT'] \").scrollIntoView();"
	 * ); } catch (Exception e) { System.out.println("01 fail"); }
	 * 
	 * Thread.sleep(2000); WebElement element = null; try { element =
	 * driver.findElement(By.xpath("//*[@aria-label='Employee Dependent Details']"))
	 * ;
	 * 
	 * } catch (Exception e) { System.out.println("0000 fail"); } try {
	 * ((JavascriptExecutor)
	 * driver).executeScript("arguments[0].scrollIntoView(true);", element); } catch
	 * (Exception e) { System.out.println("0001 fail"); } try {
	 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
	 * element); } catch (Exception e1) { System.out.println("0002 fail"); } try {
	 * new Actions(driver).moveToElement(element).click(element).build().perform();
	 * } catch (Exception e) { System.out.println("0003 fail"); }
	 * 
	 * Thread.sleep(5000); }
	 */
>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c

	public void clickon_Edit_Waiverofintimationclause_Limit_Remarks3(String Remarks3) throws InterruptedException {
		Edit_Waiverofintimationclause_Limit_Remarks3.sendKeys(Remarks3);
		
	}

	@FindBy(css = "#flt-semantic-node-598")
	 WebElement Edit_Permanentpartial_Disability;

	public void Clickon_Edit_Permanentpartial_Disability() throws InterruptedException {
		Edit_Permanentpartial_Disability.click();
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-597 > input")
	 WebElement Edit_Permanentpartial_Disability_Limits_Remarks4;

	public void clickon_Edit_TemporarilyTotalDisability_Limits_Remarks4(String Remarks4) throws InterruptedException {
		Edit_Permanentpartial_Disability_Limits_Remarks4.sendKeys(Remarks4);
	}

	@FindBy(css = "#flt-semantic-node-690")
 WebElement Edit_OPDCover;

	public void Clickon_Edit_OPDCover() throws InterruptedException {
		Edit_OPDCover.click();
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-689 > input")
	 WebElement Edit_OPDCover_Limits_Remarks5;

	public void clickon_Edit_OPDCover_Limits_Remarks5(String Remarks5) throws InterruptedException {
		Edit_OPDCover_Limits_Remarks5.sendKeys(Remarks5);
	}

<<<<<<< HEAD
=======
	@FindBy(css = "#flt-semantic-node-598")
	WebElement Edit_Permanentpartial_Disability;

	public void Clickon_Edit_Permanentpartial_Disability() throws InterruptedException {
		Edit_Permanentpartial_Disability.click();
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-597 > input")
	WebElement Edit_Permanentpartial_Disability_Limits_Remarks4;

	public void clickon_Edit_TemporarilyTotalDisability_Limits_Remarks4(String Remarks4) throws InterruptedException {
		Edit_Permanentpartial_Disability_Limits_Remarks4.sendKeys(Remarks4);
	}

	@FindBy(css = "#flt-semantic-node-690")
	WebElement Edit_OPDCover;

	public void Clickon_Edit_OPDCover() throws InterruptedException {
		Edit_OPDCover.click();
	}

	// @FindBy(css="#flt-semantic-node-700")
	@FindBy(css = "#flt-semantic-node-689 > input")
	WebElement Edit_OPDCover_Limits_Remarks5;

	public void clickon_Edit_OPDCover_Limits_Remarks5(String Remarks5) throws InterruptedException {
		Edit_OPDCover_Limits_Remarks5.sendKeys(Remarks5);
	}

>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c
	@FindBy(xpath = "//*[@aria-label='NEXT']")
	// @FindBy(css = "#flt-semantic-node-716")

	 WebElement clickon_Next;

	public void clickonnext() throws InterruptedException {
<<<<<<< HEAD
=======
		// JavascriptExecutor js = (JavascriptExecutor) this.driver;
		// js.executeScript("scroll(0, 250);");
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// js.executeScript("arguments[0].scrollIntoView();", clickon_Next);
		// Thread.sleep(5000);
>>>>>>> 5a8522370e3dcadefee2150845b7144fa9dac12c

		clickon_Next.click();
	}
}
