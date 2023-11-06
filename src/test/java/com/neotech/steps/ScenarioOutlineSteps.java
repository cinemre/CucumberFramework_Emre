package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps extends CommonMethods{
	
	@When("Login with {string} and {string}")
	public void login_with_and(String username, String password) {
	    System.out.println("Login with " + username + " and " + password);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	    System.out.println("Clicking on the login button");
	}
	@Then("validate that {string} is displayed")
	public void validate_that_is_displayed(String username) {
	    System.out.println("Validate the Wellcome " + username + " is dsplayed" );
	}
	@Then("We want to say Bye {string}")
	public void we_want_to_say_bye(String fullname) {
	    System.out.println("Bye bye " + fullname);
	}

}
