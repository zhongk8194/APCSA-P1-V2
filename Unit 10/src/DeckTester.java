/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Queen", "King", "Ace"};
		String[] suit1 = {"Hearts", "Clubs", "Diamonds"};
		int[] pointValue1 = {12, 13, 1};
		Deck one = new Deck(rank1, suit1, pointValue1);
		System.out.println(one.isEmpty());
		
		String[] rank2 = {"2", "3", "4"};
		String[] suit2 = {"Spades", "Hearts", "Clubs"};
		int[] pointValue2 = {2, 3, 4};
		Deck two = new Deck(rank2, suit2, pointValue2);
		System.out.println(two.size());
		
		String[] rank3 = {"5", "6", "7"};
		String[] suit3 = {"Hearts", "Diamonds", "Spades"};
		int[] pointValue3 = {5, 6, 7};
		Deck three = new Deck(rank3, suit3, pointValue3);
		System.out.println(three.deal());
		System.out.println("");
		
		//Standard deck of cards below
		String[] rank4 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit4 = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] pointValue4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck four = new Deck(rank4, suit4, pointValue4);
		four.shuffle();
		System.out.println(four.toString()); 
	}
}
