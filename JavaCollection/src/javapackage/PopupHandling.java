package javapackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		//step-1 Tab handling
		driver.findElement(By.id("tabButton")).click();
		//get the total number of open tabs
		Set<String> alltabid=driver.getWindowHandles();
		String parenttabid=driver.getWindowHandle();
		System.out.println("All tabs windowids " + alltabid);
		System.out.println("parent window id  "+parenttabid);
        for (String abcd:alltabid) {
        	driver.switchTo().window(abcd);
        	if(abcd.equalsIgnoreCase(parenttabid)) {
        		System.out.println("Parenttab title "+driver.getTitle());
        	}
        	else
        	{
        		System.out.println("child tab url " + driver.getCurrentUrl());
        	}
        }
        
        driver.close();
        //step-2 window handling
        driver.switchTo().window(parenttabid);
        driver.findElement(By.id("windowButton")).click();
        //get total number of open windows
        
       Set<String> alwindowids=driver.getWindowHandles();
       String parentwindowid= driver.getWindowHandle();
       System.out.println("total open windowids "+ alwindowids);
       System.out.println("Parent window id "+parentwindowid);
       
       for(String abcd:alwindowids) {
    	   driver.switchTo().window(abcd);
    	   if(abcd.equalsIgnoreCase(parentwindowid)) {
    		   System.out.println("parent window title  "+driver.getTitle());
    	   }
    	   else
    	   {
    		   System.out.println("Child window url "+ driver.getCurrentUrl());
    	   }
       }
       
       driver.quit();
	}

}
