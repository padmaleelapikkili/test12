package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Loginpage;

public class LoginPageFactory_test {
	public static void main (String[]args) {
		WebDriver driver;
		Loginpage loginpage;
		driver=new ChromeDriver();
		loginpage=new Loginpage(driver);
	loginpage.nagivateTo();
	
		loginpage.login("standard_user", "secret_sauce");
//		loginpage.navigateTo();
//		loginpage.login("invalidusername", "wrongpassword");
		driver.quit();
		
	}

}



