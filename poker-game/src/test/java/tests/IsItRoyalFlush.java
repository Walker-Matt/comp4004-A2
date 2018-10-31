package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItRoyalFlush {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a royal flush in order$")
	public void have_royal_flush_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S10"));
		this.hand.add(new Card("SJ"));
		this.hand.add(new Card("SQ"));
		this.hand.add(new Card("SK"));
		this.hand.add(new Card("SA"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a royal flush out of order \\(one\\)$")
	public void have_royal_flush_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("SJ"));
		this.hand.add(new Card("SQ"));
		this.hand.add(new Card("SK"));
		this.hand.add(new Card("SA"));
		this.hand.add(new Card("S10"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a royal flush out of order \\(two\\)$")
	public void have_royal_flush_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("SQ"));
		this.hand.add(new Card("SK"));
		this.hand.add(new Card("SA"));
		this.hand.add(new Card("S10"));
		this.hand.add(new Card("SJ"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a royal flush out of order \\(three\\)$")
	public void have_royal_flush_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("SK"));
		this.hand.add(new Card("SA"));
		this.hand.add(new Card("S10"));
		this.hand.add(new Card("SJ"));
		this.hand.add(new Card("SQ"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a royal flush out of order \\(four\\)$")
	public void have_royal_flush_out_of_order_4() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("SA"));
		this.hand.add(new Card("S10"));
		this.hand.add(new Card("SJ"));
		this.hand.add(new Card("SQ"));
		this.hand.add(new Card("SK"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a royal flush in reverse order$")
	public void have_royal_flush_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("SA"));
		this.hand.add(new Card("SK"));
		this.hand.add(new Card("SQ"));
		this.hand.add(new Card("SJ"));
		this.hand.add(new Card("S10"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a royal flush$")
	public void check_for_royal_flush() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a royal flush$")
	public void be_royal_flush() {
		assertEquals("ROYAL_FLUSH", this.type);
	}
}
