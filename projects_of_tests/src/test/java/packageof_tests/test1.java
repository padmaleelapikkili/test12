package packageof_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1 {

	WebDriver driver;
@Given("I am on the amazon website")
public void i_am_on_the_amazon_website() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
}

@Then("click on the fresh")
public void click_on_the_fresh() {
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[10]/div/a")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[4]/div/div/div[1]/div/div[2]/div[1]/div[2]/div/span[22]/div/label/span/span")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[4]/div/div/div[1]/div/div[2]/div[1]/div[3]/div/span[2]/div/label/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[3]/div/section/div/div/div[2]/div/div[1]/ol/li[1]/a/div/div/img")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div/span/div/div[3]/div[1]/ul/span/span/li/span/a/div[1]/label/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div/span/div/div[3]/div[4]/ul/span/span/li/span/div/a/i")).click();
//	driver.findElement(By.xpath("//*[@id=\"a-autoid-105-announce\"]")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div/span/div/div[3]/div[7]/ul/span/span[1]/li/span/a/div/label/i")).click();
}


@Then("click on fruits and vegetables")
public void click_on_fruits_and_vegetables() {
	driver.findElement(By.className("a-button-text")).click();
	//WebElement searchBox=driver.findElement(By.xpath("//*[@id"));
   // searchBox.click();
    //searchBox.clear();
   // searchBox.sendKeys("fruits " +Keys.ENTER);
	//searchBox.sendKeys(Keys.ENTER);
   
}

@Then("add items to cart and view cart")
public void add_items_to_cart_and_view_cart() {
	
	
}

@When("It is showing the cart if empty")
public void it_is_showing_the_cart_if_empty() {

}



}
