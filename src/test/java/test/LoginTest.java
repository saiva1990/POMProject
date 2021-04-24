package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void vaidUsernameShouldBeAbleToLogin() {
    driver= BrowserFactory.startBrowser();
    
    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
    loginpage.enterUsername("sai102@yahoo.com");
    loginpage.enterPassword("SA20893");
    loginpage.clickSigninButton();
    
}

}