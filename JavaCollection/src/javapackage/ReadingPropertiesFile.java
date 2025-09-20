package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of config file
		File src1 = new File("C:\\Users\\DHIRAJ\\eclipse-workspace\\JavaCollection\\testProperties\\config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		//Create properties class object to read properties file
		Properties pro1=new Properties();
		pro1.load(fis1);
		//Specify the location of locators file
		File src2 = new File("C:\\Users\\DHIRAJ\\eclipse-workspace\\JavaCollection\\testProperties\\locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		//Create properties class object to read properties file
		Properties pro2=new Properties();
		pro2.load(fis2);
		//Specify the location of locators file
				File src3 = new File("C:\\Users\\DHIRAJ\\eclipse-workspace\\JavaCollection\\testProperties\\testdata.properties");
				FileInputStream fis3 = new FileInputStream(src3);
				//Create properties class object to read properties file
				Properties pro3=new Properties();
				pro3.load(fis3);
				System.setProperty(pro1.getProperty("driverProperties"), pro1.getProperty("driverPath"));
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//getProperty() method will accept key and return value of that key
				driver.get(pro1.getProperty("URL_1"));
				driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
				driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
				driver.close();
				
			
	}

}
