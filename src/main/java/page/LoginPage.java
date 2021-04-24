package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
	@FindBy(how= How.ID, using = "email")WebElement USERNAME_FIELD_LOCATOR;
    @FindBy(how =How.ID, using = "pass")WebElement PASSWORD_FIELD_LOCATOR;
    @FindBy(how =How.NAME, using = "login")WebElement SIGNIN_BUTTON_LOCATOR;
    
   
    public void enterUsername(String username) {
    	USERNAME_FIELD_LOCATOR.sendKeys(username);	
    }
    	public void enterPassword(String password) {
    	PASSWORD_FIELD_LOCATOR.sendKeys(password);
    	}	
        public void clickSigninButton() {
        	SIGNIN_BUTTON_LOCATOR.click();
        }
    }
    

