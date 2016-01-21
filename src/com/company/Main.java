package com.company;

import com.company.Controller.MyBoardListener;
import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //new AddPlayerLayout();
        BoardLayout bl = new BoardLayout(); // observer
        MyBoardListener boardListener = new MyBoardListener(); // observable
        boardListener.addObserver(bl);
    }
}
