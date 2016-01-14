package com.company.View;

import javax.swing.*;
import java.awt.*;

/**
 * This is the class that displays the first layout,
 * this layout is used to add players.
 */
public class BoardLayout extends JFrame {

    public static JFrame boardFrame = new JFrame();
    public static JPanel boardPanel = new JPanel();
    public BoardLayout() {
        super();
        createFrame();
    }

    /**
     * This method Creates a panel and creates and adding all
     * the components into it, and then adds the panel to the Jframe.
     */
    public void createFrame() {
        // All kod för att skapa och sätta samman ett fönster (dvs ett JFrame)

        boardPanel.setLayout(null);
        boardPanel.setBackground(new Color(22, 103, 0));
        boardFrame.add(boardPanel); // lägger in mainpanel i Jframe

        boardFrame.setSize(1450 / AddPlayerLayout.resolution, 1700 / AddPlayerLayout.resolution);
        boardFrame.setTitle("Tic Tac Toe");
        boardFrame.setDefaultCloseOperation(boardFrame.DISPOSE_ON_CLOSE);
        boardFrame.setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
        boardFrame.setVisible(true);
        boardFrame.setResizable(true);
    }
}



