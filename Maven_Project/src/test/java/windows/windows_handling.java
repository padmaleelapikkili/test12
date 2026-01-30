package windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handling {
	public static void main (String[]args, WindowType window, WindowType windowtype)throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("//https:www.google.com");
	String initialHandle=driver.getWindowHandle();
	//open a new tab and navigate to another url
	driver.switchTo().newWindow(WindowType.TAB );
	driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
	//ensure there are two windows opened
	System.out.println(driver.getWindowHandles().size());
	//switch back to the original window (main window)
driver.switchTo().window(initialHandle);
Thread.sleep(2000);
driver.close();
System.out.println(driver.getWindowHandles().size());
driver.quit();
}
}

