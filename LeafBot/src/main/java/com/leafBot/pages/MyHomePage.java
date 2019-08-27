package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	//Constructor	
	public MyHomePage() {
		
	}

	//Methods for every action
	public MyLeadsPage clickLeads() {
		WebElement leadsLink = locateElement("link","Leads");
		click(leadsLink);
		return new MyLeadsPage();

	}

}
