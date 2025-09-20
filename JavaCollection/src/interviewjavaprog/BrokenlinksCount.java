package interviewjavaprog;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// A valid URL will have a 2xx HTTP status code.  Broken links, which are essentially invalid HTTP requests have 4xx and 5xx status codes.
public class BrokenlinksCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement Li:links) {
			String url=Li.getAttribute("href");
			System.out.println("Hyperlink :"+url);
			try {
				URL link = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
				httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
				httpURLConnection.connect();
				System.out.println(url +"= response:"+httpURLConnection.getResponseCode());


				if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
				} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				}
				} catch (Exception e) {
				System.out.println(url + " - " + "is a broken link");
				}
		}

	}

}
