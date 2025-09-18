package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
		
	}
	
// get text of webelement
	public void getWebElementText(String xpathkey) {
		String getTextofWebElement=driver.findElement(By.xpath(loc.getProperty(xpathkey))).getText();
		System.out.println(getTextofWebElement);
	}
	
	//click method
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).click();
	}
	//clear method
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).clear();
	}
	//enter data
	public void enterData(String xpathkey,String testdata) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}
	//Mouse Hover
	public void moveToElement(String xpathkey) {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(loc.getProperty(xpathkey)))).build().perform();
	}
	//select dropdown value using visible text
	public void selectDropdownValue(String xpathkey,String testdata) {
		WebElement ele=driver.findElement(By.xpath(loc.getProperty(xpathkey)));
		Select webElem=new Select(ele);
		webElem.selectByVisibleText(td.getProperty(testdata));
		}
	//Read Excel Data
	public void readExcelData(String xpathkey,int rowno,int columnNo,String excelSheetName) throws Exception {
		File src=new File(".\\src\\com\\facebook\\resources\\Test Data Excel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(con.getProperty(excelSheetName));
		String abc=sh.getRow(rowno).getCell(columnNo).getStringCellValue();
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).sendKeys(abc);
	}
	//handling explicitwait-visibilityOfElementLocated
	public void handleExplicitwait_visibilityOfElementLocated(String xpathkey,String testdata) {
		WebDriverWait wt=new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty(xpathkey)))).sendKeys(testdata);
	}
	
	//handling explicitwait-elementtobeclickable
	public void handleExplicitwait_elementToBeClickable(String xpathkey) {
		WebDriverWait wt=new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty(xpathkey)))).click();
	}
	
	//handle log file
	public void handlelogger(String logClassName,String loggerText) {
		Logger logger=Logger.getLogger(logClassName);
		PropertyConfigurator.configure(con.getProperty("log4jpropertiesfileLoc"));
		logger.info(loggerText);
	}
	
	//Capture screenshot
	public void captureScreenshot(ITestResult result) throws Exception{
		if (ITestResult.FAILURE == result.getStatus()){
			//Create ref of TakesScreenshot Interface and Typecasting
			TakesScreenshot ts=(TakesScreenshot) driver; //Typecasting of 2 interfaces

			//Use getScreenshotAs() to capture the screenshot in file format
			File sourceFile=ts.getScreenshotAs(OutputType.FILE);

			//copy the file to specific location
			File destFolder=new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile,destFolder);
			System.out.println(result.getName() + "method() failed,screenshot captured.");
			}
}
}
