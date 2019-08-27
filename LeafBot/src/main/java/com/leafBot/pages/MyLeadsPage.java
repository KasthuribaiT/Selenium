package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	//Constructor	
	public MyLeadsPage() {
		
	}

	//Methods for every action
	public CreateLeadPage clickCreateLeads() {
		WebElement createLeadlink = locateElement ("link", "Create Lead");
		click(createLeadlink);
		return new CreateLeadPage();

	}

	/*public FindLeadPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();

	}
	public MergeLeadPage clickMergeLeads() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadPage();

	}*/

}
