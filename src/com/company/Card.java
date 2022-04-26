package com.company;

public class Card {




    private int suit;
    private int rank;
    private int value;

    public Card()
    {
        suit=0;
        rank=0;
        value=0;
    }
    public Card(Card card) {
        this.suit = card.suit;
        this.rank = card.rank;
        this.value = card.value;
    }

    public Card(int suit , int rank , int value)
    {
        this.suit=suit;
        this.rank=rank;
        this.value=value;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }




    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }
}
