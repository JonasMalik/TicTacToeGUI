package com.company.Model;


import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import java.util.ArrayList;

/**
 * Created by mizuho on 2016-01-27.
 */
public class GameEngine {

    int currentPlayer = 0;
    private String[] cells = new String[9];
    private static ArrayList<Player> playerList = new ArrayList<>();

    public void CreatingPlayer(){
        int i = 0;
        String playerMark = Mark.CIRCLE.getSymbol();

        while (i<2){
            if (i == 1){
                playerMark = Mark.CROSS.getSymbol();
            }
            playerList.add(new Player(AddPlayerLayout.rowData[i][0],playerMark));
            i++;
        }
        System.out.println(playerList.get(0).getName());
        System.out.println(playerList.get(0).getPiece());
        System.out.println(playerList.get(1).getName());
        System.out.println(playerList.get(1).getPiece());
    }

    public void Play(int myIndex) {
        setText(myIndex);
    }

    public int togglePlayer() {
        if (currentPlayer == 0){
            currentPlayer = 1;
        }
        else {
            currentPlayer = 0;
        }
        return currentPlayer;
    }

    public void setText(int myI) {

        BoardLayout.buttons.get(myI).setText(playerList.get(togglePlayer()).getPiece());

    }

}
