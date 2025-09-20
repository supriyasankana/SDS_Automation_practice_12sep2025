package javapackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogging {

	public static void main(String[] args) {
		//create a logger instance
		Logger logger=Logger.getLogger("Log4jLogging");
		//configure log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\DHIRAJ\\eclipse-workspace\\JavaCollection\\log4j.properties");
		//open browser instance
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("browser launched");
		//maximize
		driver.manage().window().maximize();
		logger.info("browser maximized");
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("implicit wait added");
		//launch application
		driver.get("https://www.facebook.com/");
		logger.info("application launched");
		//check if the web element is displayed or not
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("Web element found");
			
		}catch(Exception e)
		{
			logger.info("web element not found");
		}
		

	}

}
