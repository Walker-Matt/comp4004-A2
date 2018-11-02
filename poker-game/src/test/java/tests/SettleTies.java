package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class SettleTies {
	private Player HTB;
	private AIPlayer AIP;
	private boolean AIPbeatsHTB;
	
	@Given("^AIP has a royal flush of spades$")
	public void AIP_royal_flush() {
		ArrayList<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("S10"));
		royalFlush.add(new Card("SJ"));
		royalFlush.add(new Card("SQ"));
		royalFlush.add(new Card("SK"));
		royalFlush.add(new Card("SA"));
		AIP = new AIPlayer(royalFlush);
	}
	
	@Given("^AIP has a straight flush, high card king of spades$")
	public void AIP_straight_flush() {
		ArrayList<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("S9"));
		straightFlush.add(new Card("S10"));
		straightFlush.add(new Card("SJ"));
		straightFlush.add(new Card("SQ"));
		straightFlush.add(new Card("SK"));
		AIP = new AIPlayer(straightFlush);
	}
	
	@Given("^AIP has a four of a kind$")
	public void AIP_four_of_a_kind() {
		ArrayList<Card> fourOfAKind = new ArrayList<Card>();
		fourOfAKind.add(new Card("SA"));
		fourOfAKind.add(new Card("DA"));
		fourOfAKind.add(new Card("HA"));
		fourOfAKind.add(new Card("CA"));
		fourOfAKind.add(new Card("S5"));
		AIP = new AIPlayer(fourOfAKind);
	}
	
	@Given("^AIP has a full house$")
	public void AIP_full_house() {
		ArrayList<Card> fullHouse = new ArrayList<Card>();
		fullHouse.add(new Card("D5"));
		fullHouse.add(new Card("DA"));
		fullHouse.add(new Card("HA"));
		fullHouse.add(new Card("CA"));
		fullHouse.add(new Card("S5"));
		AIP = new AIPlayer(fullHouse);
	}
	
	@Given("^AIP has a three of a kind$")
	public void AIP_three_of_a_kind() {
		ArrayList<Card> threeOfAKind = new ArrayList<Card>();
		threeOfAKind.add(new Card("SA"));
		threeOfAKind.add(new Card("DA"));
		threeOfAKind.add(new Card("HA"));
		threeOfAKind.add(new Card("C7"));
		threeOfAKind.add(new Card("S8"));
		AIP = new AIPlayer(threeOfAKind);
	}
	
	@Given("^AIP has a straight, high card king of spades$")
	public void AIP_straight() {
		ArrayList<Card> straight = new ArrayList<Card>();
		straight.add(new Card("S9"));
		straight.add(new Card("D10"));
		straight.add(new Card("HJ"));
		straight.add(new Card("CQ"));
		straight.add(new Card("SK"));
		AIP = new AIPlayer(straight);
	}
	
	@Given("^AIP has two pairs, high pair aces of spades and diamonds$")
	public void AIP_two_pair() {
		ArrayList<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card("SA"));
		twoPair.add(new Card("DA"));
		twoPair.add(new Card("H5"));
		twoPair.add(new Card("C5"));
		twoPair.add(new Card("S8"));
		AIP = new AIPlayer(twoPair);
	}
	
	@Given("^AIP has a pair of aces, spades and diamonds$")
	public void AIP_pair() {
		ArrayList<Card> pair = new ArrayList<Card>();
		pair.add(new Card("SA"));
		pair.add(new Card("DA"));
		pair.add(new Card("H6"));
		pair.add(new Card("C7"));
		pair.add(new Card("S8"));
		AIP = new AIPlayer(pair);
	}
	
	@Given("^AIP has an ace of spades high card$")
	public void AIP_high_card() {
		ArrayList<Card> highCard = new ArrayList<Card>();
		highCard.add(new Card("S4"));
		highCard.add(new Card("D5"));
		highCard.add(new Card("H6"));
		highCard.add(new Card("C7"));
		highCard.add(new Card("SA"));
		AIP = new AIPlayer(highCard);
	}
	
	@Given("^AIP has a flush$")
	public void AIP_flush() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("S9"));
		flush.add(new Card("S10"));
		flush.add(new Card("SJ"));
		flush.add(new Card("SQ"));
		flush.add(new Card("SA"));
		AIP = new AIPlayer(flush);
	}
	
	@And("^HTB has a royal flush of clubs$")
	public void HTB_royal_flush() {
		ArrayList<Card> royalFlush = new ArrayList<Card>();
		royalFlush.add(new Card("C10"));
		royalFlush.add(new Card("CJ"));
		royalFlush.add(new Card("CQ"));
		royalFlush.add(new Card("CK"));
		royalFlush.add(new Card("CA"));
		HTB = new Player(royalFlush);
	}
	
	@And("^HTB has a straight flush, high card nine of spades$")
	public void HTB_straight_flush_nine() {
		ArrayList<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("S5"));
		straightFlush.add(new Card("S6"));
		straightFlush.add(new Card("S7"));
		straightFlush.add(new Card("S8"));
		straightFlush.add(new Card("S9"));
		HTB = new Player(straightFlush);
	}
	
	@And("^HTB has a straight flush, high card king of clubs$")
	public void HTB_straight_flush_king() {
		ArrayList<Card> straightFlush = new ArrayList<Card>();
		straightFlush.add(new Card("C9"));
		straightFlush.add(new Card("C10"));
		straightFlush.add(new Card("CJ"));
		straightFlush.add(new Card("CQ"));
		straightFlush.add(new Card("CK"));
		HTB = new Player(straightFlush);
	}
	
	@And("^HTB has a four of a kind$")
	public void HTB_four_of_a_kind() {
		ArrayList<Card> fourOfAKind = new ArrayList<Card>();
		fourOfAKind.add(new Card("S4"));
		fourOfAKind.add(new Card("D4"));
		fourOfAKind.add(new Card("H4"));
		fourOfAKind.add(new Card("C4"));
		fourOfAKind.add(new Card("S5"));
		HTB = new Player(fourOfAKind);
	}
	
	@And("^HTB has a full house$")
	public void HTB_full_house() {
		ArrayList<Card> fullHouse = new ArrayList<Card>();
		fullHouse.add(new Card("D5"));
		fullHouse.add(new Card("D4"));
		fullHouse.add(new Card("H4"));
		fullHouse.add(new Card("C4"));
		fullHouse.add(new Card("S5"));
		HTB = new Player(fullHouse);
	}
	
	@And("^HTB has a three of a kind$")
	public void HTB_three_of_a_kind() {
		ArrayList<Card> threeOfAKind = new ArrayList<Card>();
		threeOfAKind.add(new Card("S4"));
		threeOfAKind.add(new Card("D4"));
		threeOfAKind.add(new Card("H4"));
		threeOfAKind.add(new Card("C7"));
		threeOfAKind.add(new Card("S8"));
		HTB = new Player(threeOfAKind);
	}
	
	@And("^HTB has a straight, high card nine of spades$")
	public void HTB_straight_nine() {
		ArrayList<Card> straight = new ArrayList<Card>();
		straight.add(new Card("S5"));
		straight.add(new Card("D6"));
		straight.add(new Card("H7"));
		straight.add(new Card("C8"));
		straight.add(new Card("S9"));
		HTB = new Player(straight);
	}
	
	@And("^HTB has a straight, high card king of clubs$")
	public void HTB_straight_king() {
		ArrayList<Card> straight = new ArrayList<Card>();
		straight.add(new Card("S9"));
		straight.add(new Card("D10"));
		straight.add(new Card("HJ"));
		straight.add(new Card("CQ"));
		straight.add(new Card("CK"));
		HTB = new Player(straight);
	}
	
	@And("^HTB has two pairs, high pair fours of spades and diamonds$")
	public void HTB_two_pair_fours() {
		ArrayList<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card("S4"));
		twoPair.add(new Card("D4"));
		twoPair.add(new Card("H3"));
		twoPair.add(new Card("C3"));
		twoPair.add(new Card("S8"));
		HTB = new Player(twoPair);
	}
	
	@And("^HTB has two pairs, high pair aces of hearts and clubs$")
	public void HTB_two_pair_aces() {
		ArrayList<Card> twoPair = new ArrayList<Card>();
		twoPair.add(new Card("HA"));
		twoPair.add(new Card("CA"));
		twoPair.add(new Card("H3"));
		twoPair.add(new Card("C3"));
		twoPair.add(new Card("S8"));
		HTB = new Player(twoPair);
	}
	
	@And("^HTB has a pair of fours, spades and diamonds$")
	public void HTB_pair_fours() {
		ArrayList<Card> pair = new ArrayList<Card>();
		pair.add(new Card("S4"));
		pair.add(new Card("D4"));
		pair.add(new Card("H6"));
		pair.add(new Card("C7"));
		pair.add(new Card("S8"));
		HTB = new Player(pair);
	}
	
	@And("^HTB has a pair of aces, hearts and clubs$")
	public void HTB_pair_aces() {
		ArrayList<Card> pair = new ArrayList<Card>();
		pair.add(new Card("HA"));
		pair.add(new Card("CA"));
		pair.add(new Card("H6"));
		pair.add(new Card("C7"));
		pair.add(new Card("S8"));
		HTB = new Player(pair);
	}
	
	@And("^HTB has a nine of spades high card$")
	public void HTB_high_card_four() {
		ArrayList<Card> highCard = new ArrayList<Card>();
		highCard.add(new Card("S4"));
		highCard.add(new Card("D5"));
		highCard.add(new Card("H6"));
		highCard.add(new Card("C7"));
		highCard.add(new Card("S9"));
		HTB = new Player(highCard);
	}
	
	@And("^HTB has an ace of clubs high card$")
	public void HTB_high_card_ace() {
		ArrayList<Card> highCard = new ArrayList<Card>();
		highCard.add(new Card("S4"));
		highCard.add(new Card("D5"));
		highCard.add(new Card("H6"));
		highCard.add(new Card("C7"));
		highCard.add(new Card("CA"));
		HTB = new Player(highCard);
	}
	
	@And("^HTB has a flush with five cards the same$")
	public void HTB_flush_five() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("C9"));
		flush.add(new Card("C10"));
		flush.add(new Card("CJ"));
		flush.add(new Card("CQ"));
		flush.add(new Card("CA"));
		HTB = new Player(flush);
	}
	
	@And("^HTB has a flush with four cards the same$")
	public void HTB_flush_four() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("C9"));
		flush.add(new Card("C10"));
		flush.add(new Card("CJ"));
		flush.add(new Card("CQ"));
		flush.add(new Card("C2"));
		HTB = new Player(flush);
	}
	
	@And("^HTB has a flush with three cards the same$")
	public void HTB_flush_three() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("C9"));
		flush.add(new Card("C10"));
		flush.add(new Card("CJ"));
		flush.add(new Card("C3"));
		flush.add(new Card("C2"));
		HTB = new Player(flush);
	}
	
	@And("^HTB has a flush with two cards the same$")
	public void HTB_flush_two() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("C9"));
		flush.add(new Card("C10"));
		flush.add(new Card("C4"));
		flush.add(new Card("C3"));
		flush.add(new Card("C2"));
		HTB = new Player(flush);
	}
	
	@And("^HTB has a flush with one card the same$")
	public void HTB_flush_one() {
		ArrayList<Card> flush = new ArrayList<Card>();
		flush.add(new Card("C9"));
		flush.add(new Card("C5"));
		flush.add(new Card("C4"));
		flush.add(new Card("C3"));
		flush.add(new Card("C2"));
		HTB = new Player(flush);
	}
	
	@When("^the two hands are compared$")
	public void compare() {
		if (AIP.getHighestHand().getWeight() > HTB.getHighestHand().getWeight()) {
			AIPbeatsHTB = true;
		}
		else if (AIP.getHighestHand().getWeight() == HTB.getHighestHand().getWeight()) {
			if (AIP.getHighestHand().toString() == "ROYAL_FLUSH") {
				if (AIP.getFlushSuit().getWeight() > HTB.getCards().get(0).getSuit().getWeight()) {
					AIPbeatsHTB = true;
				}
			}
		}
	}
	
	@Then("^AIP wins$")
	public void wins() {
		assertTrue(AIPbeatsHTB);
	}
}
