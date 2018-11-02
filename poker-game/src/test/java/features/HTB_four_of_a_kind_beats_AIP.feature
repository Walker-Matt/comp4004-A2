Feature: Does HTB with a four of a kind beat AIP with any lower hand?
	
Scenario: HTB has a four of a kind and AIP has a full house
	Given HTB has a four of a kind and AIP has a full house
	When HTBs four of a kind is compared to AIPs full house
	Then HTBs four of a kind beats AIPs full house
	
Scenario: HTB has a four of a kind and AIP has a flush
	Given HTB has a four of a kind and AIP has a flush
	When HTBs four of a kind is compared to AIPs flush
	Then HTBs four of a kind beats AIPs flush
	
Scenario: HTB has a four of a kind and AIP has a straight
	Given HTB has a four of a kind and AIP has a straight
	When HTBs four of a kind is compared to AIPs straight
	Then HTBs four of a kind beats AIPs straight
	
Scenario: HTB has a four of a kind and AIP has a three of a kind
	Given HTB has a four of a kind and AIP has a three of a kind
	When HTBs four of a kind is compared to AIPs three of a kind
	Then HTBs four of a kind beats AIPs three of a kind
	
Scenario: HTB has a four of a kind and AIP has a two pair
	Given HTB has a four of a kind and AIP has a two pair
	When HTBs four of a kind is compared to AIPs two pair
	Then HTBs four of a kind beats AIPs two pair
	
Scenario: HTB has a four of a kind and AIP has a pair
	Given HTB has a four of a kind and AIP has a pair
	When HTBs four of a kind is compared to AIPs pair
	Then HTBs four of a kind beats AIPs pair
	
Scenario: HTB has a four of a kind and AIP has a high card
	Given HTB has a four of a kind and AIP has a high card
	When HTBs four of a kind is compared to AIPs high card
	Then HTBs four of a kind beats AIPs high card