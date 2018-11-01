Feature: Does HTB with a straight beat AIP with any other hand?
	
Scenario: HTB has a straight and AIP has a three of a kind
	Given HTB has a straight and AIP has a three of a kind
	When HTBs straight is compared to AIPs three of a kind
	Then HTBs straight beats AIPs three of a kind
	
Scenario: HTB has a straight and AIP has a two pair
	Given HTB has a straight and AIP has a two pair
	When HTBs straight is compared to AIPs two pair
	Then HTBs straight beats AIPs two pair
	
Scenario: HTB has a straight and AIP has a pair
	Given HTB has a straight and AIP has a pair
	When HTBs straight is compared to AIPs pair
	Then HTBs straight beats AIPs pair
	
Scenario: HTB has a straight and AIP has a high card
	Given HTB has a straight and AIP has a high card
	When HTBs straight is compared to AIPs high card
	Then HTBs straight beats AIPs high card