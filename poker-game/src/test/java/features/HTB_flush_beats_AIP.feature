Feature: Does HTB with a flush beat AIP with any other hand?
	
Scenario: HTB has a flush and AIP has a straight
	Given HTB has a flush and AIP has a straight
	When HTBs flush is compared to AIPs straight
	Then HTBs flush beats AIPs straight
	
Scenario: HTB has a flush and AIP has a three of a kind
	Given HTB has a flush and AIP has a three of a kind
	When HTBs flush is compared to AIPs three of a kind
	Then HTBs flush beats AIPs three of a kind
	
Scenario: HTB has a flush and AIP has a two pair
	Given HTB has a flush and AIP has a two pair
	When HTBs flush is compared to AIPs two pair
	Then HTBs flush beats AIPs two pair
	
Scenario: HTB has a flush and AIP has a pair
	Given HTB has a flush and AIP has a pair
	When HTBs flush is compared to AIPs pair
	Then HTBs flush beats AIPs pair
	
Scenario: HTB has a flush and AIP has a high card
	Given HTB has a flush and AIP has a high card
	When HTBs flush is compared to AIPs high card
	Then HTBs flush beats AIPs high card