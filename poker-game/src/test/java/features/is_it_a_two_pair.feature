Feature: Is it a two pair?
	Regardless of order
	
Scenario: A two pair in order
	Given I have a two pair in order
	When I check for a two pair
	Then it should be a two pair
	
Scenario: A two pair out of order 1
	Given I have a two pair out of order (one)
	When I check for a two pair
	Then it should be a two pair
	
Scenario: A two pair out of order 2
	Given I have a two pair out of order (two)
	When I check for a two pair
	Then it should be a two pair
	
Scenario: A two pair in reverse order
	Given I have a two pair in reverse order
	When I check for a two pair
	Then it should be a two pair