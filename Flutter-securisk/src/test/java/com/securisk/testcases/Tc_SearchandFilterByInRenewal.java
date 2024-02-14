package com.securisk.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.securisk.pageobjects.SearchandFilterByInRenewal;

public class Tc_SearchandFilterByInRenewal extends Tc_CreateClientInRenewal {
	
	@Test(priority = 4)
	public void SearchandFilterByTest() throws InterruptedException
	{
		SearchandFilterByInRenewal SF = new SearchandFilterByInRenewal(driver);
		
		test=reports.startTest("FilterBy of renewal page");
		SF.FilterByDropdown();
		test.log(LogStatus.PASS,"FilterBy dropdown sucessfull");
	    SF.SelectionInFilterBy();
	    test.log(LogStatus.PASS,"FilterBy location sucessfull");
	    
	    SF.Search("Vani");
	    test.log(LogStatus.PASS,"Search Successfull");
	    
		
	    
	    
	
	}

}
