Feature: Register test 
	Register should display after clicking on register link
Fill till data and register
user should get registered and message should displayed 

Background: 
	Given I pass all the tests data in sheet name "REGISTER" 
	Then I want to run test for row number "2" 
	
@Register_Pos 
Scenario Outline: Register a new user 
	When I click on register 
	Then I verify register label displayed 
	Then I click on male radio button 
	Then I enter "FIRST_NAME" 
	Then I enter "LAST_NAME" 
	Then I select "DAY" 
	Then I will close browser for iteration 
	
	Examples: 
		| FIRST_NAME | LAST_NAME | DAY | 
		| "Test" | "test" | "03" |