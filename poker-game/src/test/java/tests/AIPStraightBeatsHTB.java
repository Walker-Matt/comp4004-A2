package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class AIPStraightBeatsHTB {
	private Player HTB;
	private AIPlayer AIP;
	private ArrayList<Card> AIPhand;
	private ArrayList<Card> threeOfAKind;
	private ArrayList<Card> twoPair;
	private ArrayList<Card> pair;
	private ArrayList<Card> highCard;
	private boolean AIPbeatsHTB;
	
	public void AIP_has_a_straight() {
		this.AIPhand = new ArrayList<Card>();
		this.AIPhand.add(new Card("S4"));
		this.AIPhand.add(new Card("D5"));
		this.AIPhand.add(new Card("H6"));
		this.AIPhand.add(new Card("C7"));
		this.AIPhand.add(new Card("S8"));
		this.AIP = new AIPlayer(this.AIPhand);
	}
	
	@Given("^AIP has a straight and HTB has a three of a kind$")
	public void HTB_has_a_three_of_a_kind() {
		AIP_has_a_straight();
		this.threeOfAKind = new ArrayList<Card>();
		this.threeOfAKind.add(new Card("S4"));
		this.threeOfAKind.add(new Card("D4"));
		this.threeOfAKind.add(new Card("H4"));
		this.threeOfAKind.add(new Card("C7"));
		this.threeOfAKind.add(new Card("S8"));
		this.HTB = new Player(this.threeOfAKind);
	}
	
	@Given("^AIP has a straight and HTB has a two pair$")
	public void HTB_has_a_two_pair() {
		AIP_has_a_straight();
		this.twoPair = new ArrayList<Card>();
		this.twoPair.add(new Card("S4"));
		this.twoPair.add(new Card("D4"));
		this.twoPair.add(new Card("H5"));
		this.twoPair.add(new Card("C5"));
		this.twoPair.add(new Card("S8"));
		this.HTB = new Player(this.twoPair);
	}
	
	@Given("^AIP has a straight and HTB has a pair$")
	public void HTB_has_a_pair() {
		AIP_has_a_straight();
		this.pair = new ArrayList<Card>();
		this.pair.add(new Card("S4"));
		this.pair.add(new Card("D4"));
		this.pair.add(new Card("H6"));
		this.pair.add(new Card("C7"));
		this.pair.add(new Card("S8"));
		this.HTB = new Player(this.pair);
	}
	
	@Given("^AIP has a straight and HTB has a high card$")
	public void HTB_has_a_high_card() {
		AIP_has_a_straight();
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.HTB = new Player(this.highCard);
	}
	
	@When("^AIPs straight is compared to HTBs three of a kind$")
	public void compared_to_three_of_a_kind() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight is compared to HTBs two pair$")
	public void compared_to_two_pair() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight is compared to HTBs pair$")
	public void compared_to_pair() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@When("^AIPs straight is compared to HTBs high card$")
	public void compared_to_high_card() {
		this.AIPbeatsHTB = (AIP.getHighestHand().getWeight() 
							> HTB.getHighestHand().getWeight());
	}
	
	@Then("^AIPs straight beats HTBs three of a kind$")
	public void beats_three_of_a_kind() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight beats HTBs two pair$")
	public void beats_two_pair() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight beats HTBs pair$")
	public void beats_pair() {
		assertTrue(AIPbeatsHTB);
	}
	
	@Then("^AIPs straight beats HTBs high card$")
	public void beats_high_card() {
		assertTrue(AIPbeatsHTB);
	}
}
