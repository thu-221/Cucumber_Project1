Feature: Testing the login page
Scenario: Try to login with invalid credentials
Given I am on the login page
When I enter invalid username and password and click the login button
Then stay on the login page

Scenario: Try to login with valid credentials
Given I am on the login page
When I enter valid username and password and click on login button
Then I should redirected to the Dashboard page