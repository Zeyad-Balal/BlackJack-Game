package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public int getMax_score() {
        return max_score;
    }

    private int max_score=0;



    private Player [] players = new Player[4];
    private Card cardDeck[] = new Card [52];

    public Card[] getCardDeck() {
        return cardDeck;
    }

    private Card obj = new Card();

    public Player[] getPlayers() {
        return players;
    }


    public void generateCardDeck()
    {
int counter=0;

        for(int i = 0 ; i < 4 ; i++)
            for(int j = 0 ; j < 13 ; j++)
            {
                Card card;
                if(j < 10)
                {
                    card= new Card(i,j,j+1);
                    cardDeck[counter]=card;
                    counter++;
                }
                else
                {
                    card = new Card(i,j,10);
                    cardDeck[counter]=card;
                    counter++;
                }
            }


    }

    public Card drawsCards() {
        Card card;
        Random rand = new Random();
        int randomChoice = rand.nextInt(52);


        if (cardDeck[randomChoice] == null) {
           return drawsCards();
           }



         else {
            card = cardDeck[randomChoice];

            cardDeck[randomChoice] = null;
            return card;
        }
    }





    public void setData()
    {
        for(int i = 0 ; i < 4 ; i++)
        {

            // getting name of player
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the player : " );
            String nameOfPlayer = input.nextLine();
            players[i] = new Player();
            players[i].setName(nameOfPlayer) ;

            //at the beginning draws twice by default for each player
            for(int j = 0 ; j < 2 ; j++) {
                players[i].addCards(drawsCards());
            }


        }

    }

    public void updateScore()
    {

        for(int i = 0 ; i < 4 ; i++)
        {
            if(players[i].getScore()>max_score)
            {
                   max_score = players[i].getScore();
            }
        }

    }



    }

