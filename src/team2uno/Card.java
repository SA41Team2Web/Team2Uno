/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team2uno;

/**
 *
 * @author Team 2
 */
public class Card {
    
//mainType - number, wild, action
//subType - plusFour, wild, reverse, skip, draw
//value  - equivalent score of card
private String colour, mainType, subType;
private int value;

public Card(String colour, String mainType, String subType, int value)
{
    this.colour  = colour;
    this.mainType = mainType;
    this.subType = subType;
    this.value = value;
}

public void reverse()
{

}

public void skip()
{

}

public void draw(int number)
{

}

public void wild(String colour)
{

}
}
