package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Thread.sleep(3000); - Always it will wait for 30 seconds -Not recommended
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("How stuff works");
		
		//Hendle Auto suggestion
		List<WebElement> bm=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("total number of suggession " + bm.size());
		
		for (int i=0;i<bm.size();i++)
		{
			String expresult="how stuff works science";
			if(bm.get(i).getText().equalsIgnoreCase(expresult)) {
				bm.get(i).click();
			break;
			}
		}

	}

}
