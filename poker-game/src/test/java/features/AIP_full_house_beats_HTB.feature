Feature: Does AIP with a full house beat HTB with any other hand?
	
Scenario: AIP has a full house and HTB has a flush
	Given AIP has a full house and HTB has a flush
	When AIPs full house is compared to HTBs flush
	Then AIPs full house beats HTBs flush
	
Scenario: AIP has a full house and HTB has a straight
	Given AIP has a full house and HTB has a straight
	When AIPs full house is compared to HTBs straight
	Then AIPs full house beats HTBs straight
	
Scenario: AIP has a full house and HTB has a three of a kind
	Given AIP has a full house and HTB has a three of a kind
	When AIPs full house is compared to HTBs three of a kind
	Then AIPs full house beats HTBs three of a kind
	
Scenario: AIP has a full house and HTB has a two pair
	Given AIP has a full house and HTB has a two pair
	When AIPs full house is compared to HTBs two pair
	Then AIPs full house beats HTBs two pair
	
Scenario: AIP has a full house and HTB has a pair
	Given AIP has a full house and HTB has a pair
	When AIPs full house is compared to HTBs pair
	Then AIPs full house beats HTBs pair
	
Scenario: AIP has a full house and HTB has a high card
	Given AIP has a full house and HTB has a high card
	When AIPs full house is compared to HTBs high card
	Then AIPs full house beats HTBs high card