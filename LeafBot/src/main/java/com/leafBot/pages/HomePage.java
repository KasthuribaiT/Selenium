package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	//constructor
	public HomePage() {
		
	}

	//methods for every action
	public MyHomePage clickCRMSFA() {
		WebElement crmsfalink = locateElement("link","CRM/SFA");
		click(crmsfalink);
		return new MyHomePage();
	}
}
