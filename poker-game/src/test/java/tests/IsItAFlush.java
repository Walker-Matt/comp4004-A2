package tests;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;

import java.util.*;

import core.Card;
import core.Player;

public class IsItAFlush {
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
	
	@Given("^I have a flush in any order$")
	public void all_permutations_flush() {
		ArrayList<Card> original = new ArrayList<Card>();
		original.add(new Card("S2"));
		original.add(new Card("S3"));
		original.add(new Card("S4"));
		original.add(new Card("S5"));
		original.add(new Card("S7"));
		permutations = generatePermutations(original);
	}
	
	@When("^I check for a flush$")
	public void check_for_flush() {
		this.types = new ArrayList<String>();
		for(ArrayList<Card> permutation : this.permutations) {
			this.player = new Player(permutation);
			this.types.add(this.player.getHighestHand().toString());
		}
	}
	
	@Then("^it should be a flush$")
	public void be_flush() {
		for(String type : types) {
			assertEquals("FLUSH", type);
		}
	}
}
