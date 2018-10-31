package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItFullHouse {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a full house in order$")
	public void have_full_house_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a full house out of order \\(one\\)$")
	public void have_full_house_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a full house out of order \\(two\\)$")
	public void have_full_house_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a full house out of order \\(three\\)$")
	public void have_full_house_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a full house out of order \\(four\\)$")
	public void have_full_house_out_of_order_4() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("D5"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a full house$")
	public void check_for_full_house() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a full house$")
	public void be_full_house() {
		assertEquals("FULL_HOUSE", this.type);
	}
}
