package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	//constructor
	public ViewLeadPage() {
		
	}

	//methods for every action
	public ViewLeadPage viewFirstName() {
		WebElement firstName = locateElement("id","viewLead_firstName_sp");
		String name = getElementText(firstName);
		System.out.println(name);
		return this;
	}
	
	/*public EditLeadPage clickEdit() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyCompanyNameUpdate() {
	String companyName = driver.findElementById("viewLead_companyName_sp").getText();
	if(companyName.contains("TCS")) {
		System.out.println("The Company name has been updated to "+driver.findElementById("viewLead_companyName_sp").getText());
	}else {
		System.out.println("The Company name has not been updated");
	}
	return this;
}
	
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
	public MyLeadsPage clickDelete() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	}*/
	
}