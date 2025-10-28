package interviewjavaprog;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookies {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DHIRAJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		try {
			driver.get("https://www.example.com/");
			//create Cookie object
		Cookie addcookies=new Cookie("username","testuser");
		//add the cookie
		driver.manage().addCookie(addcookies);
		//verify the cookie was added
		Cookie addedcookie = driver.manage().getCookieNamed("username");
		if(addedcookie !=null) {
			System.out.println("Cookie 'username' added successfully with value: "+addedcookie.getValue());
		}
		else
		{
			System.out.println("Failed to add cokkie 'username");
		}
		}
		finally{
			driver.close();
		}
	}

}
