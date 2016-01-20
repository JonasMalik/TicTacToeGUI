package com.company.Controller;

import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Observable;

/**
 * Created by jonas on 2016-01-18.
 */
public class MyBoardListener extends Observable implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

//        for (int i = 0; i < 9; i++) {
//            JButton jb = BoardLayout.buttons.get(i).getBoardButton();
//            if (e.getSource() != jb) {
//                continue;
//            } else {
//                setChanged();
//                notifyObservers();
//            }
//        }
        if (e.getSource() == BoardLayout.buttons.get(0).getBoardButton()) {
            System.out.println("1st cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(1).getBoardButton()) {
            System.out.println("2nd cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(2).getBoardButton()) {
            System.out.println("3rd cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(3).getBoardButton()) {
            System.out.println("4th cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(4).getBoardButton()) {
            System.out.println("5thd cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(5).getBoardButton()) {
            System.out.println("6th cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(6).getBoardButton()) {
            System.out.println("7th cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(7).getBoardButton()) {
            System.out.println("8th cell clicked.");
            setChanged();
            notifyObservers();

        } else if (e.getSource() == BoardLayout.buttons.get(8).getBoardButton()) {
            System.out.println("9th cell clicked.");
            setChanged();
            notifyObservers();
        }
    }
}
