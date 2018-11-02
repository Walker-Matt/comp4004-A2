Feature: Does AIP with a straight flush beat HTB with any lower hand?
	
Scenario: AIP has a straight flush and HTB has a four of a kind
	Given AIP has a straight flush and HTB has a four of a kind
	When AIPs straight flush is compared HTBs to four of a kind
	Then AIPs straight flush beats HTBs four of a kind
	
Scenario: AIP has a straight flush and HTB has a full house
	Given AIP has a straight flush and HTB has a full house
	When AIPs straight flush is compared to HTBs full house
	Then AIPs straight flush beats HTBs full house
	
Scenario: AIP has a straight flush and HTB has a flush
	Given AIP has a straight flush and HTB has a flush
	When AIPs straight flush is compared to HTBs flush
	Then AIPs straight flush beats HTBs flush
	
Scenario: AIP has a straight flush and HTB has a straight
	Given AIP has a straight flush and HTB has a straight
	When AIPs straight flush is compared to HTBs straight
	Then AIPs straight flush beats HTBs straight
	
Scenario: AIP has a straight flush and HTB has a three of a kind
	Given AIP has a straight flush and HTB has a three of a kind
	When AIPs straight flush is compared to HTBs three of a kind
	Then AIPs straight flush beats HTBs three of a kind
	
Scenario: AIP has a straight flush and HTB has a two pair
	Given AIP has a straight flush and HTB has a two pair
	When AIPs straight flush is compared to HTBs two pair
	Then AIPs straight flush beats HTBs two pair
	
Scenario: AIP has a straight flush and HTB has a pair
	Given AIP has a straight flush and HTB has a pair
	When AIPs straight flush is compared to HTBs pair
	Then AIPs straight flush beats HTBs pair
	
Scenario: AIP has a straight flush and HTB has a high card
	Given AIP has a straight flush and HTB has a high card
	When AIPs straight flush is compared to HTBs high card
	Then AIPs straight flush beats HTBs high card