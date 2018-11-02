package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class AIPExchanges {
	private Player HTB;
	private AIPlayer AIP;
	private int exchanged;
	
	@Given("^AIP is one card away from a royal flush$")
	public void one_away_royal_flush() {
		ArrayList<Card> oneAwayRoyalFlush = new ArrayList<Card>();
		oneAwayRoyalFlush.add(new Card("S10"));
		oneAwayRoyalFlush.add(new Card("C3"));
		oneAwayRoyalFlush.add(new Card("SQ"));
		oneAwayRoyalFlush.add(new Card("SK"));
		oneAwayRoyalFlush.add(new Card("SA"));
		this.AIP = new AIPlayer(oneAwayRoyalFlush);
	}
	
	@Given("^AIP is one card away from a straight flush$")
	public void one_away_straight_flush() {
		ArrayList<Card> oneAwayStraightFlush = new ArrayList<Card>();
		oneAwayStraightFlush.add(new Card("S9"));
		oneAwayStraightFlush.add(new Card("C3"));
		oneAwayStraightFlush.add(new Card("SJ"));
		oneAwayStraightFlush.add(new Card("SQ"));
		oneAwayStraightFlush.add(new Card("SK"));
		this.AIP = new AIPlayer(oneAwayStraightFlush);
	}
	
	@Given("^AIP has three cards of the same rank$")
	public void three_same_rank() {
		ArrayList<Card> threeSameRank = new ArrayList<Card>();
		threeSameRank.add(new Card("S4"));
		threeSameRank.add(new Card("D4"));
		threeSameRank.add(new Card("H4"));
		threeSameRank.add(new Card("C5"));
		threeSameRank.add(new Card("S6"));
		this.AIP = new AIPlayer(threeSameRank);
	}
	
	@Given("^AIP is one card away from a flush$")
	public void one_away_flush() {
		ArrayList<Card> oneAwayFlush = new ArrayList<Card>();
		oneAwayFlush.add(new Card("S4"));
		oneAwayFlush.add(new Card("D5"));
		oneAwayFlush.add(new Card("S6"));
		oneAwayFlush.add(new Card("S7"));
		oneAwayFlush.add(new Card("S9"));
		this.AIP = new AIPlayer(oneAwayFlush);
	}
	
	@Given("^AIP is one card away from a straight$")
	public void one_away_straight() {
		ArrayList<Card> oneAwayStraight = new ArrayList<Card>();
		oneAwayStraight.add(new Card("S4"));
		oneAwayStraight.add(new Card("D2"));
		oneAwayStraight.add(new Card("H6"));
		oneAwayStraight.add(new Card("C7"));
		oneAwayStraight.add(new Card("S8"));
		this.AIP = new AIPlayer(oneAwayStraight);
	}
	
	@Given("^AIP has three cards of the same suit$")
	public void three_same_suit() {
		ArrayList<Card> threeSameSuit = new ArrayList<Card>();
		threeSameSuit.add(new Card("S4"));
		threeSameSuit.add(new Card("D2"));
		threeSameSuit.add(new Card("S6"));
		threeSameSuit.add(new Card("C10"));
		threeSameSuit.add(new Card("S8"));
		this.AIP = new AIPlayer(threeSameSuit);
	}
	
	@Given("^AIP has three cards in sequence$")
	public void three_in_sequence() {
		ArrayList<Card> threeInSequence = new ArrayList<Card>();
		threeInSequence.add(new Card("S2"));
		threeInSequence.add(new Card("D4"));
		threeInSequence.add(new Card("H5"));
		threeInSequence.add(new Card("C6"));
		threeInSequence.add(new Card("S8"));
		this.AIP = new AIPlayer(threeInSequence);
	}
	
	@Given("^AIP has a pair$")
	public void pair() {
		ArrayList<Card> pair = new ArrayList<Card>();
		pair.add(new Card("S4"));
		pair.add(new Card("D4"));
		pair.add(new Card("H6"));
		pair.add(new Card("C10"));
		pair.add(new Card("S8"));
		this.AIP = new AIPlayer(pair);
	}
	
	@Given("^AIP has nothing$")
	public void nothing() {
		ArrayList<Card> nothing = new ArrayList<Card>();
		nothing.add(new Card("S2"));
		nothing.add(new Card("D4"));
		nothing.add(new Card("H6"));
		nothing.add(new Card("C10"));
		nothing.add(new Card("S8"));
		this.AIP = new AIPlayer(nothing);
	}
	
	@And("^HTB has a flush$")
	public void flush() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("S4"));
		flush.add(new Card("S5"));
		flush.add(new Card("S6"));
		flush.add(new Card("S7"));
		flush.add(new Card("S9"));
		this.HTB = new Player(flush);
	}
	
	@And("^HTB has a straight$")
	public void straight() {
		ArrayList<Card> straight = new ArrayList<Card>();
		straight.add(new Card("S4"));
		straight.add(new Card("D5"));
		straight.add(new Card("H6"));
		straight.add(new Card("C7"));
		straight.add(new Card("S8"));
		this.HTB = new Player(straight);
	}
	
	@And("^HTB has a two pair$")
	public void three_of_a_kind() {
		ArrayList<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card("S4"));
		twoPair.add(new Card("D4"));
		twoPair.add(new Card("H5"));
		twoPair.add(new Card("C5"));
		twoPair.add(new Card("S8"));
		this.HTB = new Player(twoPair);
	}
	
	@When("^AIP exchanges for a royal flush$")
	public void exchange_for_royal_flush() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("SJ"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges for a straight flush$")
	public void exchange_for_straight_flush() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("S10"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges for a full house$")
	public void exchange_for_full_house() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("D6"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges for a flush$")
	public void exchange_for_flush() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("S5"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges for a straight$")
	public void exchange_for_straight() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("D5"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges for nothing$")
	public void exchange_for_nothing() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("C2"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges two$")
	public void exchange_two() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("C2"));
		drawnCards.add(new Card("C3"));
		AIP.addCards(drawnCards);
	}
	
	@When("^AIP exchanges three$")
	public void exchange_three() {
		this.exchanged = AIP.exchange();
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		drawnCards.add(new Card("C2"));
		drawnCards.add(new Card("H4"));
		drawnCards.add(new Card("D6"));
		AIP.addCards(drawnCards);
	}
	
	@Then("^AIP wins with a royal flush$")
	public void win_royal_flush() {
		assertEquals("ROYAL_FLUSH", AIP.getHighestHand().toString());
		assertTrue(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP loses without a royal flush$")
	public void lose_royal_flush() {
		assertNotEquals("ROYAL_FLUSH", AIP.getHighestHand().toString());
		assertFalse(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP wins with a straight flush$")
	public void win_straight_flush() {
		assertEquals("STRAIGHT_FLUSH", AIP.getHighestHand().toString());
		assertTrue(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP loses without a straight flush$")
	public void lose_straight_flush() {
		assertNotEquals("STRAIGHT_FLUSH", AIP.getHighestHand().toString());
		assertFalse(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP wins with a full house$")
	public void win_full_house() {
		assertEquals("FULL_HOUSE", AIP.getHighestHand().toString());
		assertTrue(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP loses with a three of a kind$")
	public void lose_three_of_a_kind() {
		assertEquals("THREE_OF_A_KIND", AIP.getHighestHand().toString());
		assertFalse(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP wins with a flush$")
	public void win_flush() {
		assertEquals("FLUSH", AIP.getHighestHand().toString());
		assertTrue(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP loses without a flush$")
	public void lose_flush() {
		assertNotEquals("FLUSH", AIP.getHighestHand().toString());
		assertFalse(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP wins with a straight$")
	public void win_straight() {
		assertEquals("STRAIGHT", AIP.getHighestHand().toString());
		assertTrue(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP loses without a straight$")
	public void lose_straight() {
		assertNotEquals("STRAIGHT", AIP.getHighestHand().toString());
		assertFalse(AIP.getHighestHand().getWeight() 
					> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIP has two new cards$")
	public void two_new_cards() {
		assertEquals(2, this.exchanged);
	}
	
	@Then("^AIP has three new cards$")
	public void three_new_cards() {
		assertEquals(3, this.exchanged);
	}
}
