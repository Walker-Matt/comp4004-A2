Feature: Is it a pair?
	Regardless of order
	
Scenario: A pair in any order
	Given I have a pair in any order
	When I check for a pair
	Then it should be a pair
