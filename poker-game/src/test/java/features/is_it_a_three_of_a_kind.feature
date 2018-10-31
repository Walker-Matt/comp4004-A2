Feature: Is it a three of a kind?
	Regardless of order
	
Scenario: A three of a kind in order
	Given I have a three of a kind in order
	When I check for a three of a kind
	Then it should be a three of a kind
	
Scenario: A three of a kind out of order 1
	Given I have a three of a kind out of order (one)
	When I check for a three of a kind
	Then it should be a three of a kind
	
Scenario: A three of a kind out of order 2
	Given I have a three of a kind out of order (two)
	When I check for a three of a kind
	Then it should be a three of a kind
	
Scenario: A three of a kind out of order 3
	Given I have a three of a kind out of order (three)
	When I check for a three of a kind
	Then it should be a three of a kind
	
Scenario: A three of a kind out of order 4
	Given I have a three of a kind out of order (four)
	When I check for a three of a kind
	Then it should be a three of a kind
	
Scenario: A three of a kind in reverse order
	Given I have a three of a kind in reverse order
	When I check for a three of a kind
	Then it should be a three of a kind