// Source: http://www.dreamincode.net/forums/topic/110380-deck-of-cards-using-various-methods/

package cards;

public class Cards
{
	private int rank, suit;

	private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


	Cards(int suit, int rank)
	{
		this.rank=rank;
		this.suit=suit;
	}

	public @Override String toString()
	{
		  return ranks[rank] + " of " + suits[suit];
	}

	public int getRank() {
		 return rank;
	}

	public int getSuit() {
		return suit;
	}
        
}
