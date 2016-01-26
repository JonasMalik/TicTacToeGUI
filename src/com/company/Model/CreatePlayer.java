package com.company.Model;

import com.company.View.AddPlayerLayout;

import java.util.ArrayList;

/**
 * Created by jonas on 2016-01-26.
 */
public class CreatePlayer {

    private ArrayList<Player> playerList = new ArrayList<>();

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
}
