Feature: Is it a full house?
	Regardless of order
	
Scenario: A full house in any order
	Given I have a full house in any order
	When I check for a full house
	Then it should be a full house
