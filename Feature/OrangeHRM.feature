Feature: Login and logout functionality of OrangeHRM

Scenario: As a admin I should login with complete access

Given we launch the browser and navigate to OrangeHRM page
When we enter the username and password
And click on login button
Then it should display welcome admin msg 


Scenario: As an admin I should be able to logout

When we click on welcome admin
And click on logout
Then it should come to the home page




