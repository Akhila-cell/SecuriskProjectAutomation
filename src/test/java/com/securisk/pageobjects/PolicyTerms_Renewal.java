package com.securisk.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyTerms_Renewal {
private WebDriver driver;
public PolicyTerms_Renewal(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(((//*[@aria-label='Limits/Remarks'])[2])/following::flt-semantics[@role='button'])[1]")
private WebElement editbtn;
public void clickEdit() {
	editbtn.click();
}
@FindBy(xpath="(//*[@aria-label='Limits/Remarks'])[2]")
private WebElement limitRemark;
public void setLimitRemark(String remark1) {
	limitRemark.sendKeys(remark1);
}

@FindBy(xpath="(((//*[@aria-label='Limits/Remarks'])[2])/following::flt-semantics[@role='button'])[3]")
private WebElement editbtn2;
public void clickEdit2() {
	editbtn2.click();
}
@FindBy(xpath="(//*[@aria-label='Limits/Remarks'])[3]")
private WebElement limitRemark2;
public void setLimitRemark2(String remark2) {
	limitRemark2.sendKeys(remark2);
}
@FindBy(xpath="(//*[@aria-label='Limits/Remarks'])[3]/following::flt-semantics[@id='flt-semantic-node-1583']")
private WebElement deletebtn;

public void clickdelete2 () {
	deletebtn.click();
}
@FindBy(css="flt-semantics[aria-label='NEXT']")
private WebElement nextbtn4;
public void clickNext4() {
	nextbtn4.click();
}
@FindBy(xpath="(//flt-semantics[@aria-label='NEXT']/preceding::flt-semantics[@id='flt-semantic-node-1677'])")
private WebElement addLimitRemarkbtn;
public void ClickAddLimitRemark() {
	addLimitRemarkbtn.click();
}
}
