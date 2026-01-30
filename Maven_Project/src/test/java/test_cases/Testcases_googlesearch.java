package test_cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Google_search;

public class Testcases_googlesearch {
	static WebDriver driver;
	public
 static void main(String [] args) {
		googlesearch();
		//driver.quit();
		
	}
	public static void googlesearch() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Google_search.textbox_search(driver).sendKeys("India");
		Google_search.textbox_search(driver).sendKeys(Keys.ENTER);
	}
}
