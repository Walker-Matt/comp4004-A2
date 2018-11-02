Feature: Is it a four of a kind?
	Regardless of order
	
Scenario: A four of a kind in any order
	Given I have a four of a kind in any order
	When I check for a four of a kind
	Then it should be a four of a kind
	