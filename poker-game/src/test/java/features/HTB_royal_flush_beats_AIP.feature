Feature: Does HTB with a royal flush beat AIP with any other hand?
	
Scenario: AIP has a straight flush
	Given HTB has a royal flush
	And AIP has a straight flush
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a four of a kind
	Given HTB has a royal flush
	And AIP has a four of a kind
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a full house
	Given HTB has a royal flush
	And AIP has a full house
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a flush
	Given HTB has a royal flush
	And AIP has a flush
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a straight
	Given HTB has a royal flush
	And AIP has a straight
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a three of a kind
	Given HTB has a royal flush
	And AIP has a three of a kind
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a two pair
	Given HTB has a royal flush
	And AIP has a two pair
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a pair
	Given HTB has a royal flush
	And AIP has a pair
	When the two hands are compared
	Then HTB beats AIP
	
Scenario: AIP has a high card
	Given HTB has a royal flush
	And AIP has a high card
	When the two hands are compared
	Then HTB beats AIP