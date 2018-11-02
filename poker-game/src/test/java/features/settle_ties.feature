Feature: Are all instances of ties settled properly?

Scenario: Two royal flushes
	Given AIP has a royal flush of spades
	And HTB has a royal flush of clubs
	When the two hands are compared
	Then AIP wins

Scenario: Two straight flushes, different highest cards
	Given AIP has a straight flush, high card king of spades
	And HTB has a straight flush, high card nine of spades
	When the two hands are compared
	Then AIP wins

Scenario: Two straight flushes, same highest cards
	Given AIP has a straight flush, high card king of spades
	And HTB has a straight flush, high card king of clubs
	When the two hands are compared
	Then AIP wins

Scenario: Two four of a kinds
	Given AIP has a four of a kind
	And HTB has a four of a kind
	When the two hands are compared
	Then AIP wins

Scenario: Two full houses
	Given AIP has a full house
	And HTB has a full house
	When the two hands are compared
	Then AIP wins

Scenario: Two three of a kinds
	Given AIP has a three of a kind
	And HTB has a three of a kind
	When the two hands are compared
	Then AIP wins

Scenario: Two straights, different highest cards
	Given AIP has a straight, high card king of spades
	And HTB has a straight, high card nine of spades
	When the two hands are compared
	Then AIP wins

Scenario: Two straights, same highest cards
	Given AIP has a straight, high card king of spades
	And HTB has a straight, high card king of clubs
	When the two hands are compared
	Then AIP wins

Scenario: Two two pairs, different highest pair
	Given AIP has two pairs, high pair aces of spades and diamonds
	And HTB has two pairs, high pair fours of spades and diamonds
	When the two hands are compared
	Then AIP wins

Scenario: Two two pairs, same highest pair
	Given AIP has two pairs, high pair aces of spades and diamonds
	And HTB has two pairs, high pair aces of hearts and clubs
	When the two hands are compared
	Then AIP wins

Scenario: Two pairs, different pairs
	Given AIP has a pair of aces, spades and diamonds
	And HTB has a pair of fours, spades and diamonds
	When the two hands are compared
	Then AIP wins

Scenario: Two pairs, same pairs
	Given AIP has a pair of aces, spades and diamonds
	And HTB has a pair of aces, hearts and clubs
	When the two hands are compared
	Then AIP wins

Scenario: Two high card hands, different highest cards
	Given AIP has an ace of spades high card
	And HTB has a nine of spades high card
	When the two hands are compared
	Then AIP wins

Scenario: Two high card hands, same highest cards
	Given AIP has an ace of spades high card
	And HTB has an ace of clubs high card
	When the two hands are compared
	Then AIP wins

Scenario: Two flushes, same rank for five cards
	Given AIP has a flush
	And HTB has a flush with five cards the same
	When the two hands are compared
	Then AIP wins

Scenario: Two flushes, same rank for four cards
	Given AIP has a flush
	And HTB has a flush with four cards the same
	When the two hands are compared
	Then AIP wins

Scenario: Two flushes, same rank for three cards
	Given AIP has a flush
	And HTB has a flush with three cards the same
	When the two hands are compared
	Then AIP wins

Scenario: Two flushes, same rank for two cards
	Given AIP has a flush
	And HTB has a flush with two cards the same
	When the two hands are compared
	Then AIP wins

Scenario: Two flushes, same rank for one card
	Given AIP has a flush
	And HTB has a flush with one card the same
	When the two hands are compared
	Then AIP wins
