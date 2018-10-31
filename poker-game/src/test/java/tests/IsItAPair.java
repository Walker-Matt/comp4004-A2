package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAPair {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a pair in order$")
	public void have_pair_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("C6"));
		this.hand.add(new Card("S7"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a pair out of order \\(one\\)$")
	public void have_pair_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("C7"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a pair out of order \\(two\\)$")
	public void have_pair_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C7"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a pair out of order \\(three\\)$")
	public void have_pair_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D6"));
		this.hand.add(new Card("H7"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a pair out of order \\(four\\)$")
	public void have_pair_out_of_order_4() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D6"));
		this.hand.add(new Card("H7"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a pair in reverse order$")
	public void have_pair_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S7"));
		this.hand.add(new Card("D6"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S4"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a pair$")
	public void check_for_pair() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a pair$")
	public void be_pair() {
		assertEquals("PAIR", this.type);
	}
}
