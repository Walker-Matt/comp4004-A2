Feature: Is it a flush?
	Regardless of order
	
Scenario: A flush in any order
	Given I have a flush in any order
	When I check for a flush
	Then it should be a flush
