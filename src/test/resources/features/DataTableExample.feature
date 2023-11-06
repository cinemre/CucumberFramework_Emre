Feature: Scenarios with DataTable

	@dataTable
	Scenario: Add Employee DataTable
	When I login to the HRMS
	And I want to add Employees
	|FirstName|MiddleName|LastName|
	|Emre			| 					|Cinar|
	|Cihan		|Boss				|Abbak|
	|Omer			|Faruk			|Turkoglu|
	Then I validate the employee is added
	