package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{
	
	
	
	/*
	 * @Given("I navigated to the HRM website") public void
	 * i_navigated_to_the_hrm_website() throws InterruptedException { setUp();
	 * 
	 * }
	 */
	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username,ConfigsReader.getProperty("username"));
	    
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password,ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    click(login.loginButton);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
	   String expected = "Jacqueline White";
	   String actual = dashboard.accountName.getText();
	   if (actual.equals(expected)) {
		   System.out.println("Test Passed");
	   }
	   else {
		   System.out.println("Test didnt Pass"); 
	   }
	}

	@When("I enter a invalid password")
	public void i_enter_a_invalid_password() {
	    sendText(login.password,"test");
	}

	@Then("I validate that invalid Credantials")
	public void i_validate_that_invalid_credantials() {
		
		String actualmessage = login.wrongCredentialsMessage.getText();
		String expectedmessage = "Invalid Credentials";
		
		if (actualmessage.equals(expectedmessage)) {
			   System.out.println("Invalid Login test Passed");
		   }
		   else {
			   System.out.println("Invalid Login test didn`t Pass"); 
		   }
		
	}
	
	
	@When("user enters login information {string} and {string}")
	public void user_enters_login_information_and(String username, String password) {
	    sendText(login.username,username);
	    sendText(login.password,password);
	}
	
	@Then("verify that {string} is showing")
	public void verify_that_is_showing(String employeeName) {
		
		String actualName = dashboard.accountName.getText();
		
		Assert.assertEquals("The account couldnt match ", employeeName, actualName);
	    
	}
	
	@When("user enters username and password and clicks on the login button")
	public void user_enters_username_and_password_and_clicks_on_the_login_button(io.cucumber.datatable.DataTable dataTable) {
	    
				
		List<Map<String,String>>listOfMaps=dataTable.asMaps();
		
		for (Map<String,String> map:listOfMaps){
			System.out.println("Testing: " + map.get("username")+" : "+ map.get("password"));
			
			sendText(login.username, map.get("username"));
			sendText(login.username, map.get("password"));
			
			click(login.loginButton);
			
			wait(1);
			
			
			String actualAccountName = dashboard.accountName.getText();
			Assert.assertEquals(map.get("employeeName"),actualAccountName);
			
			//logout
			
			click(dashboard.accountMenu);
			click(dashboard.logout);
			
			
		}
	}
	
	/*
	 * @Then("I will quit the browser") public void i_will_quit_the_browser() {
	 * tearDown(); }
	 */


}
