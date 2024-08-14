package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside step : user is on login page");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step : user enters username and password");
	    //throw new io.cucumber.java.PendingException();
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : clicks on login button");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step : user is navigated to home page");
	    //throw new io.cucumber.java.PendingException();
	}
	
}









