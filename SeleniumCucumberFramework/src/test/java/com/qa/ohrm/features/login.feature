Feature: Login to the OHRM application

Scenario Outline: Verify user is able to login into the application
Given user is on ohrm application login page
When user enters credentials as <username> and <password>
And click on login button
Then user can see dashbaord url

Examples:
	|username|password|
	|Admin|admin123|