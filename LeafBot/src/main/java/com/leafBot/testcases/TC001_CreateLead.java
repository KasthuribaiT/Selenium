package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;

//import basePackage.ProjectSpecificMethods;
//import pages.LoginPage;

public class TC001_CreateLead extends com.leafBot.testng.api.base.ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		excelFileName="CreateLeadInput";
		testcaseName="CreateLead";
		testcaseDec="CreateLead";
		author="Kasthuri";
		category="Test";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String username, String password, String cName, String fName, String lName ) {	
	new LoginPage().enterUserName(username).enterPassword(password).clickLogin().clickCRMSFA().clickLeads().clickCreateLeads().enterCompanyName(cName).enterFirstName(fName).enterSecondName(lName).clickSubmit().viewFirstName();
	
	}
}
