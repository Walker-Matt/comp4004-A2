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
	
	public void HTB_has_a_royal_flush() {
		this.HTBhand = new ArrayList<Card>();
		this.HTBhand.add(new Card("S10"));
		this.HTBhand.add(new Card("SJ"));
		this.HTBhand.add(new Card("SQ"));
		this.HTBhand.add(new Card("SK"));
		this.HTBhand.add(new Card("SA"));
		this.HTB = new Player(this.HTBhand);
	}
	
	@Given("^HTB has a royal flush and AIP has a straight flush$")
	public void AIP_has_a_straight_flush() {
		HTB_has_a_royal_flush();
		this.straightFlush = new ArrayList<Card>();
		this.straightFlush.add(new Card("S9"));
		this.straightFlush.add(new Card("S10"));
		this.straightFlush.add(new Card("SJ"));
		this.straightFlush.add(new Card("SQ"));
		this.straightFlush.add(new Card("SK"));
		this.AIP = new AIPlayer(this.straightFlush);
	}
	
	@Given("^HTB has a royal flush and AIP has a four of a kind$")
	public void AIP_has_a_four_of_a_kind() {
		HTB_has_a_royal_flush();
		this.fourOfAKind = new ArrayList<Card>();
		this.fourOfAKind.add(new Card("S4"));
		this.fourOfAKind.add(new Card("D4"));
		this.fourOfAKind.add(new Card("H4"));
		this.fourOfAKind.add(new Card("C4"));
		this.fourOfAKind.add(new Card("S5"));
		this.AIP = new AIPlayer(this.fourOfAKind);
	}
	
	@Given("^HTB has a royal flush and AIP has a full house$")
	public void AIP_has_a_full_house() {
		HTB_has_a_royal_flush();
		this.fullHouse = new ArrayList<Card>();
		this.fullHouse.add(new Card("D5"));
		this.fullHouse.add(new Card("D4"));
		this.fullHouse.add(new Card("H4"));
		this.fullHouse.add(new Card("C4"));
		this.fullHouse.add(new Card("S5"));
		this.AIP = new AIPlayer(this.fullHouse);
	}
	
	@Given("^HTB has a royal flush and AIP has a flush$")
	public void AIP_has_a_flush() {
		HTB_has_a_royal_flush();
		this.flush = new ArrayList<Card>();
		this.flush.add(new Card("S4"));
		this.flush.add(new Card("S5"));
		this.flush.add(new Card("S6"));
		this.flush.add(new Card("S7"));
		this.flush.add(new Card("S9"));
		this.AIP = new AIPlayer(this.flush);
	}
	
	@Given("^HTB has a royal flush and AIP has a straight$")
	public void AIP_has_a_straight() {
		HTB_has_a_royal_flush();
		this.straight = new ArrayList<Card>();
		this.straight.add(new Card("S4"));
		this.straight.add(new Card("D5"));
		this.straight.add(new Card("H6"));
		this.straight.add(new Card("C7"));
		this.straight.add(new Card("S8"));
		this.AIP = new AIPlayer(this.straight);
	}
	
	@Given("^HTB has a royal flush and AIP has a three of a kind$")
	public void AIP_has_a_three_of_a_kind() {
		HTB_has_a_royal_flush();
		this.threeOfAKind = new ArrayList<Card>();
		this.threeOfAKind.add(new Card("S4"));
		this.threeOfAKind.add(new Card("D4"));
		this.threeOfAKind.add(new Card("H4"));
		this.threeOfAKind.add(new Card("C7"));
		this.threeOfAKind.add(new Card("S8"));
		this.AIP = new AIPlayer(this.threeOfAKind);
	}
	
	@Given("^HTB has a royal flush and AIP has a two pair$")
	public void AIP_has_a_two_pair() {
		HTB_has_a_royal_flush();
		this.twoPair = new ArrayList<Card>();
		this.twoPair.add(new Card("S4"));
		this.twoPair.add(new Card("D4"));
		this.twoPair.add(new Card("H5"));
		this.twoPair.add(new Card("C5"));
		this.twoPair.add(new Card("S8"));
		this.AIP = new AIPlayer(this.twoPair);
	}
	
	@Given("^HTB has a royal flush and AIP has a pair$")
	public void AIP_has_a_pair() {
		HTB_has_a_royal_flush();
		this.pair = new ArrayList<Card>();
		this.pair.add(new Card("S4"));
		this.pair.add(new Card("D4"));
		this.pair.add(new Card("H6"));
		this.pair.add(new Card("C7"));
		this.pair.add(new Card("S8"));
		this.AIP = new AIPlayer(this.pair);
	}
	
	@Given("^HTB has a royal flush and AIP has a high card$")
	public void AIP_has_a_high_card() {
		HTB_has_a_royal_flush();
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.AIP = new AIPlayer(this.highCard);
	}
	
	@When("^HTBs royal flush is compared to AIPs straight flush$")
	public void compared_to_straight_flush() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs four of a kind$")
	public void compared_to_four_of_a_kind() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs full house$")
	public void compared_to_full_house() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs flush$")
	public void compared_to_flush() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs straight$")
	public void compared_to_straight() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs three of a kind$")
	public void compared_to_three_of_a_kind() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs two pair$")
	public void compared_to_two_pair() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs pair$")
	public void compared_to_pair() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs royal flush is compared to AIPs high card$")
	public void compared_to_high_card() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}

	@Then("^HTBs royal flush beats AIPs straight flush$")
	public void beats_straight_flush() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs four of a kind$")
	public void beats_four_of_a_kind() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs full house$")
	public void beats_full_house() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs flush$")
	public void beats_flush() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs straight$")
	public void beats_straight() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs three of a kind$")
	public void beats_three_of_a_kind() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs two pair$")
	public void beats_two_pair() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs pair$")
	public void beats_pair() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs royal flush beats AIPs high card$")
	public void beats_high_card() {
		assertTrue(HTBbeatsAIP);
	}
}
