package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAThreeOfAKind {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a three of a kind in order$")
	public void have_three_of_a_kind_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C5"));
		this.hand.add(new Card("S6"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a three of a kind out of order \\(one\\)$")
	public void have_three_of_a_kind_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H5"));
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("C6"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a three of a kind out of order \\(two\\)$")
	public void have_three_of_a_kind_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C6"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a three of a kind out of order \\(three\\)$")
	public void have_three_of_a_kind_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H6"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a three of a kind out of order \\(four\\)$")
	public void have_three_of_a_kind_out_of_order_4() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H6"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a three of a kind in reverse order$")
	public void have_three_of_a_kind_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S6"));
		this.hand.add(new Card("D5"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S4"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a three of a kind$")
	public void check_for_three_of_a_kind() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a three of a kind$")
	public void be_three_of_a_kind() {
		assertEquals("THREE_OF_A_KIND", this.type);
	}
}
