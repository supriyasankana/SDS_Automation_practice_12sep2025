package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class MasterPage {

	public static WebDriver driver;
	public Properties con;
	public Properties loc;
	public Properties td;
	public MasterPage() throws Exception {
		//config properties file implementation
		FileInputStream fis1=new FileInputStream(".\\src\\com\\facebook\\repository\\config.properties");
		con=new Properties();
		con.load(fis1);
		//locator properties file implementation
		FileInputStream fis2=new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		loc=new Properties();
		loc.load(fis2);
		//testdata properties file implementation
		FileInputStream fis3=new FileInputStream(".\\src\\com\\facebook\\repository\\testdata.properties");
		td=new Properties();
		td.load(fis3);
		//Launching browsers-chrome/firefox/edge
		if(con.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\src\\com\\facebook\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (con.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",".\\src\\com\\facebook\\drivers\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		else if (con.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",".\\src\\com\\facebook\\drivers\\edgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("No Browser found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(con.getProperty("URL_1"));
		
	}
	@AfterSuite
	public void closeApplication() {
		driver.close();
		
	}
}
