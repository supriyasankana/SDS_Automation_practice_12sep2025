package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		//create list of allcompanies
		List<WebElement> allcompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total no of companies "+ allcompanies.size());
		//create list of current price
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		String expresult="IZMO";
		for(int i=0;i<allcompanies.size();i++)
		{
			if(allcompanies.get(i).getText().equalsIgnoreCase(expresult))
			{
				System.out.println("Company name :"+allcompanies.get(i).getText() + "  Current price:  "+ currentprice.get(i).getText());
				allcompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
		
	}

}
