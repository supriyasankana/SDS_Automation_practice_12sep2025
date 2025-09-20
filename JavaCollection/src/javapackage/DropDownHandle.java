package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Create new account']")).click();

//1st way
List<WebElement> bm=driver.findElements(By.xpath("//select[@id='month']/option"));
System.out.println("Total no of values " +bm.size());
bm.get(3).click();
Thread.sleep(2000);

//2nd way
WebElement bm1=driver.findElement(By.xpath("//select[@id='month']"));
Select month=new Select(bm1);
month.selectByIndex(0);//Jan
Thread.sleep(2000);
month.selectByValue("12"); //Dec
Thread.sleep(2000);
month.selectByVisibleText("Apr");
Thread.sleep(2000);
System.out.println(month.getFirstSelectedOption().getText()); // Apr-returns the last selected value

//3rd way
List<WebElement> dropdown=month.getOptions();
System.out.println("total dropdown values 2nd time  "+ dropdown.size());
for(int i=0;i<dropdown.size();i++)
{
	System.out.println(dropdown.get(i).getText());
	dropdown.get(i).click();
	Thread.sleep(2000);
	if(dropdown.get(i).getText().equalsIgnoreCase("May"))
	dropdown.get(i).click();
}

//4th way
driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb");
//driver.close();

	}

}
