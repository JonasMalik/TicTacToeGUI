package com.company;

import com.company.Controller.MyBoardListener;
import com.company.Model.GameEngine;
import com.company.Model.Mark;
import com.company.Model.Player;
import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;

public class Main extends MyBoardListener {

    public static void main(String[] args) {
        new AddPlayerLayout();
       // MyBoardListener.myObservable.addObserver(BoardLayout.getInstance());
    }
}
