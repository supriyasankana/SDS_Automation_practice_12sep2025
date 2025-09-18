package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

public class LoginTest {
	
@Test
public void loginTest() throws Exception {
	LoginPage lp=new LoginPage();
	lp.clickEmail();
	lp.enteremail();
	lp.clickpassword();
	lp.enterpassword();
	lp.getfacebooktext();
	Thread.sleep(2000);
	lp.clearemail();
	Thread.sleep(2000);
	lp.clearpassword();
	lp.readExcelData("Email", 0, 0, "ExcelSheetName");
	Thread.sleep(2000);
	lp.readExcelData("Password", 0, 1, "ExcelSheetName");
}
@AfterMethod
public void takescreenshot(ITestResult result2) throws Exception {
	LoginPage lp=new LoginPage();
	lp.captureScreenshot(result2);
}
}
