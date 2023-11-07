Feature: Login Funtionality of DemoWebShop
@ValidCredentials
Scenario: Verification of Login using valid credentials
Given User is on DemoWebShop Home page
When User clicks Login
And User enters Email and Password
And User clicks Remember me
And User clicks login button
Then User should be able to login sucessfully

@InvalidCredentials
Scenario: Verification of Login using invalid credentials
Given User is on DemoWebShop Home page
When User clicks Login
And User enters Email and Password
And User clicks Remember me
And User clicks login button
Then Login will be unsucessful with error message
