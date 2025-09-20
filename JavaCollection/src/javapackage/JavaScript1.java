package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//delete all cookies
		driver.manage().deleteAllCookies();
		//JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementsByName('pass')[0].value='ABCD'");
		jse.executeScript("document.getElementsByName('login')[0].click()");
		
		driver.get("https://money.rediff.com/gainers");
		
		//scroll down using javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500000)");
		Thread.sleep(2000);
		//scroll up using javascript
		jse.executeScript("window.scrollBy(0,-500000)");
		

	}

}
