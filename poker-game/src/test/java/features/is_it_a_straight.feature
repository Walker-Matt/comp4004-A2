Feature: Is it a straight?
	Regardless of order
	
Scenario: A straight in any order
	Given I have a straight in any order
	When I check for a straight
	Then it should be a straight
