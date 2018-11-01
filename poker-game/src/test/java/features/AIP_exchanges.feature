Feature: AIP exchanges cards from its hand according to its strategy

Scenario: AIP is one card away from a royal flush, exchanges, and wins
	Given AIP is one card away from a royal flush
	And HTB has a flush
	When AIP exchanges for a royal flush
	Then AIP wins with a royal flush
	
Scenario: AIP is one card away from a royal flush, exchanges, and loses
	Given AIP is one card away from a royal flush
	And HTB has a flush
	When AIP exchanges for nothing
	Then AIP loses without a royal flush
	
Scenario: AIP is one card away from a straight flush, exchanges, and wins
	Given AIP is one card away from a straight flush
	And HTB has a flush
	When AIP exchanges for a straight flush
	Then AIP wins with a straight flush
	
Scenario: AIP is one card away from a straight flush, exchanges, and loses
	Given AIP is one card away from a straight flush
	And HTB has a flush
	When AIP exchanges for nothing
	Then AIP loses without a straight flush
	
Scenario: AIP has three cards of the same rank, exchanges, and wins
	Given AIP has three cards of the same rank
	And HTB has a flush
	When AIP exchanges for a full house
	Then AIP wins with a full house
	
Scenario: AIP has three cards of the same rank, exchanges, and loses
	Given AIP has three cards of the same rank
	And HTB has a flush
	When AIP exchanges for nothing
	Then AIP loses with a three of a kind
	
Scenario: AIP is one card away from a flush, exchanges, and wins
	Given AIP is one card away from a flush
	And HTB has a straight
	When AIP exchanges for a flush
	Then AIP wins with a flush
	
Scenario: AIP is one card away from a flush, exchanges, and loses
	Given AIP is one card away from a flush
	And HTB has a straight
	When AIP exchanges for nothing
	Then AIP loses without a flush
	
Scenario: AIP is one card away from a straight, exchanges, and wins
	Given AIP is one card away from a straight
	And HTB has a three of a kind
	When AIP exchanges for a straight
	Then AIP wins with a straight
	
Scenario: AIP is one card away from a straight, exchanges, and loses
	Given AIP is one card away from a straight
	And HTB has a three of a kind
	When AIP exchanges for nothing
	Then AIP loses without a straight
	
Scenario: AIP has three cards of the same suit and exchanges
	Given AIP has three cards of the same suit
	When AIP exchanges two
	Then AIP has two new cards
	
Scenario: AIP has three cards in sequence and exchanges
	Given AIP has three cards in sequence
	When AIP exchanges two
	Then AIP has two new cards
	
Scenario: AIP has a pair and exchanges
	Given AIP has a pair
	When AIP exchanges three
	Then AIP has three new cards
	
Scenario: AIP has nothing and exchanges
	Given AIP has nothing
	When AIP exchanges three
	Then AIP has three new cards