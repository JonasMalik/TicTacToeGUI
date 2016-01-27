package com.company.Model;


import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import java.util.ArrayList;

/**
 * Created by mizuho on 2016-01-27.
 */
public class GameEngine {

    Player currentPlayer;
    private String[] cells = new String[9];
    private ArrayList<Player> playerList = new ArrayList<>();
    int i = 0;

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

    public void Play(int i) {
        togglePlayer();
        setText(i);

    }

    public int togglePlayer() {
        if (i == 0)
            i = 1;
        else
            i = 0;

        return i;
    }

    public void setText(int i) {
        if (BoardLayout.buttons.get(i).getText().isEmpty())
            BoardLayout.buttons.get(i).setText(playerList.get(togglePlayer()).getPiece());
    }

}
