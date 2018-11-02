Feature: Does AIP with a four of a kind beat HTB with any lower hand?
	
Scenario: AIP has a four of a kind and HTB has a full house
	Given AIP has a four of a kind and HTB has a full house
	When AIPs four of a kind is compared to HTBs full house
	Then AIPs four of a kind beats HTBs full house
	
Scenario: AIP has a four of a kind and HTB has a flush
	Given AIP has a four of a kind and HTB has a flush
	When AIPs four of a kind is compared to HTBs flush
	Then AIPs four of a kind beats HTBs flush
	
Scenario: AIP has a four of a kind and HTB has a straight
	Given AIP has a four of a kind and HTB has a straight
	When AIPs four of a kind is compared to HTBs straight
	Then AIPs four of a kind beats HTBs straight
	
Scenario: AIP has a four of a kind and HTB has a three of a kind
	Given AIP has a four of a kind and HTB has a three of a kind
	When AIPs four of a kind is compared to HTBs three of a kind
	Then AIPs four of a kind beats HTBs three of a kind
	
Scenario: AIP has a four of a kind and HTB has a two pair
	Given AIP has a four of a kind and HTB has a two pair
	When AIPs four of a kind is compared to HTBs two pair
	Then AIPs four of a kind beats HTBs two pair
	
Scenario: AIP has a four of a kind and HTB has a pair
	Given AIP has a four of a kind and HTB has a pair
	When AIPs four of a kind is compared to HTBs pair
	Then AIPs four of a kind beats HTBs pair
	
Scenario: AIP has a four of a kind and HTB has a high card
	Given AIP has a four of a kind and HTB has a high card
	When AIPs four of a kind is compared to HTBs high card
	Then AIPs four of a kind beats HTBs high card