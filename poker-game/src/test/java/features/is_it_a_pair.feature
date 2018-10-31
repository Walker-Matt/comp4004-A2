Feature: Is it a pair?
	Regardless of order
	
Scenario: A pair in order
	Given I have a pair in order
	When I check for a pair
	Then it should be a pair
	
Scenario: A pair out of order 1
	Given I have a pair out of order (one)
	When I check for a pair
	Then it should be a pair
	
Scenario: A pair out of order 2
	Given I have a pair out of order (two)
	When I check for a pair
	Then it should be a pair
	
Scenario: A pair out of order 3
	Given I have a pair out of order (three)
	When I check for a pair
	Then it should be a pair
	
Scenario: A pair out of order 4
	Given I have a pair out of order (four)
	When I check for a pair
	Then it should be a pair
	
Scenario: A pair in reverse order
	Given I have a pair in reverse order
	When I check for a pair
	Then it should be a pair