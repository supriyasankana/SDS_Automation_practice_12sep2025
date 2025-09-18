package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.facebook.genericPage.CommonMethods;

public class PageFactoryLoginPage {

	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	public void enteremail(String testdata) {
		Email.sendKeys(testdata);
	}
	public void enterpassword(String testdata) {
		password.sendKeys(testdata);
	}
}
