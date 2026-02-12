package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_page {
	WebDriver driver;
	
	void homepage() {
			
	driver=new ChromeDriver();
	driver.manage().window().maximize();
   driver.get("https://www.amazon.in");

}
}
