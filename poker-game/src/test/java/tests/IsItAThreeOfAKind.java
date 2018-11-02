package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAThreeOfAKind {
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
	
	@Given("^I have a three of a kind in any order$")
	public void all_permutations_three_of_a_kind() {
		ArrayList<Card> original = new ArrayList<Card>();
		original.add(new Card("S2"));
		original.add(new Card("D2"));
		original.add(new Card("H2"));
		original.add(new Card("C5"));
		original.add(new Card("S6"));
		permutations = generatePermutations(original);
	}
	
	@When("^I check for a three of a kind$")
	public void check_for_three_of_a_kind() {
		this.types = new ArrayList<String>();
		for(ArrayList<Card> permutation : this.permutations) {
			this.player = new Player(permutation);
			this.types.add(this.player.getHighestHand().toString());
		}
	}
	
	@Then("^it should be a three of a kind$")
	public void be_three_of_a_kind() {
		for(String type : types) {
			assertEquals("THREE_OF_A_KIND", type);
		}
	}
}
