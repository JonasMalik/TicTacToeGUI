package com.company.View;

import com.company.Controller.MyBoardListener;
import com.company.Controller.MyPlayerListener;
import com.company.Model.*;
import com.company.*;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

import java.util.Observable;
import java.util.Observer;

/**
 * This class displays the game board.
 */
public class BoardLayout extends JFrame implements Observer {
    private JFrame boardFrame;
    private JPanel mainPanel, statusPanel, buttonPanel;
    public static ArrayList<MyJButton> buttons = new ArrayList<>();
    private JLabel currentPlayerLabel;
    private JLabel currentPlayer;
    private static MyBoardListener boardListener = new MyBoardListener();
    private JButton jb;
    private static BoardLayout instance = new BoardLayout(); // Singleton. Create and initiate instance here
    GameEngine gameEngine = new GameEngine();

    private BoardLayout() { // Cannot access the constructor from outside. Prevents multiple-object creation.
        super();
        createFrame();
    }

    public static BoardLayout getInstance() { // Singleton. Returns always the same instance
        return instance;
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

        boardFrame.setPreferredSize(new Dimension(screen.width / 2, (int) (screen.height * 0.8)));
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
        currentPlayerLabel.setForeground(Color.white);
        statusPanel.add(currentPlayer = new JLabel("Display current player's name here"));
        currentPlayer.setForeground(Color.white);
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
            buttons.add(new MyJButton());
            jb = buttons.get(i);
            buttonPanel.add(jb, c);
            jb.setBackground(new Color(22, 103, 0));
            jb.setOpaque(true);
            jb.setForeground(Color.white);
            jb.addActionListener(boardListener);
            i++;
        }

        buttonPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttonPanel.setOpaque(false);
        boardFrame.setDefaultCloseOperation(boardFrame.DISPOSE_ON_CLOSE);
    }



    @Override
    public void update(Observable o, Object index) {

        int newIndex = (Integer)index;
        System.out.println(index);
        try {
            buttons.get(newIndex).setIsTaken();
            gameEngine.Play(newIndex);
        } catch (Exception e){
            System.out.println("redan tagen");
        }

    }



}
