/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author John Paua
 * StuNum: 991682468
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            
            //c.setValue(insert call to random number generator here)
            magicHand[i].setValue((int)((Math.random()*(13-1))+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i].setSuit(Card.SUITS[(int)((Math.random()*(3-0))+0)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a card value from 1-13");
        int userCardValue = sc.nextInt();
        System.out.println("Pick a suit \n0=hearts, \n1=diamonds, \n2=spades, \n3=clubs");
        int userCardSuitNumber = sc.nextInt();
        String userCardSuit = "";
        switch(userCardSuitNumber) {
            case 0: userCardSuit = "Hearts";
                    break;
            case 1: userCardSuit = "Diamonds";
                    break;
            case 2: userCardSuit = "Spades";
                    break;
            case 3: userCardSuit = "Clubs";
                    break;
        }
        String winCondition = "Loser";
        // and search magicHand here
        for(int i=0;i<7;i++) {
            boolean valueMatch = false, suitMatch = false;
            if(userCardValue == magicHand[i].getValue()) {
                valueMatch = true;
            }
            if(userCardSuit.equals(magicHand[i].getSuit())) {
                suitMatch = true;
            }
            if(valueMatch == true && suitMatch == true) {
                winCondition = "Winner";
                break;
            }
        }
        //Then report the result here
        System.out.println(winCondition);
    }
    
}
