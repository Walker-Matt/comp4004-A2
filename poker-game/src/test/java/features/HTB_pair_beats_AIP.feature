Feature: Does HTB with a pair beat AIP with any other hand?
	
Scenario: HTB has a pair and AIP has a high card
	Given HTB has a pair and AIP has a high card
	When HTBs pair is compared to AIPs high card
	Then HTBs pair beats AIPs high card