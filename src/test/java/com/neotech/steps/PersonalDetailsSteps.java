package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class PersonalDetailsSteps extends CommonMethods{
	
	
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String DriverLicense, String ExpirationDate, String Smoker, String Gender, String Nationality) {
	  
		waitForVisibility(personalDetails.pimform);
		
		sendText(personalDetails.licenseNo,DriverLicense);
		
		if (Smoker.equals("Yes")) {
			click(personalDetails.smoker);			
		}
		
		wait(2);
		
		// 1st way
		click(personalDetails.genderInput);
		//click(driver.findElement(By.xpath("//span[test()='" + Gender + "']")));
		
		List<WebElement> genderOptions = personalDetails.genderOption;
		clickOnElement(genderOptions, Gender);
		
		//for(WebElement option:genderOptions) {
		//	if(option.getText().equals(Gender)) {
	//			click(option);
	//			break;
	//		}
	//	}
		
		click(personalDetails.nationalityInput);
		
		List<WebElement> nationalityOptions = personalDetails.nationalityOption;
		clickOnElement (nationalityOptions,Nationality);
	
		wait(2);
		
		// This will show the calendar
		click(personalDetails.licExpDate);
		
		//Data param: 2024-02-4
		// Select year
		String[] dateParts = ExpirationDate.split("-");
		String year = dateParts[0];
		click(personalDetails.licExpYearInput);
		clickOnElement(personalDetails.licExpYearOptions,year);
		
		// select month
		int month = Integer.parseInt(dateParts[1]); // return 5 as integer 
		click(personalDetails.licExpMonthInput);
		click(personalDetails.licExpMonthOptions.get(month-1));
		
		//select day
		int day = Integer.parseInt(dateParts[2]); // 08 to 8
		selectCalenderDate(personalDetails.licExpDayOptions,day +""); // changing int 8 to String 8
		
	}
		
		public void clickOnElement(List<WebElement> list, String value) {
			wait(1);
			for (WebElement option : list) {
				if (option.getText().equals(value)) {
					click(option);
					break;
				}
			}
	}
		
		
	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {
	    click(personalDetails.savebutton);
	}

}
