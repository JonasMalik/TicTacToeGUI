package com.company.Model;

import javax.swing.*;
import java.util.Observable;

/**
 * Created by jonas on 2016-01-18.
 */
public class Button extends Observable {
    private boolean isTaken = false;
    private JButton boardButton = new JButton();

    public JButton getBoardButton() {
        return boardButton;
    }
}
