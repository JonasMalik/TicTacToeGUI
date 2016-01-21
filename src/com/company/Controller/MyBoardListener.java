package com.company.Controller;

import com.company.Model.MyJButton;
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
        System.out.println("clicked!!!");
//        MyJButton jb = (MyJButton) e.getSource(); // get the button clicked
        setChanged();
        notifyObservers();
    }
}
