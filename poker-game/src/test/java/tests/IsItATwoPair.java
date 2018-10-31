package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItATwoPair {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a two pair in order$")
	public void have_two_pair_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("C5"));
		this.hand.add(new Card("S6"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a two pair out of order \\(one\\)$")
	public void have_two_pair_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H6"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a two pair out of order \\(two\\)$")
	public void have_two_pair_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a two pair in reverse order$")
	public void have_two_pair_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S4"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a two pair$")
	public void check_for_two_pair() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a two pair$")
	public void be_two_pair() {
		assertEquals("DOUBLE_PAIR", this.type);
	}
}
