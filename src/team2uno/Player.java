/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team2uno;

import java.util.ArrayList;
import javax.smartcardio.Card;

/**
 *
 * @author Team 2
 */
public class Player {
    
private int playerNumber, score;
private ArrayList <Card> cardsOnHand;
private ArrayList<Integer> scorePerRound;

public Player(int playerNumber, int score)
{
    this.playerNumber = playerNumber;
    this.score = score;
    
    cardsOnHand = new ArrayList<Card>();
    scorePerRound = new ArrayList<Integer>();
}

//take card from deck
public Card takeCard()
{
    return null;
}

//put card into pile
public void throwCard(Card c) 
{

}

//sort by colour
public void sortCardsOnHand()
{
    
}

//calculate the score after every round
public int calculateScore() 
{
    return 0;
}

public void declareUno()
{
    
}

//check cards on hand
public void checkCardsOnHand(Player player) 
{
 
}
}