/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team2uno;

import java.util.ArrayList;

/**
 *
 * @author Team 2
 */
public class Game {
    
    private boolean sequence; // sequence of the game (0 – increment player number OR 1 - decrement player number)
    private int maxScore, numberOfPlayers;
    private ArrayList <Player> players;
    private Deck deckOfCards;
                
    public Game(boolean sequence, int maxScore, int numberOfPlayers)
    {
        this.sequence = sequence;
        this.maxScore = maxScore;
        this.numberOfPlayers = numberOfPlayers;
        
        for(int i = 0; i < numberOfPlayers; i++)
        {
            this.createPlayers();
        }
        
        deckOfCards = this.createDeck();
    }
       
    
    public Deck createDeck()
    {
        return null;
    }
    
    public void shuffleDeck(Deck deckOfCards)
    {
    
    }
    
    public ArrayList<Player> createPlayers()
    {
        return null;
    }
    
    public void distributeCards(Deck deckOfCards, int numberOfPlayers)
    {
        
    }
    
    //tracks if any player reaches the max score after every round
    public Player trackMaxScore(ArrayList<Player> place) 
    {
        return null;
    }
    
    //shows the first card after all cards have been distributed across players
    public Card openCard()
    {
        return null;
    }    
    
    //shows the last card on the pile
    public Card showLastCard()
    {
        return null;
    }
    
    //removes player from ArrayList
    public void dropPlayer(Player player)
    {
    
    }
    
    //returns the next player number after reverse card is thrown
    public int nextPlayer(boolean sequence, int playerNumber)
    {
        return 0;
    }
    
    //returns the next player number after skip card is thrown
    public int skipPlayer(int playerNumber)
    {
        return 0;
    }
            
}
