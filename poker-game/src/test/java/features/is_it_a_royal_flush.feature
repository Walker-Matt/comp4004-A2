Feature: Is it a royal flush?
	Regardless of order
	
Scenario: A royal flush in order
	Given I have a royal flush in order
	When I check for a royal flush
	Then it should be a royal flush
	
Scenario: A royal flush out of order 1
	Given I have a royal flush out of order (one)
	When I check for a royal flush
	Then it should be a royal flush

Scenario: A royal flush out of order 2
	Given I have a royal flush out of order (two)
	When I check for a royal flush
	Then it should be a royal flush

Scenario: A royal flush out of order 3
	Given I have a royal flush out of order (three)
	When I check for a royal flush
	Then it should be a royal flush

Scenario: A royal flush out of order 4
	Given I have a royal flush out of order (four)
	When I check for a royal flush
	Then it should be a royal flush
	
Scenario: A royal flush in reverse order
	Given I have a royal flush in reverse order
	When I check for a royal flush
	Then it should be a royal flush