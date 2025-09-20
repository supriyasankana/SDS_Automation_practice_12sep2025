package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.facebook.com/");

//1st way
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='1']")).click();//female
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='2']")).click();//male
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='-1']")).click();//custom

//2nd way Appropriate approach
List<WebElement> radios=driver.findElements(By.xpath("//label[@class='_58mt']"));

System.out.println("Total radio buttons= "+ radios.size() );
String expresult="Female";
for(int i=0;i<radios.size();i++)
{
	if(radios.get(i).getText().equalsIgnoreCase(expresult))
	{
		radios.get(i).click();
		System.out.println(expresult +"  clicked");
	}
}
Thread.sleep(2000);
driver.close();
	}

}
