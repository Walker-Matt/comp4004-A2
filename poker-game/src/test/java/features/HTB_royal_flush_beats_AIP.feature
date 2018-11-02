Feature: Does HTB with a royal flush beat AIP with any lower hand?
	
Scenario: HTB has a royal flush and AIP has a straight flush
	Given HTB has a royal flush and AIP has a straight flush
	When HTBs royal flush is compared to AIPs straight flush
	Then HTBs royal flush beats AIPs straight flush
	
Scenario: HTB has a royal flush and AIP has a four of a kind
	Given HTB has a royal flush and AIP has a four of a kind
	When HTBs royal flush is compared to AIPs four of a kind
	Then HTBs royal flush beats AIPs four of a kind
	
Scenario: HTB has a royal flush and AIP has a full house
	Given HTB has a royal flush and AIP has a full house
	When HTBs royal flush is compared to AIPs full house
	Then HTBs royal flush beats AIPs full house
	
Scenario: HTB has a royal flush and AIP has a flush
	Given HTB has a royal flush and AIP has a flush
	When HTBs royal flush is compared to AIPs flush
	Then HTBs royal flush beats AIPs flush
	
Scenario: HTB has a royal flush and AIP has a straight
	Given HTB has a royal flush and AIP has a straight
	When HTBs royal flush is compared to AIPs straight
	Then HTBs royal flush beats AIPs straight
	
Scenario: HTB has a royal flush and AIP has a three of a kind
	Given HTB has a royal flush and AIP has a three of a kind
	When HTBs royal flush is compared to AIPs three of a kind
	Then HTBs royal flush beats AIPs three of a kind
	
Scenario: HTB has a royal flush and AIP has a two pair
	Given HTB has a royal flush and AIP has a two pair
	When HTBs royal flush is compared to AIPs two pair
	Then HTBs royal flush beats AIPs two pair
	
Scenario: HTB has a royal flush and AIP has a pair
	Given HTB has a royal flush and AIP has a pair
	When HTBs royal flush is compared to AIPs pair
	Then HTBs royal flush beats AIPs pair
	
Scenario: HTB has a royal flush and AIP has a high card
	Given HTB has a royal flush and AIP has a high card
	When HTBs royal flush is compared to AIPs high card
	Then HTBs royal flush beats AIPs high card