package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
   static WebDriver driver;
	public static WebDriver startBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13142\\Desktop\\Winter2020\\POMProject\\Drivers\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		
		return driver;
		
		
	}
}
