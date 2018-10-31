Feature: Is it a straight?
	Regardless of order
	
Scenario: A straight in order
	Given I have a straight in order
	When I check for a straight
	Then it should be a straight
	
Scenario: A straight out of order 1
	Given I have a straight out of order (one)
	When I check for a straight
	Then it should be a straight
	
Scenario: A straight out of order 2
	Given I have a straight out of order (two)
	When I check for a straight
	Then it should be a straight
	
Scenario: A straight out of order 3
	Given I have a straight out of order (three)
	When I check for a straight
	Then it should be a straight
	
Scenario: A straight out of order 4
	Given I have a straight out of order (four)
	When I check for a straight
	Then it should be a straight
	
Scenario: A straight in reverse order
	Given I have a straight in reverse order
	When I check for a straight
	Then it should be a straight