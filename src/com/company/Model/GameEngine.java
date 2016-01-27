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
    private boolean win = false;

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
        CheckHorizontal();
        System.out.println(win);
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
        int player = togglePlayer();
        BoardLayout.buttons.get(myI).setText(playerList.get(player).getPiece());
        cells[myI] = playerList.get(player).getPiece();
    }

    public boolean CheckHorizontal(){

        if
        if (cells[0].equals(cells[1]) && cells[1].equals(cells[2])) {
            win = true;
        }
        else if (cells[3].equals(cells[4]) && cells[4].equals(cells[5])) {
            win = true;
        }
        else if (cells[6].equals(cells[7]) && cells[7].equals(cells[8])) {
            win = true;
        }

        return win;
    }

}
