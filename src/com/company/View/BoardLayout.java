package com.company.View;

import com.company.Controller.MyBoardListener;
import com.company.Controller.MyPlayerListener;
import com.company.Model.*;
import com.company.Model.Button;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

/**
 * This class displays the game board.
 */

public class BoardLayout extends JFrame {

    private JFrame boardFrame;
    private JPanel mainPanel, statusPanel, buttonPanel;
    public static ArrayList<Button> buttons = new ArrayList<>();
    private JLabel currentPlayerLabel;
    private JLabel currentPlayer;
    private MyBoardListener boardListener = new MyBoardListener();


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

        boardFrame.setPreferredSize(new Dimension(screen.width / 3, (int) (screen.height * 0.8)));
        boardFrame.pack();
        boardFrame.setLocationRelativeTo(null);
        boardFrame.setVisible(true);
        boardFrame.setResizable(true);

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

        int i = 0;
        while (i < 9) {
            buttons.add(new Button());
            buttonPanel.add(buttons.get(i).getBoardButton(), c);
            buttons.get(i).getBoardButton().setBackground(new Color(22, 103, 0));
            buttons.get(i).getBoardButton().setOpaque(true);
            buttons.get(i).getBoardButton().setForeground(Color.white);
            buttons.get(i).getBoardButton().addActionListener(boardListener);
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