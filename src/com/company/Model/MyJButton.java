package com.company.Model;

import com.company.View.BoardLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * Created by jonas on 2016-01-18.
 */
public class MyJButton extends JButton {
    boolean isTaken;

    public MyJButton() {
        isTaken = false;
    }

    public void setIsTaken() throws Exception {
        if (!isTaken) {
            isTaken = true;
        }
        else {
            throw new Exception();
        }
    }
    public boolean getIsTaken() {
        return isTaken;
    }




    public boolean checkIsTaken() {
        return isTaken;
    }
}
