package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
driver.get("https://jqueryui.com/droppable/");
List allframes=driver.findElements(By.tagName("iframe"));

for(int i=0;i<allframes.size();i++) {
	driver.switchTo().frame(i);
	WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
	if(draggable.isDisplayed()) {
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();
	}
	
}


	}

}
