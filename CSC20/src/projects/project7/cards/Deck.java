package projects.project7.cards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import projects.project7.csc205.Sorting;

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
	private final static int LENGTH = 52;
	public void shuffle() {
		
		Integer[] ranArray = new Integer[LENGTH];
		       int temp = 0;
		ranArray = generateRandomArray(LENGTH);
		
	}
	
	                           
	
	

	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		return ret;
	}
	public static Integer[] generateRandomArray(int len) {
		Integer[] a = new Integer[len];
		Random rand = new Random();
	    for (int ii=0;ii<a.length-1;ii++) {
	    	a[ii] = rand.nextInt(1000);
	    }			
	    return a;
	}
	
	}
