package com.neotech.testbase;

import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.EmployeeListPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PimFormPageElements;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard ; 
	public static AddEmployeePageElements addEmployee;
	public static PimFormPageElements personalDetails;
	public static EmployeeListPageElements employeeList;
	
	
	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmployee = new AddEmployeePageElements();
		personalDetails = new PimFormPageElements();
		employeeList = new EmployeeListPageElements();
	}
	
}
