package projects.project7sorting.cards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private ArrayList<PlayingCard> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<PlayingCard>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add(new PlayingCard(rank, suite));
				}
			}
	}
	
	public PlayingCard dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public void shuffle() {
		// To be completed as part of Programming Project
	}
	
	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		return ret;
	}
}
