package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver {

	public static void main(String[] args) throws Exception {
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		//Launching chrome browser instance
		WebDriver driver=new ChromeDriver();
		//maximize my window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//open the url using get method
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		//open url using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		//refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		//Navigtate to back
		Thread.sleep(2000);
		driver.navigate().back();
		//navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//fetch the current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		//fetch title of the webpage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//close the driver instance
		Thread.sleep(2000);
		driver.close();

	}

}
