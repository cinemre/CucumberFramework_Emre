package com.neotech.steps;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

import org.junit.Assert;

public class DashboardSteps extends CommonMethods{
	@Then("I want to validate the items on the menu")
	public void i_want_to_validate_the_items_on_the_menu(io.cucumber.datatable.DataTable dataTable) {
	   
		List<String> expectedlist = dataTable.asList();
		List<String> actuaList = new ArrayList<>();
		
		//click on the more menu to collect it
		click(dashboard.moreMenuItem);
		wait(4);
		
		
		for (WebElement el : dashboard.menuList) {
			actuaList.add(el.getText());
		}
		
		System.out.println("Actual List " + actuaList);
		
		Assert.assertEquals(expectedlist, actuaList);
	}
	
	
	

}
