package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAFourOfAKind {
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
	
	@Given("^I have a four of a kind in any order$")
	public void all_permutations_four_of_a_kind() {
		ArrayList<Card> original = new ArrayList<Card>();
		original.add(new Card("S4"));
		original.add(new Card("D4"));
		original.add(new Card("H4"));
		original.add(new Card("C4"));
		original.add(new Card("SA"));
		permutations = generatePermutations(original);
	}
	
	@When("^I check for a four of a kind$")
	public void check_for_four_of_a_kind() {
		this.types = new ArrayList<String>();
		for(ArrayList<Card> permutation : this.permutations) {
			this.player = new Player(permutation);
			this.types.add(this.player.getHighestHand().toString());
		}
	}
	
	@Then("^it should be a four of a kind$")
	public void be_four_of_a_kind() {
		for(String type : types) {
			assertEquals("FOUR_OF_A_KIND", type);
		}
	}
}
