package interviewjavaprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenIncognitoWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DHIRAJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//create ChromeOptions object
		ChromeOptions option=new ChromeOptions();
		//add incognito argument
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//you can perform your automation task here
		
	}

}
