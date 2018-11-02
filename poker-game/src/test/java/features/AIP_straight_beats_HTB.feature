Feature: Does AIP with a straight beat HTB with any lower hand?
	
Scenario: AIP has a straight and HTB has a three of a kind
	Given AIP has a straight and HTB has a three of a kind
	When AIPs straight is compared to HTBs three of a kind
	Then AIPs straight beats HTBs three of a kind
	
Scenario: AIP has a straight and HTB has a two pair
	Given AIP has a straight and HTB has a two pair
	When AIPs straight is compared to HTBs two pair
	Then AIPs straight beats HTBs two pair
	
Scenario: AIP has a straight and HTB has a pair
	Given AIP has a straight and HTB has a pair
	When AIPs straight is compared to HTBs pair
	Then AIPs straight beats HTBs pair
	
Scenario: AIP has a straight and HTB has a high card
	Given AIP has a straight and HTB has a high card
	When AIPs straight is compared to HTBs high card
	Then AIPs straight beats HTBs high card