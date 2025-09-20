package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/elec-b2b-store?fm=neo%2Fmerchandising&iid=M_0d1f51b2-8a89-42a0-9b3c-fe4e29db8575_2_X1NCR146KC29_MC.8S96M66IX7U4&otracker=hp_rich_navigation_2_2.navigationCard.RICH_NAVIGATION_Electronics~Electronics%2BGST%2BStore_8S96M66IX7U4&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L1_view-all&cid=8S96M66IX7U4");
       WebElement electronics=driver.findElement(By.xpath("//*[text()='Electronics']"));
       Actions act=new Actions(driver);
       act.moveToElement(electronics).build().perform();
       WebElement men=driver.findElement(By.xpath("//*[text()='Men']"));
       Thread.sleep(2000);
       act.moveToElement(men).build().perform();
       Thread.sleep(2000);
       act.contextClick(men).build().perform();
       Thread.sleep(2000);
       act.sendKeys(Keys.ENTER).build().perform();
       
       
	}

}
