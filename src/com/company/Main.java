package com.company;

import com.company.Controller.MyBoardListener;
import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import javax.swing.*;

public class Main extends MyBoardListener {

    public static void main(String[] args) {

        //new AddPlayerLayout();

        MyBoardListener.myObservable.addObserver(BoardLayout.getInstance()); // observer

      //  new MyBoardListener(); // observable
        //boardListener.addObserver(bl);
    }
}
