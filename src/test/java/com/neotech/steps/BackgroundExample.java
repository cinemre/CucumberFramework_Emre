package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExample extends CommonMethods{
	
	@Given("Precondition1")
	public void precondition1() {
	    System.out.println("Running precondition 1!");
	}

	@Given("Precondition2")
	public void precondition2() {
		System.out.println("Running precondition 2!");
	}

	@When("Test nr1")
	public void test_nr1() {
		System.out.println("Test Number1!");
	}

	@When("Test nr2")
	public void test_nr2() {
		System.out.println("Test Number2!");
	}

	@When("Test nr3")
	public void test_nr3() {
		System.out.println("Test Number3!");
	}
	@When("Test nr1 firstName is {string} and lastName is {string}")
	public void test_nr1_first_name_is_and_lasr_name_is(String string, String string2) {
		System.out.println("Test nr1 firstName is" + string + "and lastName is" + string2);
	}
	@Then("Validate nr1")
	public void validate_nr1() {
		System.out.println("Test Validation1!");
	}
	
	@Then("Validation nr2")
	public void validation_nr2() {
		System.out.println("Test Validation2!");
	}

	@When("Test nr4")
	public void test_nr4() {
		System.out.println("Test Number4!");
	}

	@When("Test nr5")
	public void test_nr5() {
		System.out.println("Test Number5!");
	}

	@When("Test nr6")
	public void test_nr6() {
		System.out.println("Test Number6!");
	}

	@Then("Validate nr3")
	public void validate_nr3() {
		System.out.println("Test Validation3!");
	}

	@Then("Validation nr4")
	public void validation_nr4() {
		System.out.println("Test Validation4!");
	}


}
