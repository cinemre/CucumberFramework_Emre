package com.neotech.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps extends CommonMethods{
	
	@When("I login to the HRMS")
	public void i_login_to_the_hrms() {
	   System.out.println("Login");
	}
	@When("I want to add Employees")
	public void i_want_to_add_employees(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		/*
		 * Map<String,String> map1 = new HashMap<>(); map1.put("MN","Faruk");
		 * map1.put("FN","Omer"); map1.put("LN","Turkoglu");
		 * 
		 * Map<String,String> map2 = new HashMap<>(); map2.put("MN","");
		 * map2.put("FN","Emre"); map2.put("LN","Cinar");
		 * 
		 * Map<String,String> map3 = new HashMap<>(); map3.put("MN","Boss");
		 * map3.put("FN","Cihan"); map3.put("LN","Abbak");
		 * 
		 * List<Map<String,String>> lm = new ArrayList<>(); 
		 * lm.add(map1); lm.add(map2); lm.add(map3);
		 */
		
		// getting data from the incoming DataTable
		
		List<Map<String,String>>listofMaps=dataTable.asMaps();
		
		for(Map<String,String> map : listofMaps) {
			System.out.println(map);
			
			System.out.println("FirstName " + map.get("FirstName"));
			System.out.println("LastName " + map.get("LastName"));
			System.out.println("MiddleName " + map.get("MiddleName"));
		}
		
	}
	@Then("I validate the employee is added")
	public void i_validate_the_employee_is_added() {
	    System.out.println("Validated Employee added");
	}

}
