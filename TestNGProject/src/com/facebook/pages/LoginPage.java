package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods{

	public LoginPage() throws Exception {
		super();
		
	}
//click on email field
	public void clickEmail() {
		clickWebElement("Email");
		handlelogger("LoginPage", "Clicked Email field");
	}
	//enter email
	public void enteremail() {
		enterData("Email", "TestData1");
	handlelogger("LoginPage","Entered email");
	}
	//clear email field
	public void clearemail() {
		clearData("Email");
		handlelogger("LoginPage", "Cleared email field");
	}
	//click on password field
	public void clickpassword() {
		clickWebElement("Password");
		handlelogger("LoginPage", "click on password field");
	}
	//enter password
	public void enterpassword() {
		enterData("Password", "TestData2");
		handlelogger("LoginPage", "password entered");
	}
	//clear password field
	public void clearpassword() {
		clearData("Password");
		handlelogger("LoginPage", "Cleared password field");
	}
	//get facebooktext
	public void getfacebooktext() {
		getWebElementText("FacebookText");
		handlelogger("LoginPage", "fetching facebook text");
	}
	
	//click on login button
	public void clickonloginbutton() {
		clickWebElement("LoginButton");
		handlelogger("LoginPage", "clicked on login button");
	}
}
