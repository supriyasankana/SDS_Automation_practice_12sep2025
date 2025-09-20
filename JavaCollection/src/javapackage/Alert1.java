package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		String actualAlerttext=driver.switchTo().alert().getText();
		String expectedAlerttext="Do you confirm action?";
		if(expectedAlerttext.equalsIgnoreCase(actualAlerttext))
		{
			System.out.println("Alert text verified");
		}
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		//System.out.println("alert accepted");
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed");
		driver.close();
	}

}
