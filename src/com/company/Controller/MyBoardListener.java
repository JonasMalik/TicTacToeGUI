package com.company.Controller;

import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Observable;

/**
 * Created by jonas on 2016-01-18.
 */
public class MyBoardListener extends Observable implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BoardLayout.buttons.get(0).getBoardButton()) {
            System.out.println("WORK");
            setChanged();
            notifyObservers();
        }
        else if (e.getSource() == BoardLayout.buttons.get(1).getBoardButton()) {
            System.out.println("WORK1");
        }
        else {
            System.out.println("NOT WORKING");
        }
    }
}
