package com.company.Model;


import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by mizuho on 2016-01-27.
 */
public class GameEngine {

    private int currentPlayer = 1;
    private static String[] cells = new String[9];
    private static ArrayList<Player> playerList = new ArrayList<>();
    private boolean win = false;
    private boolean tie = false;
    private static int p1OrP2;



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
        CheckWin();
        System.out.println(win);
    }

    public int togglePlayer() {
        if (currentPlayer == 0){
            currentPlayer = 1;
            BoardLayout.currentPlayer.setText(AddPlayerLayout.rowData[0][0]);
        }
        else {
            currentPlayer = 0;
            BoardLayout.currentPlayer.setText(AddPlayerLayout.rowData[1][0]);
        }
        return currentPlayer;
    }

    public void setText(int myI) {
        int player = togglePlayer();
        BoardLayout.buttons.get(myI).setText(playerList.get(player).getPiece());
        cells[myI] = playerList.get(player).getPiece();
    }

    public boolean CheckHorizontal(){

        int i = 0;

            while (i < 2) {

                if (BoardLayout.buttons.get(0).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(1).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(2).getText().equals(playerList.get(i).getPiece())) {
                    win = true;
                    p1OrP2 = i;
                    break;
                }
                if (BoardLayout.buttons.get(3).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(4).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(5).getText().equals(playerList.get(i).getPiece())) {
                    win = true;
                    p1OrP2 = i;
                    break;
                }
                if (BoardLayout.buttons.get(6).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(7).getText().equals(playerList.get(i).getPiece()) &&
                        BoardLayout.buttons.get(8).getText().equals(playerList.get(i).getPiece())) {
                    win = true;
                    p1OrP2 = i;
                    break;
                }else {
                    win = false;
                }

                i++;
            }
        return win;
    }

    public boolean CheckVertical(){

        int i = 0;

        while (i < 2) {

            if (BoardLayout.buttons.get(0).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(3).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(6).getText().equals(playerList.get(i).getPiece())) {
                win = true;
                p1OrP2 = i;
                break;
            }
            if (BoardLayout.buttons.get(1).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(4).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(7).getText().equals(playerList.get(i).getPiece())) {
                win = true;
                p1OrP2 = i;
                break;
            }
            if (BoardLayout.buttons.get(2).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(7).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(8).getText().equals(playerList.get(i).getPiece())) {
                win = true;
                p1OrP2 = i;
                break;
            }else {
                win = false;
            }

            i++;
        }
        return win;
    }
    public boolean CheckDiagonal(){

        int i = 0;

        while (i < 2) {

            if (BoardLayout.buttons.get(0).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(4).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(8).getText().equals(playerList.get(i).getPiece())) {
                win = true;
                p1OrP2 = i;
                break;
            }
            if (BoardLayout.buttons.get(2).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(4).getText().equals(playerList.get(i).getPiece()) &&
                    BoardLayout.buttons.get(6).getText().equals(playerList.get(i).getPiece())) {
                win = true;
                p1OrP2 = i;
                break;
            }
            else {
                win = false;
            }

            i++;
        }
        return win;
    }

    public boolean CheckTie(){

        int i = 0;
        int j = 0;

        while (i < 9) {
            if (cells[i] == null){
                break;
            }
            else {
                j++;
                if (j == 9){
                    tie = true;
                }
            }
            i++;
        }
        return tie;
    }

    public void CheckWin(){
        if (CheckDiagonal() == true || CheckVertical() == true || CheckHorizontal() == true){
            System.out.println(playerList.get(p1OrP2).getName()+" WIN");
            JOptionPane.showMessageDialog(null, playerList.get(p1OrP2).getName() + " har vunnit!", "", JOptionPane.INFORMATION_MESSAGE);
            Reset();
        }
        else if (CheckTie() == true){
            System.out.println("TIE");
            JOptionPane.showMessageDialog(null, "Oavgjort!", "", JOptionPane.INFORMATION_MESSAGE);
            Reset();

        }

    }

    public void Reset(){
        for (int i = 0; i<9;i++){
            BoardLayout.buttons.get(i).isTaken = false;
            BoardLayout.buttons.get(i).setText(null);
            cells[i] = null;
            System.out.println(cells[i]);
        }

        currentPlayer = 1;
        win = false;
        tie = false;

    }

}
