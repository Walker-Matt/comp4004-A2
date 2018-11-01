package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.AIPlayer;
import core.Card;
import core.Player;

public class HTBTwoPairBeatsAIP {
	private Player HTB;
	private AIPlayer AIP;
	private ArrayList<Card> HTBhand;
	private ArrayList<Card> pair;
	private ArrayList<Card> highCard;
	private boolean HTBbeatsAIP;
	
	public void HTB_has_a_two_pair() {
		this.HTBhand = new ArrayList<Card>();
		this.HTBhand.add(new Card("S4"));
		this.HTBhand.add(new Card("D4"));
		this.HTBhand.add(new Card("H5"));
		this.HTBhand.add(new Card("C5"));
		this.HTBhand.add(new Card("S8"));
		this.HTB = new Player(this.HTBhand);
	}
	
	@Given("^HTB has a two pair and AIP has a pair$")
	public void AIP_has_a_pair() {
		HTB_has_a_two_pair();
		this.pair = new ArrayList<Card>();
		this.pair.add(new Card("S4"));
		this.pair.add(new Card("D4"));
		this.pair.add(new Card("H6"));
		this.pair.add(new Card("C7"));
		this.pair.add(new Card("S8"));
		this.AIP = new AIPlayer(this.pair);
	}
	
	@Given("^HTB has a two pair and AIP has a high card$")
	public void AIP_has_a_high_card() {
		HTB_has_a_two_pair();
		this.highCard = new ArrayList<Card>();
		this.highCard.add(new Card("S4"));
		this.highCard.add(new Card("D5"));
		this.highCard.add(new Card("H6"));
		this.highCard.add(new Card("C7"));
		this.highCard.add(new Card("S9"));
		this.AIP = new AIPlayer(this.highCard);
	}
	
	@When("^HTBs two pair is compared to AIPs pair$")
	public void compared_to_pair() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@When("^HTBs two pair is compared to AIPs high card$")
	public void compared_to_high_card() {
		this.HTBbeatsAIP = (HTB.getHighestHand().getWeight() 
							> AIP.getHighestHand().getWeight());
	}
	
	@Then("^HTBs two pair beats AIPs pair$")
	public void beats_pair() {
		assertTrue(HTBbeatsAIP);
	}
	
	@Then("^HTBs two pair beats AIPs high card$")
	public void beats_high_card() {
		assertTrue(HTBbeatsAIP);
	}
}
