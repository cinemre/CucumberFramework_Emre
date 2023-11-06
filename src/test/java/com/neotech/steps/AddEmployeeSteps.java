package com.neotech.steps;

import java.util.List;

import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddEmployeeSteps extends CommonMethods{
	
	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
	   click(dashboard.pmi);
	   click(dashboard.addemployee);
	}
	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
	    sendText(addEmployee.firstName,"Lionel");
	    sendText(addEmployee.lastName,"Messi");
	}
	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropDown(addEmployee.location,"New York Sales Office");
	}
	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
	    wait(1);
		click(addEmployee.savebutton);
	}
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
	    waitForVisibility(personalDetails.pimform);
	    
	    
	    String expected = "Lionel Messi";
	    String actual = personalDetails.employeeName.getText();
	    
	    // Pleas make share you import the assert class in org.junit.Assert
	    Assert.assertEquals("Validation failed",expected,actual);
	    
	}
	
	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmployee.firstName,firstName);
	    sendText(addEmployee.lastName,lastName);
	}
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String fullName) {
		waitForVisibility(personalDetails.pimform);
	    
	    
	    String expected = fullName;
	    String actual = personalDetails.employeeName.getText();
	    
	    // Pleas make share you import the assert class in org.junit.Assert
	    Assert.assertEquals("Validation failed",expected,actual);
	}
	
	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
	    jsClick(addEmployee.customswitch);
	    
	}
	@When("user provides credentials")
	public void user_provides_credentials() {
	   sendText(addEmployee.username,"MarioIcardi");
	   sendText(addEmployee.firstName,"vanda@123");
	   sendText(addEmployee.confirmPassword,"vanda@123");
	}

	
	@When("user enters employee {string}, {string} and {string}")
	public void user_enters_employee_and(String first, String middle, String last) {
	    sendText(addEmployee.firstName,first);
	    sendText(addEmployee.middleName,middle);
	    sendText(addEmployee.lastName,last);
	}
	@When("user selects a location {string}")
	public void user_selects_a_location(String location) {
		selectDropDown(addEmployee.location,location);
	}
	@Then("validate that {string} and {string} is added successfully")
	public void validate_that_and_is_added_successfully(String first, String last) {
		waitForVisibility(personalDetails.pimform);
		
		String expectedName = first + " " + last;
	    String actualName = personalDetails.employeeName.getText();
	    
	    // Pleas make share you import the assert class in org.junit.Assert
	    Assert.assertEquals("Validation failed",expectedName,actualName);
	}
	
	@When("user enters employee details and clicks on save and validates it is added")
	public void user_enters_employee_details_and_clicks_on_save_and_validates_it_is_added(DataTable table) {
	   // System.out.println(table);
		
		// asLists() method as List for every row (including the header)
		//System.out.println(table.asLists());
		
		// asMaps
		System.out.println(table.asMaps());
		
		List<Map<String,String>> emolyeelist = table.asMaps();
		
		for (Map<String,String> employee : emolyeelist) {
			System.out.println(employee);
			
			String fName = employee.get("FirstName");
			String mName = employee.get("MiddleName");
			String lName = employee.get("LastName");
			
			
			sendText(addEmployee.firstName,fName);
			sendText(addEmployee.middleName,mName);
			sendText(addEmployee.lastName,lName);
			
			selectDropDown (addEmployee.location, "France Refional HQ");
			wait(1);
			
			click(addEmployee.savebutton);
			
			waitForVisibility(personalDetails.pimform);
			
			String expectedName = fName + " " + lName;
		    String actualName = personalDetails.employeeName.getText();
		    
		    // Pleas make share you import the assert class in org.junit.Assert
		    Assert.assertEquals("Validation failed",expectedName,actualName);
			
		    		    
		    // Before the next iteration
		    // We need to go to Add Employee page again 
		    
		    wait(1);
		    click(dashboard.addemployee);
		}
		
		
		
		
		
		
	}

}
