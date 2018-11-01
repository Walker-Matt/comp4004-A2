Feature: Does HTB with a straight flush beat AIP with any other hand?
	
Scenario: HTB has a straight flush and AIP has a four of a kind
	Given HTB has a straight flush and AIP has a four of a kind
	When HTBs straight flush is compared AIPs to four of a kind
	Then HTBs straight flush beats AIPs four of a kind
	
Scenario: HTB has a straight flush and AIP has a full house
	Given HTB has a straight flush and AIP has a full house
	When HTBs straight flush is compared to AIPs full house
	Then HTBs straight flush beats AIPs full house
	
Scenario: HTB has a straight flush and AIP has a flush
	Given HTB has a straight flush and AIP has a flush
	When HTBs straight flush is compared to AIPs flush
	Then HTBs straight flush beats AIPs flush
	
Scenario: HTB has a straight flush and AIP has a straight
	Given HTB has a straight flush and AIP has a straight
	When HTBs straight flush is compared to AIPs straight
	Then HTBs straight flush beats AIPs straight
	
Scenario: HTB has a straight flush and AIP has a three of a kind
	Given HTB has a straight flush and AIP has a three of a kind
	When HTBs straight flush is compared to AIPs three of a kind
	Then HTBs straight flush beats AIPs three of a kind
	
Scenario: HTB has a straight flush and AIP has a two pair
	Given HTB has a straight flush and AIP has a two pair
	When HTBs straight flush is compared to AIPs two pair
	Then HTBs straight flush beats AIPs two pair
	
Scenario: HTB has a straight flush and AIP has a pair
	Given HTB has a straight flush and AIP has a pair
	When HTBs straight flush is compared to AIPs pair
	Then HTBs straight flush beats AIPs pair
	
Scenario: HTB has a straight flush and AIP has a high card
	Given HTB has a straight flush and AIP has a high card
	When HTBs straight flush is compared to AIPs high card
	Then HTBs straight flush beats AIPs high card