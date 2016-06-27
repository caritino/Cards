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
public class Hand {
    
    private Cards[] hand = new Cards[3];
    private int i;
    private Deck deck = new Deck();
    private Cards baraja;
    
    public Cards[] getHand(){
        
        for(i = 0; i < 3; i++){
            hand[i] = deck.drawFromDeck();
        }
       
        return hand;
    }
    
    
}
