package com.company;

public class Player {


    private int counter=0;
    private int score = 0;

    public Card[] getCards() {
        return cards;
    }

    private Card cards[] = new Card[11];
    boolean blackjack = false;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Player()
    {

    }

    public Player(String name , int score , boolean blackjack)
    {
        this.name=name;
        this.score=score;
        this.blackjack= blackjack;
    }

    public void addCards(Card card)
    {

        cards [counter] = card;
        score+=card.getValue();
        counter++;


    }





    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
