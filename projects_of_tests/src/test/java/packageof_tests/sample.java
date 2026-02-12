package packageof_tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logger_ex.log4j2_ex;

public class sample {
	private static Logger logger= LogManager.getLogger(log4j2_ex.class);
	
	/*@BeforeClass
	public void setup() {
	driver=new ChromeDriver();
			driver.manage().window().maximize();
	}
	@AfterTest
	public  void teardown() {
		driver.quit();
	}*/
	WebDriver driver;
	@Given("I am on the amazon website")
	public void i_am_on_the_amazon_website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.amazon.in");
	   logger.info("browser is open");
	}

	@Then("click on fashion")
	public void click_on_fashion() {
	   driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[10]/div/a")).click();
	   logger.info("fashion is click");
	}

	@Then("click on the under {int}")
	public void click_on_the_under(Integer int1) {
		driver.findElement(By.cssSelector("#sobe_d_b_ms_24_1 > a > div > div > img")).click();
		logger.info("the selected icon is click");
	   
	}

	@Then("click free shipping and add items to cart")
	public void click_free_shipping_and_add_items_to_cart() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"p_n_free_shipping_eligible/205563695031\"]/span/a/div[1]/label/i")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/span/div/h1/div/div[4]/div/div/form/span/span/span/span")).click();
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"n/1953602031\"]/span/a/span[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"n/1968253031\"]/span/a/span")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"n/1968256031\"]/span/a/span")).click();
	   logger.info("items are added to the cart");
	}

	@When("it showing the cart is empty")
	public void it_showing_the_cart_is_empty() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/div[1]/span[1]/span[1]/fieldset/div[2]/div/button[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/ul/div[2]/li[2]/span/span/div/label/i")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
	Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 driver.quit();
	logger.info("the cart is empty");
	 
	}



}
