package Extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ex_extentreport {
	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
  @BeforeClass
public void  starttest() {
	  extent=new ExtentReports();
	  spark=new ExtentSparkReporter("target/Spark.html");
  }
  @Test
  public void extenttest() {
	  spark.config().setTheme(Theme.STANDARD);
	  spark.config().setDocumentTitle("AumationReport");
	  spark.config().setReportName("ReportDemo");
	  extent.attachReporter(spark);
	ExtentTest test=extent.createTest("homepage");
	test.pass("home page  Successful");
	test.info("url loaded");
	test.pass("home page loading completed ");
	
	ExtentTest test1=extent.createTest("click fashion module");
	test.pass("fashion page successful");
	test.info("click is successful");
	test.fail("fashion module successful ");
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[10]/div/a")).click();
		 
		 driver.findElement(By.cssSelector("#sobe_d_b_ms_24_1 > a > div > div > img")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
  }
}
		/*if(driver.getTitle().equals("homepage")) {
			test.log(Status.PASS, "Navigated to the specified URL");
		}
		
		{
			test.log(Status.FAIL, "Test Failed");
			
		}
		*/
		/*	driver.quit();
			
  }
    @AfterClass
  public void teardown() {
	  extent.flush();
  }
		
		
  


		}*/
	


  
