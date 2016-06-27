/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author araba
 */
public class testCards {
    
    public static int comparaCartas(Cards carta1, Cards carta2){
        if(carta1.getRank() == carta2.getRank() || carta1.getSuit() == carta2.getSuit()){
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public static void drawCards(Deck baraja, ArrayList<Cards> mano){
        int i = 0;
        while(i < 3)
        {
            mano.add(baraja.drawFromDeck());
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        int i;
        
        // Se declara el deck
        Deck mazo = new Deck();
        Cards cartaInicial;

        // Se declaran las dos manos
        ArrayList<Cards> manoUser = new ArrayList<Cards>();
        ArrayList<Cards> manoIA = new ArrayList<Cards>();
        
        // Se sacan las dos manos del mazo
        drawCards(mazo, manoUser);
        drawCards(mazo, manoIA);
        
        cartaInicial = mazo.drawFromDeck();
        
        System.out.println(cartaInicial.toString());
        System.out.println(manoIA.toString());
        
        for(i = 0 ; i < manoIA.size(); i++ ){
            if( comparaCartas(manoIA.get(i), cartaInicial) == 1){
                manoIA.remove(i);
            }
            System.out.println(manoIA.toString());
            break;
            
        }
        
        System.out.println("ManoIA fuera del for: "+manoIA.toString());
        
        
//        System.out.println(manoIA.toString());
//        System.out.println(manoIA.get(0).toString());
//        manoIA.remove(0);
//        System.out.println(manoIA.toString());

    }    
}