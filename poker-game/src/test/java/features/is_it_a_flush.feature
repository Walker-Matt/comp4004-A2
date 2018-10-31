Feature: Is it a flush?
	Regardless of order
	
Scenario: A flush in order
	Given I have a flush in order
	When I check for a flush
	Then it should be a flush
	
Scenario: A flush out of order 1
	Given I have a flush out of order (one)
	When I check for a flush
	Then it should be a flush
	
Scenario: A flush out of order 2
	Given I have a flush out of order (two)
	When I check for a flush
	Then it should be a flush
	
Scenario: A flush out of order 3
	Given I have a flush out of order (three)
	When I check for a flush
	Then it should be a flush
	
Scenario: A flush out of order 4
	Given I have a flush out of order (four)
	When I check for a flush
	Then it should be a flush
	
Scenario: A flush in reverse order
	Given I have a flush in reverse order
	When I check for a flush
	Then it should be a flush