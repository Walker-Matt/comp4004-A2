Feature: Does HTB with a three of a kind beat AIP with any lower hand?
	
Scenario: HTB has a three of a kind and AIP has a two pair
	Given HTB has a three of a kind and AIP has a two pair
	When HTBs three of a kind is compared to AIPs two pair
	Then HTBs three of a kind beats AIPs two pair
	
Scenario: HTB has a three of a kind and AIP has a pair
	Given HTB has a three of a kind and AIP has a pair
	When HTBs three of a kind is compared to AIPs pair
	Then HTBs three of a kind beats AIPs pair
	
Scenario: HTB has a three of a kind and AIP has a high card
	Given HTB has a three of a kind and AIP has a high card
	When HTBs three of a kind is compared to AIPs high card
	Then HTBs three of a kind beats AIPs high card