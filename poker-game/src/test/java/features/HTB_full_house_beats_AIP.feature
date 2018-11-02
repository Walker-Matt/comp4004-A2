Feature: Does HTB with a full house beat AIP with any lower hand?
	
Scenario: HTB has a full house and AIP has a flush
	Given HTB has a full house and AIP has a flush
	When HTBs full house is compared to AIPs flush
	Then HTBs full house beats AIPs flush
	
Scenario: HTB has a full house and AIP has a straight
	Given HTB has a full house and AIP has a straight
	When HTBs full house is compared to AIPs straight
	Then HTBs full house beats AIPs straight
	
Scenario: HTB has a full house and AIP has a three of a kind
	Given HTB has a full house and AIP has a three of a kind
	When HTBs full house is compared to AIPs three of a kind
	Then HTBs full house beats AIPs three of a kind
	
Scenario: HTB has a full house and AIP has a two pair
	Given HTB has a full house and AIP has a two pair
	When HTBs full house is compared to AIPs two pair
	Then HTBs full house beats AIPs two pair
	
Scenario: HTB has a full house and AIP has a pair
	Given HTB has a full house and AIP has a pair
	When HTBs full house is compared to AIPs pair
	Then HTBs full house beats AIPs pair
	
Scenario: HTB has a full house and AIP has a high card
	Given HTB has a full house and AIP has a high card
	When HTBs full house is compared to AIPs high card
	Then HTBs full house beats AIPs high card