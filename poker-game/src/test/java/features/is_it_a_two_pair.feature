Feature: Is it a two pair?
	Regardless of order
	
Scenario: A two pair in any order
	Given I have a two pair in any order
	When I check for a two pair
	Then it should be a two pair
