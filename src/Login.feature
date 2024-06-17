Feature: User login into the application

Scenario: User is loggin with valid credentials
Given User navigate to login page
When User enters the valid emailaddress "venuav14056@gmail.com"
And User enters the valid password "12345"
And User click on login button
Then User should be able to access the application
