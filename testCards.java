/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author araba
 */
public class testCards {
    public static void main(String[] args) {
        
//        Cards baraja = new Cards(1,0);
//        System.out.println(baraja.toString());
    
    
            Deck deck = new Deck();
		Cards C;

		System.out.println( deck.getTotalCards() );

	   while (deck.getTotalCards()!= 0 )
	   {
		   C = deck.drawFromDeck();
		   System.out.println( C.toString() );
           }    
    }
    
}