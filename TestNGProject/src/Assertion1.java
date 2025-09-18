import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
@Test
public void testcase1() {
	System.setProperty("webdriver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	String expectedText="Facebook helps you connect and share with the people in your life.";
	String actualtext=driver.findElement(By.xpath("//*[contains(text(),'your life')]")).getText();
	//Equal Assertion
	Assert.assertEquals(actualtext, expectedText);
	System.out.println("Equal assertion verified");
	//false assertion
	Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'your life')]")).isSelected());
	System.out.println("False assertion verified");
	//True assertion
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'your life')]")).isDisplayed());
		System.out.println("True assertion verified");
}
}
