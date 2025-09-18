import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestNG8 {
	WebDriver driver;
@BeforeClass
public void setEnv() {
	System.setProperty("webdeiver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
@DataProvider
public Object[][] dataset()throws Exception
{
	
}
}
