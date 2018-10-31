Feature: Is it a full house?
	Regardless of order
	
Scenario: A full house in order
	Given I have a full house in order
	When I check for a full house
	Then it should be a full house
	
Scenario: A full house out of order 1
	Given I have a full house out of order (one)
	When I check for a full house
	Then it should be a full house
	
Scenario: A full house out of order 2
	Given I have a full house out of order (two)
	When I check for a full house
	Then it should be a full house
	
Scenario: A full house out of order 3
	Given I have a full house out of order (three)
	When I check for a full house
	Then it should be a full house
	
Scenario: A full house out of order 4
	Given I have a full house out of order (four)
	When I check for a full house
	Then it should be a full house