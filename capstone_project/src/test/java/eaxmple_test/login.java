package eaxmple_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	
	WebDriver driver;
	@Given("I am on the amazon website")
	public void i_am_on_the_amazon_website() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	@Then("click on the cart")
	public void click_on_the_cart() {
	   driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	}
	@Then("click on sign up")
	public void click_on_sign_up() {
		driver.findElement(By.cssSelector("#rcx-sc-sign-up > span > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click();
	    
	}

	@When("giving multiple user emails using data provider")
	public void giving_multiple_user_emails_using_data_provider() {
		
		
		driver.quit();
	    
	
	        }
	 @DataProvider(name = "useremail")
	    public Object[][] userData() {
	        return new Object[][] {
	            { "padmaleelapikkili@gmail.com" },
	            { "hamsi@leo@gmail.com"},
	            { "padmaleela.pikkili@gmail.com"}
	        };
	        }
	        @Test(dataProvider="useremail")
	        public void testuserid(String useremail){
	        	System.out.println("user email:"+useremail);
	        	
	        	
	        }


}
