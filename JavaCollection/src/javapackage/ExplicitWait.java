package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABC@gmail.com");
		//fetch input box attribute value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		//enter password
		WebDriverWait wt=new WebDriverWait(driver,60);
		wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
		driver.findElement(By.xpath("//div[contains(@id,'u_0_4')]")).click();
		//fetch input box attribute value
		System.out.println(driver.findElement(By.id("pass")).getAttribute("value"));
		
	}

}
