/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;
import java.util.Scanner;

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
    
    public static void leeCartas(ArrayList<Cards> mano, Cards cartaCompara, Deck baraja){
        System.out.println("");
        System.out.println("Turno de la IA");
    //    System.out.println("Mano de la IA al inicio del turno: "+mano.toString());
        System.out.println("");
        
        if(mano.size() < 3){
            if( comparaCartas(mano.get(0), cartaCompara) == 1){
                cartaCompara = mano.get(0);
                mano.remove(0);
            } else if( comparaCartas(mano.get(1), cartaCompara) == 1){
                cartaCompara = mano.get(1);
                mano.remove(1);
            } else if( comparaCartas(mano.get(2), cartaCompara) == 1){
                cartaCompara = mano.get(2);
                mano.remove(2);
            }
        } else if(mano.size() == 3){
            mano.add(baraja.drawFromDeck());
            
            if( comparaCartas(mano.get(3), cartaCompara) == 1){
                cartaCompara = mano.get(3);
                mano.remove(3);
            }
        } else if(mano.size() == 4){
            mano.add(baraja.drawFromDeck());
            
            if( comparaCartas(mano.get(4), cartaCompara) == 1){
                cartaCompara = mano.get(4);
                mano.remove(4);
            }
        } else if(mano.size() == 5){
            mano.add(baraja.drawFromDeck());
            
            if( comparaCartas(mano.get(5), cartaCompara) == 1){
                cartaCompara = mano.get(5);
                mano.remove(5);
            }
        }
    //    System.out.println("Mano de la IA: "+mano.toString());
    //    System.out.println("Carta referencia: "+cartaCompara);
    }
    
    public static void leeCartasUsuario(ArrayList<Cards> mano, Cards cartaCompara, Deck baraja){
        
        Scanner teclado = new Scanner(System.in);
        int seleccionUser;
        
        System.out.println("");        
        System.out.println("Turno del usuario");
        System.out.println("Carta referencia: "+cartaCompara);
        System.out.println("Mano del usuario al inicio del turno: "+mano.toString());
        System.out.println("");
        
        System.out.println("¿Que carta desea dar?");
        seleccionUser = teclado.nextInt();
        
        if(seleccionUser <= mano.size()){
            if(comparaCartas(mano.get(seleccionUser),cartaCompara) == 1){
                cartaCompara = mano.get(seleccionUser);
                mano.remove(seleccionUser);
            }
            else{
                System.out.println("Opcion no vâlida, penalizacion 1 carta");
                mano.add(baraja.drawFromDeck());  
            }
        }
        else{
            System.out.println("Opcion no vâlida");
            leeCartasUsuario(mano, cartaCompara, baraja);
        }
        
        
        System.out.println("Mano del usuario: "+mano.toString());
        System.out.println("Carta referencia: "+cartaCompara);
    }
    
    public static void main(String[] args) {
        
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
        
        System.out.println("Carta inicial: "+cartaInicial.toString());
        System.out.println("Mano inicial del usuario: "+manoUser.toString());
        System.out.println("Mano inicial de la IA: "+manoIA.toString());
        
        
        while(mazo.getTotalCards()!=0){
            leeCartasUsuario(manoUser, cartaInicial, mazo);
            leeCartas(manoIA, cartaInicial, mazo);
        }
    }
}