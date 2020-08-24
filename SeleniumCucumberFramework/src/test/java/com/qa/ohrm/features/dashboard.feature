Feature: Dashbaord page feature

Scenario Outline: Verify user is able to see dashboard lables
Given user is on ohrm application login page
When user enters credentials as <username> and <password>
And click on login button
Then user can see dashboard label
And user also can see Admin tab is displayed

Examples:
	|username|password|
	|Admin|admin123|