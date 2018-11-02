Feature: Does AIP with a flush beat HTB with any lower hand?
	
Scenario: AIP has a flush and HTB has a straight
	Given AIP has a flush and HTB has a straight
	When AIPs flush is compared to HTBs straight
	Then AIPs flush beats HTBs straight
	
Scenario: AIP has a flush and HTB has a three of a kind
	Given AIP has a flush and HTB has a three of a kind
	When AIPs flush is compared to HTBs three of a kind
	Then AIPs flush beats HTBs three of a kind
	
Scenario: AIP has a flush and HTB has a two pair
	Given AIP has a flush and HTB has a two pair
	When AIPs flush is compared to HTBs two pair
	Then AIPs flush beats HTBs two pair
	
Scenario: AIP has a flush and HTB has a pair
	Given AIP has a flush and HTB has a pair
	When AIPs flush is compared to HTBs pair
	Then AIPs flush beats HTBs pair
	
Scenario: AIP has a flush and HTB has a high card
	Given AIP has a flush and HTB has a high card
	When AIPs flush is compared to HTBs high card
	Then AIPs flush beats HTBs high card