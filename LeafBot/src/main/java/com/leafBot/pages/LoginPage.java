package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	//Constructor	
	public LoginPage() {
		
	}

	//Methods for every action
	public LoginPage enterUserName(String username) {
		WebElement uname = locateElement("id","username");
		clearAndType(uname, username);
		return this;
		
	//	driver.findElementById("username").sendKeys(username);
		//return this;

	}
	
	public LoginPage enterPassword(String pswd) {
		WebElement psword = locateElement("id","password");
		clearAndType(psword, pswd);
		return this;

	}
	public HomePage clickLogin() {
		WebElement loginButton = locateElement("class","decorativeSubmit");
		click(loginButton);
		return new HomePage() ;

	}


}
