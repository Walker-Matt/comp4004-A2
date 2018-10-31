package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAFourOfAKind {
	private Player player;
	private ArrayList<Card> hand;
	private String type;
	
	@Given("^I have a four of a kind in order$")
	public void have_four_of_a_kind_in_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S5"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a four of a kind out of order \\(one\\)$")
	public void have_four_of_a_kind_out_of_order_1() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a four of a kind out of order \\(two\\)$")
	public void have_four_of_a_kind_out_of_order_2() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a four of a kind out of order \\(three\\)$")
	public void have_four_of_a_kind_out_of_order_3() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S4"));
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.player = new Player(this.hand);
	}
	
	@Given("^I have a four of a kind in reverse order$")
	public void have_four_of_a_kind_in_reverse_order() {
		this.hand = new ArrayList<Card>();
		this.hand.add(new Card("S5"));
		this.hand.add(new Card("D4"));
		this.hand.add(new Card("H4"));
		this.hand.add(new Card("C4"));
		this.hand.add(new Card("S4"));
		this.player = new Player(this.hand);
	}
	
	@When("^I check for a four of a kind$")
	public void check_for_four_of_a_kind() {
		this.type = player.getHighestHand().toString();
	}
	
	@Then("^it should be a four of a kind$")
	public void be_four_of_a_kind() {
		assertEquals("FOUR_OF_A_KIND", this.type);
	}
}
