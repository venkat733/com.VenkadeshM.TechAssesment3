Feature: Providing required data for register using data Table
  Scenario: Register using valid credentials
  	Given url to launch webpage
    When User clicking register Page to enter credentials
    And User clicking radio button
    And User entering firstname,Lastname,email,password and also confirm password
    | FirstName      | LastName    |            Email              | Password    | Confirm Password |
    | Venkadesh      | M           | venk123@gmail.com             | 123456      |  123456          |
    And User clicks register button
    Then Check weather User register successfully
  
     