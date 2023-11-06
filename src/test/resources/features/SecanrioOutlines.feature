Feature: Scenario Outline Example

  @Outline
  Scenario Outline: 
    When Login with "<username>" and "<password>" 
    And Click on the login button
    Then validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname       |
      | Caglar   | c1234    | Caglar Akcinar |
      | Mesut    | m1234    | Mesut Erol     |
      | yildirim | y1234    | Yildirim Likos |
