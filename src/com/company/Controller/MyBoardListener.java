package com.company.Controller;

import com.company.Model.MyJButton;
import com.company.View.AddPlayerLayout;
import com.company.View.BoardLayout;
import com.company.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Observable;

/**
 * Created by jonas on 2016-01-18.
 */
public class MyBoardListener extends Observable implements ActionListener {

    public static MyBoardListener myObservable = new MyBoardListener();

    @Override
    public void actionPerformed(ActionEvent e) {

        int index = BoardLayout.buttons.indexOf( e.getSource() );
        myObservable.setChanged();
        myObservable.notifyObservers(index);


        /*if (e.getSource() == BoardLayout.buttons.get(1)){
            System.out.println("funkar");
            myObservable.setChanged();
            myObservable.notifyObservers();
            int indx = BoardLayout.buttons.indexOf( e.getSource() );
            System.out.println(indx);

        }
        if (e.getSource() == BoardLayout.buttons.get(0)){
            System.out.println("funkar");
            myObservable.setChanged();
            myObservable.notifyObservers();
            System.out.println(e.getID());
            int indx = BoardLayout.buttons.indexOf( e.getSource() );
            System.out.println(indx);

        }
*/
    }

}
