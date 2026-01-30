package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	private WebDriver driver;
	private final String url="https://www.saucedemo.com/";
			@FindBy(id="user-name")
			public WebElement usernameField;
			@FindBy(id="password")
			public WebElement passwordField;
			@FindBy(id="login-button")
			public WebElement loginButton;
			@FindBy(id="h3[data-test=error")
			public WebElement errorMessage;
			//public String getErrorMessage() {
				//return driver.findElement(errorMessage).getText();
			//
			public LoginPageFactory(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			public void nagivateTo() {
				if(!driver.getCurrentUrl().equals(url)) {
					driver.get(url);
				}
				
			}

}
