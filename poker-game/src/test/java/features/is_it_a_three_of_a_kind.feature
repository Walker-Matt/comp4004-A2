Feature: Is it a three of a kind?
	Regardless of order
	
Scenario: A three of a kind in any order
	Given I have a three of a kind in any order
	When I check for a three of a kind
	Then it should be a three of a kind
