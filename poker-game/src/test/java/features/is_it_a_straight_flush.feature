Feature: Is it a straight flush?
	Regardless of order
	
Scenario: A straight flush in order
	Given I have a straight flush in order
	When I check for a straight flush
	Then it should be a straight flush
	
Scenario: A straight flush out of order 1
	Given I have a straight flush out of order (one)
	When I check for a straight flush
	Then it should be a straight flush
	
Scenario: A straight flush out of order 2
	Given I have a straight flush out of order (two)
	When I check for a straight flush
	Then it should be a straight flush
	
Scenario: A straight flush out of order 3
	Given I have a straight flush out of order (three)
	When I check for a straight flush
	Then it should be a straight flush
	
Scenario: A straight flush out of order 4
	Given I have a straight flush out of order (four)
	When I check for a straight flush
	Then it should be a straight flush
	
Scenario: A straight flush in reverse order
	Given I have a straight flush in reverse order
	When I check for a straight flush
	Then it should be a straight flush