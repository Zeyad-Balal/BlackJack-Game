package com.company;

import java.util.Scanner;

public class BlackJack {
    static Game gameobj = new Game();
    static Player[] players = gameobj.getPlayers();
    static GUI gui = new GUI();

    public static void main(String[] args) {


        gameobj.generateCardDeck();
        gameobj.setData();
        gui.runGUI(gameobj.getCardDeck(), players[0].getCards(), players[1].getCards(), players[2].getCards(), players[3].getCards());
        turnDraw();
        WinOrTie();




    }

    public static void turnDraw() {
        Scanner in = new Scanner(System.in);


        for (int i = 0; i < 4; i++) {

            if (i == 3) {

                while (gameobj.getPlayers()[i].getScore() <= 21) {
                    Card c = gameobj.drawsCards();
                    gameobj.getPlayers()[i].addCards(c);
                    gui.updatePlayerHand(c, i);
                    gameobj.updateScore();
                    gui.updateDealerHand(c,gameobj.getCardDeck());

                }


            } else {
                while (gameobj.getPlayers()[i].getScore() < 21) {
                    System.out.println("Hit Or Stand ??");
                    String turn = in.nextLine();
                    if (turn.equals("hit")) {
                        Card c = gameobj.drawsCards();
                        gameobj.getPlayers()[i].addCards(c);
                        gui.updatePlayerHand(c, i);
                        gameobj.updateScore();
                    } else
                        break;

                }
            }
        }
    }

public static void WinOrTie()
    {
        int check_push=0;
        int winner=-1;
        for(int i = 0 ; i < 4 ; i++)
        {
            if(gameobj.getPlayers()[i].getScore() == gameobj.getMax_score())
            {
                winner=i;
                check_push++;
            }
        }

        if(check_push==1)
        {
            System.out.println("The Winner is " +gameobj.getPlayers()[winner].getName());
        }
        else
        {
            System.out.println("its a PUSH");
        }

    }
}
