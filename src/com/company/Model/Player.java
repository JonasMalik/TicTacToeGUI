package com.company.Model;

import javax.swing.*;

/**
 * Created by jonas on 2016-01-13.
 */
public class Player {

    String name;
    String piece;
    int wins;

    public Player(String name, String piece){
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public String getPiece() {
        return piece;
    }
}


