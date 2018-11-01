Feature: Does HTB with a two pair beat AIP with any other hand?
	
Scenario: HTB has a two pair and AIP has a pair
	Given HTB has a two pair and AIP has a pair
	When HTBs two pair is compared to AIPs pair
	Then HTBs two pair beats AIPs pair
	
Scenario: HTB has a two pair and AIP has a high card
	Given HTB has a two pair and AIP has a high card
	When HTBs two pair is compared to AIPs high card
	Then HTBs two pair beats AIPs high card