package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class HTBPairBeatsAIP {
	private Player HTB;
	private AIPlayer AIP;
	private ArrayList<Card> HTBhand;
	private ArrayList<Card> highCard;
	private boolean HTBbeatsAIP;
	
	public void HTB_has_a_pair() {
		this.HTBhand = new ArrayList<Card>();
		this.HTBhand.add(new Card("S4"));
		this.HTBhand.add(new Card("D4"));
		this.HTBhand.add(new Card("H6"));
		this.HTBhand.add(new Card("C7"));
		this.HTBhand.add(new Card("S8"));
		this.HTB = new Player(this.HTBhand);
	}
	
	@Given("^HTB has a pair and AIP has a high card$")
	public void AIP_has_a_high_card() {
		HTB_has_a_pair();
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.AIP = new AIPlayer(this.highCard);
	}
	
	@When("^HTBs pair is compared to AIPs high card$")
	public void compared_to_high_card() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@Then("^HTBs pair beats AIPs high card$")
	public void beats_high_card() {
		assertTrue(HTBbeatsAIP);
	}
}
