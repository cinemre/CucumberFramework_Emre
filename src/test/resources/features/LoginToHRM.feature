@Login
Feature: Login Functionality

  @smoke
  Scenario: Valid Login
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  #And I will quit the browser
  @regression
  Scenario: Invalid Password
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a invalid password
    And I click on the login button
    Then I validate that invalid Credantials

  #And I will quit the browser
  @HW3
  Scenario Outline: Login using Scenario Outline  and Eaxmples Table
    When user enters login information "<username>" and "<password>"
    And I click on the login button
    Then verify that "<employeeName>" is showing

    Examples: 
      | username | password     | employeeName |
      | bahattin | bahattin@123 | baha Suri    |
      | sadullah | sadullah@123 | sadu Hulk    |
      | muhittin | muhittin@123 | muhi  Tut    |

  @HW3_2
  Scenario: Login using Datatable
    When user enters username and password and clicks on the login button
      | username | password     | employeeName |
      | bahattin | bahattin@123 | baha Suri    |
      | sadullah | sadullah@123 | sadu Hulk    |
