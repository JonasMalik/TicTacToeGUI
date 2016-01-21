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

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public MyJButton() {
        isTaken = false;
    }

    public boolean checkIsTaken() {
        return isTaken;
    }
}
