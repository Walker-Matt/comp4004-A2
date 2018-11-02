Feature: Is it a royal flush?
	Regardless of order
	
Scenario: A royal flush in any order
	Given I have a royal flush in any order
	When I check for a royal flush
	Then it should be a royal flush
