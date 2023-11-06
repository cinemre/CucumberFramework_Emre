#this tag is added to the feature file -- all scenarios belong to thid
@background
Feature: Backgroun Example

	
Background:
	Given Precondition1
	And Precondition2	
	
#this tag is added to the Scenario itself
	@smoke @sprint5
	Scenario: Exmaple1
	When Test nr1 firstName is "Emre" and lastName is "Cinar"
	And Test nr2
	And Test nr3
	Then Validate nr1
	And Validation nr2
	
	Scenario: Exmaple2
	When Test nr4
	And Test nr5
	And Test nr6
	Then Validate nr3
	And Validation nr4

