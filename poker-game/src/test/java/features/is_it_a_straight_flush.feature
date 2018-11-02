Feature: Is it a straight flush?
	Regardless of order
	
Scenario: A straight flush in any order
	Given I have a straight flush in any order
	When I check for a straight flush
	Then it should be a straight flush
	