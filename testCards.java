/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.Arrays;

/**
 *
 * @author araba
 */
public class testCards {
    public static void main(String[] args) {
        
//        Cards baraja = new Cards(1,0);
//        System.out.println(baraja.toString());
    
    
//            
//		
//
//		System.out.println( deck.getTotalCards() );
//
//	   while (deck.getTotalCards()!= 0 )
//	   {
//		   C = deck.drawFromDeck();
//		   System.out.println( C.toString() );
//           }    
//    }

        Hand mano = new Hand();
        Deck deck = new Deck();
        Cards baraja;
        
        System.out.println(Arrays.toString(mano.getHand()));
        System.out.println(Arrays.toString(mano.getHand()));
        System.out.println("");
        
        
        while (deck.getTotalCards()!= 0 )
	   {
		   baraja = deck.drawFromDeck();
		   System.out.println( baraja.toString() );
           }    

    }    
}