package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class AIPStraightFlushBeatsHTB {
	private Player HTB;
	private AIPlayer AIP;
	private ArrayList<Card> AIPhand;
	private ArrayList<Card> fourOfAKind;
	private ArrayList<Card> fullHouse;
	private ArrayList<Card> flush;
	private ArrayList<Card> straight;
	private ArrayList<Card> threeOfAKind;
	private ArrayList<Card> twoPair;
	private ArrayList<Card> pair;
	private ArrayList<Card> highCard;
	private boolean AIPbeatsHTB;
	
	public void AIP_has_a_straight_flush() {
		this.AIPhand = new ArrayList<Card>();
		this.AIPhand.add(new Card("S9"));
		this.AIPhand.add(new Card("S10"));
		this.AIPhand.add(new Card("SJ"));
		this.AIPhand.add(new Card("SQ"));
		this.AIPhand.add(new Card("SK"));
		this.AIP = new AIPlayer(this.AIPhand);
	}
	
	@Given("^AIP has a straight flush and HTB has a four of a kind$")
	public void HTB_has_a_four_of_a_kind() {
		AIP_has_a_straight_flush();
		this.fourOfAKind = new ArrayList<Card>();
		this.fourOfAKind.add(new Card("S4"));
		this.fourOfAKind.add(new Card("D4"));
		this.fourOfAKind.add(new Card("H4"));
		this.fourOfAKind.add(new Card("C4"));
		this.fourOfAKind.add(new Card("S5"));
		this.HTB = new Player(this.fourOfAKind);
	}
	
	@Given("^AIP has a straight flush and HTB has a full house$")
	public void HTB_has_a_full_house() {
		AIP_has_a_straight_flush();
		this.fullHouse = new ArrayList<Card>();
		this.fullHouse.add(new Card("D5"));
		this.fullHouse.add(new Card("D4"));
		this.fullHouse.add(new Card("H4"));
		this.fullHouse.add(new Card("C4"));
		this.fullHouse.add(new Card("S5"));
		this.HTB = new Player(this.fullHouse);
	}
	
	@Given("^AIP has a straight flush and HTB has a flush$")
	public void HTB_has_a_flush() {
		AIP_has_a_straight_flush();
		this.flush = new ArrayList<Card>();
		this.flush.add(new Card("S4"));
		this.flush.add(new Card("S5"));
		this.flush.add(new Card("S6"));
		this.flush.add(new Card("S7"));
		this.flush.add(new Card("S9"));
		this.HTB = new Player(this.flush);
	}
	
	@Given("^AIP has a straight flush and HTB has a straight$")
	public void HTB_has_a_straight() {
		AIP_has_a_straight_flush();
		this.straight = new ArrayList<Card>();
		this.straight.add(new Card("S4"));
		this.straight.add(new Card("D5"));
		this.straight.add(new Card("H6"));
		this.straight.add(new Card("C7"));
		this.straight.add(new Card("S8"));
		this.HTB = new Player(this.straight);
	}
	
	@Given("^AIP has a straight flush and HTB has a three of a kind$")
	public void HTB_has_a_three_of_a_kind() {
		AIP_has_a_straight_flush();
		this.threeOfAKind = new ArrayList<Card>();
		this.threeOfAKind.add(new Card("S4"));
		this.threeOfAKind.add(new Card("D4"));
		this.threeOfAKind.add(new Card("H4"));
		this.threeOfAKind.add(new Card("C7"));
		this.threeOfAKind.add(new Card("S8"));
		this.HTB = new Player(this.threeOfAKind);
	}
	
	@Given("^AIP has a straight flush and HTB has a two pair$")
	public void HTB_has_a_two_pair() {
		AIP_has_a_straight_flush();
		this.twoPair = new ArrayList<Card>();
		this.twoPair.add(new Card("S4"));
		this.twoPair.add(new Card("D4"));
		this.twoPair.add(new Card("H5"));
		this.twoPair.add(new Card("C5"));
		this.twoPair.add(new Card("S8"));
		this.HTB = new Player(this.twoPair);
	}
	
	@Given("^AIP has a straight flush and HTB has a pair$")
	public void HTB_has_a_pair() {
		AIP_has_a_straight_flush();
		this.pair = new ArrayList<Card>();
		this.pair.add(new Card("S4"));
		this.pair.add(new Card("D4"));
		this.pair.add(new Card("H6"));
		this.pair.add(new Card("C7"));
		this.pair.add(new Card("S8"));
		this.HTB = new Player(this.pair);
	}
	
	@Given("^AIP has a straight flush and HTB has a high card$")
	public void HTB_has_a_high_card() {
		AIP_has_a_straight_flush();
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.HTB = new Player(this.highCard);
	}
	
	@When("^AIPs straight flush is compared HTBs to four of a kind$")
	public void compared_to_four_of_a_kind() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs full house$")
	public void compared_to_full_house() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs flush$")
	public void compared_to_flush() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs straight$")
	public void compared_to_straight() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs three of a kind$")
	public void compared_to_three_of_a_kind() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs two pair$")
	public void compared_to_two_pair() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs pair$")
	public void compared_to_pair() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight flush is compared to HTBs high card$")
	public void compared_to_high_card() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIPs straight flush beats HTBs four of a kind$")
	public void beats_four_of_a_kind() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs full house$")
	public void beats_full_house() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs flush$")
	public void beats_flush() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs straight$")
	public void beats_straight() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs three of a kind$")
	public void beats_three_of_a_kind() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs two pair$")
	public void beats_two_pair() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs pair$")
	public void beats_pair() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight flush beats HTBs high card$")
	public void beats_high_card() {
		assertTrue(AIPbeatsHTB);
	}
}
