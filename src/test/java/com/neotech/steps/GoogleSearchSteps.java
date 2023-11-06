package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	
	@Given("I navigated to Google")
	public void i_navigate_to_google() {
	    System.out.println("I go to Google Page");
	    throw new io.cucumber.java.PendingException();
	}

	@When("I type something in the search box")
	public void i_type_something_in_the_search_box() {
		System.out.println("I search for puppy images");
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		System.out.println("Click on search button");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I can see the results of my search")
	public void i_can_see_the_results_of_my_seacrh() {
		System.out.println("Validate the results are showing");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I can count the number of the results")
	public void i_can_count_the_number_of_the_results() {
		System.out.println("Count the number of results");
	    throw new io.cucumber.java.PendingException();
	    
	 }
	
	@When("I say what I want to search")
	public void i_say_what_i_want_to_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
