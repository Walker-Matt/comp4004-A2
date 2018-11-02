package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItRoyalFlush {
	private Player player;
	private ArrayList<String> types;
	private ArrayList<ArrayList<Card>> permutations;
	

	public ArrayList<ArrayList<Card>> generatePermutations(ArrayList<Card> original) {
		if (original.size() == 0) {
			ArrayList<ArrayList<Card>> result = new ArrayList<ArrayList<Card>>(); 
			result.add(new ArrayList<Card>()); 
			return result; 
		}
		Card firstElement = original.remove(0);
		ArrayList<ArrayList<Card>> returnValue = new ArrayList<ArrayList<Card>>();
		ArrayList<ArrayList<Card>> permutations = generatePermutations(original);
		for (ArrayList<Card> smallerPermutated : permutations) {
			for (int index=0; index <= smallerPermutated.size(); index++) {
				ArrayList<Card> temp = new ArrayList<Card>(smallerPermutated);
				temp.add(index, firstElement);
				returnValue.add(temp);
			}
		}
		return returnValue;
	}
	
	@Given("^I have a royal flush in any order$")
	public void all_permutations_royal_flush() {
		ArrayList<Card> original = new ArrayList<Card>();
		original.add(new Card("S10"));
		original.add(new Card("SJ"));
		original.add(new Card("SQ"));
		original.add(new Card("SK"));
		original.add(new Card("SA"));
		permutations = generatePermutations(original);
	}
	
	@When("^I check for a royal flush$")
	public void check_for_royal_flush() {
		this.types = new ArrayList<String>();
		for(ArrayList<Card> permutation : this.permutations) {
			this.player = new Player(permutation);
			this.types.add(this.player.getHighestHand().toString());
		}
	}
	
	@Then("^it should be a royal flush$")
	public void be_royal_flush() {
		for(String type : types) {
			assertEquals("ROYAL_FLUSH", type);
		}
	}
}
