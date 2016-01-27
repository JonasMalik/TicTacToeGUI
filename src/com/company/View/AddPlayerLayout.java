package com.company.View;
import java.awt.Toolkit;

    import com.company.Controller.MyPlayerListener;

    import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

    /**
     * This is the class that displays the first layout,
     * this layout is used to add players.
     */
    public class AddPlayerLayout extends JFrame {

        public static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        public static int playersPossible = 2;

        public static String rowData[][] = new String[playersPossible][1];
        public static String columnNames[] = { "" };
        public static JPanel mainPanel = new JPanel();
        public static MyPlayerListener playerButtonListener = new MyPlayerListener();
        public static JFrame playerFrame = new JFrame();
        public static JTable addTable = new JTable(rowData, columnNames);
        public static JTextField input = new JTextField();
        public static JButton addPlayer = new JButton();
        public static JButton startTheGame = new JButton();
        public static JLabel inputText = new JLabel();
        public static JLabel tableText = new JLabel();
        public static JLabel playerCounter = new JLabel();
        public static int resolution = 2;
        public static int frameWidth = screen.width / 2;
        public static int frameheight = (int) (screen.height* 0.8);

        /**
         * This method call a constructor from the super class and
         * then start the method to create a frame.
         */
        public AddPlayerLayout() {
            super();
            createFrame();
        }

        /**
         * This method Creates a panel and creates and adding all
         * the components into it, and then adds the panel to the Jframe.
         */
        public void createFrame() {
            // All kod för att skapa och sätta samman ett fönster (dvs ett JFrame)

            mainPanel.setLayout(null);



            mainPanel.setBackground(new Color(22, 103, 0));
            playerFrame.add(mainPanel); // lägger in mainpanel i Jframe

            inputText.setText("Namn på spelare:");
            inputText.setFont(new Font("", Font.CENTER_BASELINE, screen.width/60));
            inputText.setOpaque(false);
            inputText.setBounds((int) (frameWidth*0.1), (int) (frameheight*0.05), (int) (frameWidth*0.4), (int) (frameheight*0.05));
            mainPanel.add(inputText, BorderLayout.PAGE_START);

            input.setFont(new Font("", Font.CENTER_BASELINE, screen.width/50));
            input.setBounds((int) (frameWidth * 0.1), (int) (frameheight * 0.1), (int) (frameWidth * 0.78), (int) (frameheight * 0.1));
            input.setText("");
            input.setBackground(Color.WHITE);
            input.setMargin(new Insets(0, 0, 0, 0));
            mainPanel.add(input, BorderLayout.PAGE_START);
            input.setAlignmentX(Component.CENTER_ALIGNMENT);


            addPlayer.setBounds((int) (frameWidth * 0.7), (int) (frameheight * 0.22), (int) (frameWidth * 0.18), (int) (frameheight * 0.05));
            addPlayer.setFont(new Font("", Font.CENTER_BASELINE, (int) (frameheight*0.027)));
            addPlayer.setAlignmentX(Component.CENTER_ALIGNMENT);
            addPlayer.setText("Lägg till");
            addPlayer.addActionListener(playerButtonListener);
            mainPanel.add(addPlayer);

            tableText.setBounds((int) (frameWidth*0.1), (int) (frameheight*0.32), (int) (frameWidth*0.7), (int) (frameheight*0.05));
            tableText.setText("Namn på tillagda spelare:");
            tableText.setFont(new Font("", Font.CENTER_BASELINE, screen.width/60));
            mainPanel.add(tableText);

            addTable.setRowHeight((int) (frameheight*0.1)); // höjd på raderna
            addTable.setBounds((int) (frameWidth * 0.1), (int) (frameheight * 0.37), (int) (frameWidth * 0.78), (int) (frameheight * 0.2));
            addTable.setFont(new Font("", Font.CENTER_BASELINE, screen.width/60)); // font och storlek
            addTable.setBackground(Color.WHITE); // bakgrund
            addTable.setBorder(BorderFactory.createLineBorder(Color.BLACK, (int) (frameheight*0.001))); // HERE
            mainPanel.add(addTable);

            playerCounter.setBounds((int) (frameWidth * 0.85), (int) (frameheight * 0.57), (int) (frameWidth * 0.18), (int) (frameheight * 0.05));
            playerCounter.setText("0/"+playersPossible);
            playerCounter.setFont(new Font("", Font.CENTER_BASELINE, (int) (frameWidth*0.02)));
            mainPanel.add(playerCounter);

            startTheGame.setBounds((int) (frameWidth * 0.1), (int) (frameheight * 0.8), (int) (frameWidth * 0.78), (int) (frameheight * 0.1));
            startTheGame.setFont(new Font("", Font.CENTER_BASELINE, screen.width/50));
            startTheGame.setText("Starta spelet!");
            startTheGame.setEnabled(false);
            startTheGame.addActionListener(playerButtonListener);
            mainPanel.add(startTheGame, BorderLayout.PAGE_END);


            playerFrame.add(mainPanel);
            mainPanel.setBackground(Color.red);
            mainPanel.setOpaque(true);

            mainPanel.setBackground(new Color(22, 103, 0));
            mainPanel.setOpaque(true);
            mainPanel.setBorder(new EmptyBorder(100,100,100,100));

            playerFrame.setPreferredSize(new Dimension(frameWidth, frameheight));
            playerFrame.setTitle("Tic Tac Toe");
            playerFrame.setDefaultCloseOperation(playerFrame.DISPOSE_ON_CLOSE);
            playerFrame.setVisible(true);
            playerFrame.setResizable(false);
            playerFrame.pack();
            playerFrame.setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
        }
    }



