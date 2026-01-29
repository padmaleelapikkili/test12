package Extentreport;

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

public class ExtentReportDemo {
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
	ExtentTest test=extent.createTest("login test").assignAuthor("paddu");
	test.pass("Login Test Successful");
	test.info("url loaded");
	test.pass("login test completed successfully");
	
	ExtentTest test1=extent.createTest("Homepage test").assignAuthor("paddu");
	test.pass("Homepage Test Successful");
	test.info("value entered");
	test.fail("Homepage test fails");
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google1")) {
			test.log(Status.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(Status.FAIL, "Test Failed");
			
		}
		
			driver.quit();
			
  }
    @AfterClass
  public void teardown() {
	  extent.flush();
  }
			
		}
  

