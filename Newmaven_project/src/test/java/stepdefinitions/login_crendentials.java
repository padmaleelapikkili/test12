package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_crendentials {

WebDriver driver;

@Given("chrome browser is open")
public void chrome_browser_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
   
}

@Given("user is on login page")
public void user_is_on_login_page() {
	driver.navigate().to("https://www.saucedemo.com");
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^enters(.*) and (.*)")
public void enter_username_and_password(String username,String password) 
{
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
   
}

@Then("navigate to home page")
public void navigate_to_home_page() {
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
   
}











}
