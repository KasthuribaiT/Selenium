package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	//Constructor	
	public CreateLeadPage() {
		
	}

	//Methods for every action
	
	
	
	public CreateLeadPage enterCompanyName(String cName) {
		WebElement compName = locateElement("id","createLeadForm_companyName");
		compName.sendKeys(cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		firstName.sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterSecondName(String lName) {
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		lastName.sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickSubmit() {
		WebElement submitButton = locateElement("name","submitButton");
		click(submitButton);
	return new ViewLeadPage();
	}
}
