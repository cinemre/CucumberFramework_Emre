package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PimFormPageElements extends CommonMethods{
	
	@FindBy(id="pimPersonalDetailsForm")
	public WebElement pimform;
	
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="pim.navbar.employeeName")
	public WebElement employeeName;
	
	@FindBy (xpath="(//button[@type='submit'])[1]")
	public WebElement savebutton;
	
	@FindBy (id="licenseNo")
	public WebElement licenseNo;
	
	@FindBy (xpath="//label[text()='Smoker']")
	//@FindBy (id="smoker")
	public WebElement smoker;
	
	@FindBy (xpath="//div[@id='emp_gender_inputfileddiv']")
	public WebElement genderInput;
	
	@FindBy (xpath="//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOption ;
	
	@FindBy(xpath="//div[@id='nation_code_inputfileddiv']")
	public WebElement nationalityInput;
	
	@FindBy (xpath="//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationalityOption ;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/parent::div//i")
	public WebElement licExpDate;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licExpYearInput;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/ul/li")
	public List<WebElement> licExpYearOptions;
	
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licExpMonthInput;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']//ul//li")
	public List<WebElement> licExpMonthOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/..//table/tbody/tr/td")
	public List<WebElement> licExpDayOptions;
	
	
	
	public PimFormPageElements() {
		PageFactory.initElements(driver, this);

}
}
