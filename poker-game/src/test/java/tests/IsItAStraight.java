package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAStraight {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a straight in order$")
	public void have_straight_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S2"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C5"));
		this.hand.add(new Card("S6"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a straight out of order \\(one\\)$")
	public void have_straight_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S2"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a straight out of order \\(two\\)$")
	public void have_straight_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S2"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a straight out of order \\(three\\)$")
	public void have_straight_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S2"));
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a straight out of order \\(four\\)$")
	public void have_straight_out_of_order_4() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("S2"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a straight in reverse order$")
	public void have_straight_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("C5"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("D3"));
		this.hand.add(new Card("S2"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a straight$")
	public void check_for_straight() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a straight$")
	public void be_straight() {
		assertEquals("STRAIGHT", this.type);
	}
}
