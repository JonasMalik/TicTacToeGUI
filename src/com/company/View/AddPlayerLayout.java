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

        public static int playersPossible = 2;

        public static String rowData[][] = new String[playersPossible][1];
        public static String columnNames[] = { "" };
        public static JPanel playerPanel = new JPanel();
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

            mainPanel.setLayout(new BorderLayout());

            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            playerPanel.setLayout(new BoxLayout(playerPanel, BoxLayout.Y_AXIS));
            playerPanel.setBackground(new Color(22, 103, 0));
            playerFrame.add(playerPanel); // lägger in mainpanel i Jframe

            inputText.setText("Namn på spelare:");
            inputText.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            playerPanel.add(inputText);

            input.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            input.setText("  ");
//            input.setBorder(new EmptyBorder(100, 100,100, 100));
//            input.setPreferredSize(new Dimension(100,100));
            input.setBackground(Color.BLUE);
//            input.setBorder(new EmptyBorder(110, 110, 110, 110));
//            input.setPreferredSize(new Dimension(screen.width / 6, (int) (screen.height * 0.1)));
            input.setMaximumSize(new Dimension(100,100));
            playerPanel.add(input);

            addPlayer.setPreferredSize(new Dimension(screen.width / 6, (int) (screen.height * 0.1)));
            addPlayer.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution));
            addPlayer.setText("Lägg till");
            addPlayer.addActionListener(playerButtonListener);
            playerPanel.add(addPlayer);

            tableText.setText("Namn på tillagda spelare:");
            tableText.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            playerPanel.add(tableText);

            addTable.setRowHeight(100 / resolution); // höjd på raderna
            addTable.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution)); // font och storlek
            addTable.setBackground(Color.WHITE); // bakgrund
            addTable.setBorder(BorderFactory.createLineBorder(Color.BLACK,5/resolution)); // HERE
            playerPanel.add(addTable);

            playerCounter.setText("0/"+playersPossible);
            playerCounter.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution));
            playerPanel.add(playerCounter);

            startTheGame.setPreferredSize(new Dimension(screen.width / 6, (int) (screen.height * 0.1)));
            startTheGame.setFont(new Font("", Font.CENTER_BASELINE, 40/resolution));
            startTheGame.setText("Starta spelet!");
            startTheGame.setEnabled(false);
            startTheGame.addActionListener(playerButtonListener);
            playerPanel.add(startTheGame);

            playerFrame.add(mainPanel);
            playerPanel.setBackground(Color.red);
            playerPanel.setOpaque(true);

            mainPanel.setBackground(Color.yellow);
            mainPanel.setOpaque(true);
            mainPanel.setBorder(new EmptyBorder(100,100,100,100));

            mainPanel.add(playerPanel);


            playerFrame.setPreferredSize(new Dimension(screen.width / 2, (int) (screen.height * 0.9)));
            playerFrame.setTitle("Tic Tac Toe");
            playerFrame.setDefaultCloseOperation(playerFrame.DISPOSE_ON_CLOSE);
            playerFrame.setVisible(true);
            playerFrame.setResizable(true);
            playerFrame.pack();
            playerFrame.setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen

        }

    }



