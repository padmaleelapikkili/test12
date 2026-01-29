package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginfeature_ex {



@Given("user is on HRMLogin page {string}")
public void user_is_on_hrm_login_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("user is on HRMLogin page {string}");
}

@When("user enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user enters username as {string} and password as {string}");
}

@Then("user should be able to login successfully and new page opens")
public void user_should_be_able_to_login_successfully_and_new_page_opens() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user should be able to login successfully and new page opens");
}

@Then("user should be able to see a message {string} below usename and password")
public void user_should_be_able_to_see_a_message_below_usename_and_password(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user should be able to see a message {string} below usename and password");
}



}
