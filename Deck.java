package cards;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Cards> cards;

	 Deck()
	{
		cards = new ArrayList<Cards>();
		for (int a=0; a<=3; a++)
		{
			for (int b=0; b<=12; b++)
			 {
			   cards.add( new Cards(a,b) );
			 }
		}
	}

	public Cards drawFromDeck()
	{
		Random generator = new Random();
		int index= generator.nextInt( cards.size() );
		return cards.remove(index);
	}

	 public int getTotalCards()
	{
		return cards.size();
	}
}
