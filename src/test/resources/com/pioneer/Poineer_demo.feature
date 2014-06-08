Feature: Creative
	In order to create a new creative
	I want to specify the fields for a new creative


Background: User has a session and enough privilegies
	Given user has a valid session with following details
	|attribute 	|value|
    |username 	|jbarnes |
    |password   |Test1234|
	

Scenario: create a new Creative
	Given user is on creative search page
	Then user gets an option to create a new creative
	When user clicks on new creative
	When user enters following data in the fields
    |attribute 		|value|
    |Media Type 	|Email|
    |Product 		|productfour|
    |Show 			|showFour|
    |Version 		|024 |
    |Allowable		|1001 |
    |Product Abbr	|PdenFour|
    |Show abbr		|SdenFour|
    When user save the data
	Then user gets a success message
	Then user closes the browser
	
Scenario: create a new Creative - Mandatory fields Error message
	Given user is on creative search page
	Then user gets an option to create a new creative
	When user clicks on new creative
    When user save the data
	Then user gets error messages for mandatory fields
	Then user closes the browser
	