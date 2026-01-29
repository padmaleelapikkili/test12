package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_definitions {
WebDriver driver;

@Given("browser is open")
public void browser_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
   
}

@Given("user in on  google search page")
public void user_in_on_google_search_page() {

	driver.navigate().to("https://google.com");
    // Write code here that turns the phrase above into concrete actions
    
}

@When("user enters a text in  search box")
public void user_enters_a_text_in_search_box() {
	driver.findElement(By.name("q")).sendKeys("India");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("user is navigated to search results")
public void user_is_navigated_to_search_results() {
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
   
}


}
