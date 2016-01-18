package com.company.View;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

/**
 * This class displays the game board.
 */

public class BoardLayout extends JFrame {

    private JFrame boardFrame;
    private JPanel mainPanel, statusPanel, buttonPanel;
    private JButton buttons[];
    private JLabel currentPlayerLabel;
    private JLabel currentPlayer;

    public BoardLayout() {
        super();
        createFrame();
    }

    /**
     * This method Creates components and add everything onto the Jframe.
     */

    public void createFrame() {

        boardFrame = new JFrame("Tic Tac Toe");
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        boardFrame.setPreferredSize(new Dimension(screen.width / 2, (int) (screen.height * 0.9)));
        boardFrame.pack();
        boardFrame.setLocationRelativeTo(null);
        boardFrame.setVisible(true);
        boardFrame.setResizable(false);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        mainPanel.setBackground(new Color(22, 103, 0));
        boardFrame.add(mainPanel);

        statusPanel = new JPanel();
        statusPanel.setOpaque(false);

        statusPanel.add(currentPlayerLabel = new JLabel("Current player: "));
        currentPlayerLabel.setForeground (Color.white);
        statusPanel.add(currentPlayer = new JLabel("Display current player's name here"));
        currentPlayer.setForeground (Color.white);
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
        statusPanel.setAlignmentX(CENTER_ALIGNMENT);
        statusPanel.setBorder(new EmptyBorder(20, 20, 0, 20));

        mainPanel.add(statusPanel);

        buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setLayout(new GridLayout(0, 3));
        GridBagConstraints c = new GridBagConstraints();
        mainPanel.add(buttonPanel);
        buttons = new JButton[9];

        int i = 0;
        while (i < 9) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttonPanel.add(buttons[i], c);
            buttons[i].setBackground(new Color(22, 103, 0));
            buttons[i].setOpaque(true);
            buttons[i].setForeground (Color.white);
            i++;
        }

        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttonPanel.setOpaque(false);
        boardFrame.setDefaultCloseOperation(boardFrame.DISPOSE_ON_CLOSE);
    }

//    public void createFrame() {
//        // All kod för att skapa och sätta samman ett fönster (dvs ett JFrame)
//
//        boardPanel.setLayout(null);
//        boardPanel.setBackground(new Color(22, 103, 0));
//        boardFrame.add(boardPanel); // lägger in mainpanel i Jframe
//
//        boardFrame.setSize(1450 / AddPlayerLayout.resolution, 1700 / AddPlayerLayout.resolution);
//        boardFrame.setTitle("Tic Tac Toe");
//        boardFrame.setDefaultCloseOperation(boardFrame.DISPOSE_ON_CLOSE);
//        boardFrame.setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
//        boardFrame.setVisible(true);
//        boardFrame.setResizable(true);
//    }
}
