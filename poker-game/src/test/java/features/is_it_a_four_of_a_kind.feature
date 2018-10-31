Feature: Is it a four of a kind?
	Regardless of order
	
Scenario: A four of a kind in order
	Given I have a four of a kind in order
	When I check for a four of a kind
	Then it should be a four of a kind
	
Scenario: A four of a kind out of order 1
	Given I have a four of a kind out of order (one)
	When I check for a four of a kind
	Then it should be a four of a kind
	
Scenario: A four of a kind out of order 2
	Given I have a four of a kind out of order (two)
	When I check for a four of a kind
	Then it should be a four of a kind
	
Scenario: A four of a kind out of order 3
	Given I have a four of a kind out of order (three)
	When I check for a four of a kind
	Then it should be a four of a kind
	
Scenario: A four of a kind in reverse order
	Given I have a four of a kind in reverse order
	When I check for a four of a kind
	Then it should be a four of a kind