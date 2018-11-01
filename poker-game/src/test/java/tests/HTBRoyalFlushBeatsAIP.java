package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class HTBRoyalFlushBeatsAIP {
	private Player HTB;
	private AIPlayer AIP;
	private ArrayList<Card> HTBhand;
	private ArrayList<Card> straightFlush;
	private ArrayList<Card> fourOfAKind;
	private ArrayList<Card> fullHouse;
	private ArrayList<Card> flush;
	private ArrayList<Card> straight;
	private ArrayList<Card> threeOfAKind;
	private ArrayList<Card> twoPair;
	private ArrayList<Card> pair;
	private ArrayList<Card> highCard;
	private boolean HTBbeatsAIP;
	
	@Given("^HTB has a royal flush$")
	public void HTB_has_a_royal_flush() {
		this.HTBhand = new ArrayList<Card>();
		this.HTBhand.add(new Card("S10"));
		this.HTBhand.add(new Card("SJ"));
		this.HTBhand.add(new Card("SQ"));
		this.HTBhand.add(new Card("SK"));
		this.HTBhand.add(new Card("SA"));
		this.HTB = new Player(this.HTBhand);
	}
	
	@And("^AIP has a straight flush$")
	public void AIP_has_a_straight_flush() {
		this.straightFlush = new ArrayList<Card>();
		this.straightFlush.add(new Card("S9"));
		this.straightFlush.add(new Card("S10"));
		this.straightFlush.add(new Card("SJ"));
		this.straightFlush.add(new Card("SQ"));
		this.straightFlush.add(new Card("SK"));
		this.AIP = new AIPlayer(this.straightFlush);
	}
	
	@And("^AIP has a four of a kind$")
	public void AIP_has_a_four_of_a_kind() {
		this.fourOfAKind = new ArrayList<Card>();
		this.fourOfAKind.add(new Card("S4"));
		this.fourOfAKind.add(new Card("D4"));
		this.fourOfAKind.add(new Card("H4"));
		this.fourOfAKind.add(new Card("C4"));
		this.fourOfAKind.add(new Card("S5"));
		this.AIP = new AIPlayer(this.fourOfAKind);
	}
	
	@And("^AIP has a full house$")
	public void AIP_has_a_full_house() {
		this.fullHouse = new ArrayList<Card>();
		this.fullHouse.add(new Card("D5"));
		this.fullHouse.add(new Card("D4"));
		this.fullHouse.add(new Card("H4"));
		this.fullHouse.add(new Card("C4"));
		this.fullHouse.add(new Card("S5"));
		this.AIP = new AIPlayer(this.fullHouse);
	}
	
	@And("^AIP has a flush$")
	public void AIP_has_a_flush() {
		this.flush = new ArrayList<Card>();
		this.flush.add(new Card("S4"));
		this.flush.add(new Card("S5"));
		this.flush.add(new Card("S6"));
		this.flush.add(new Card("S7"));
		this.flush.add(new Card("S9"));
		this.AIP = new AIPlayer(this.flush);
	}
	
	@And("^AIP has a straight$")
	public void AIP_has_a_straight() {
		this.straight = new ArrayList<Card>();
		this.straight.add(new Card("S4"));
		this.straight.add(new Card("D5"));
		this.straight.add(new Card("H6"));
		this.straight.add(new Card("C7"));
		this.straight.add(new Card("S8"));
		this.AIP = new AIPlayer(this.straight);
	}
	
	@And("^AIP has a three of a kind$")
	public void AIP_has_a_three_of_a_kind() {
		this.threeOfAKind = new ArrayList<Card>();
		this.threeOfAKind.add(new Card("S4"));
		this.threeOfAKind.add(new Card("D4"));
		this.threeOfAKind.add(new Card("H4"));
		this.threeOfAKind.add(new Card("C7"));
		this.threeOfAKind.add(new Card("S8"));
		this.AIP = new AIPlayer(this.threeOfAKind);
	}
	
	@And("^AIP has a two pair$")
	public void AIP_has_a_two_pair() {
		this.twoPair = new ArrayList<Card>();
		this.twoPair.add(new Card("S4"));
		this.twoPair.add(new Card("D4"));
		this.twoPair.add(new Card("H5"));
		this.twoPair.add(new Card("C5"));
		this.twoPair.add(new Card("S8"));
		this.AIP = new AIPlayer(this.twoPair);
	}
	
	@And("^AIP has a pair$")
	public void AIP_has_a_pair() {
		this.pair = new ArrayList<Card>();
		this.pair.add(new Card("S4"));
		this.pair.add(new Card("D4"));
		this.pair.add(new Card("H6"));
		this.pair.add(new Card("C7"));
		this.pair.add(new Card("S8"));
		this.AIP = new AIPlayer(this.pair);
	}
	
	@And("^AIP has a high card$")
	public void AIP_has_a_high_card() {
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.AIP = new AIPlayer(this.highCard);
	}
	
	@When("^the two hands are compared$")
	public void the_two_hands_are_compared() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}

	@Then("^HTB beats AIP$")
	public void HTB_beats_AIP() {
		assertTrue(HTBbeatsAIP);
	}
}
