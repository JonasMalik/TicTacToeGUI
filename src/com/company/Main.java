package com.company;

import com.company.Controller.MyBoardListener;
import com.company.Model.Mark;
import com.company.Model.Player;
import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;

public class Main extends MyBoardListener {

    public static void main(String[] args) {
//        new AddPlayerLayout();

        // Player creation test
        Player p1 = new Player("Meow", Mark.CIRCLE.getSymbol());
        System.out.println("p1 Name: " + p1.getName());
        System.out.println("p1 Piece: " + p1.getPiece());

        Player p2 = new Player("Purrr", Mark.CROSS.getSymbol());
        System.out.println("p2 Name: " + p2.getName());
        System.out.println("p2 Piece: " + p2.getPiece());

        MyBoardListener.myObservable.addObserver(BoardLayout.getInstance()); // observer

        //  new MyBoardListener(); // observable
        //boardListener.addObserver(bl);

    }
}
