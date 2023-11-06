Feature: Searching in Google 

Scenario: Seacrh by typing 
Given I navigated to Google
When I type something in the search box
And I click on the search button
Then I can see the results of my search
And I can count the number of the results


Scenario: Searching with Voice 
Given I navigated to Google
When I say what I want to search 
Then I can see the results of my search 
And I can count the number of the results