package com.company.View;

    import javax.swing.*;
    import java.awt.*;

    /**
     * This is the class that displays the first layout,
     * this layout is used to add players.
     */
    public class AddPlayerLayout extends JFrame {

        static int playersPossible = 2;

        static String rowData[][] = new String[playersPossible][1];
        static String columnNames[] = { "" };
        static JPanel playerPanel = new JPanel();
      //  static MyPlayerListener playerButtonListener = new MyPlayerListener();
        static JFrame playerFrame = new JFrame();
        static JTable addTable = new JTable(rowData, columnNames);
        static JTextField input = new JTextField();
        static JButton addPlayer = new JButton();
        static JButton startTheGame = new JButton();
        static JLabel inputText = new JLabel();
        static JLabel tableText = new JLabel();
        static JLabel playerCounter = new JLabel();
        static int resolution = 3;


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


            playerPanel.setLayout(null);
            playerPanel.setBackground(new Color(22, 103, 0));
            playerFrame.add(playerPanel); // lägger in mainpanel i Jframe

            inputText.setText("Namn på spelare:");
            inputText.setBounds(325/resolution, 220/resolution, 800/resolution, 100/resolution);
            inputText.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            playerPanel.add(inputText);

            tableText.setText("Namn på tillagda spelare:");
            tableText.setBounds(325/resolution, 480/resolution, 800/resolution, 100/resolution);
            tableText.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            playerPanel.add(tableText);

            playerCounter.setText("0/"+playersPossible);
            playerCounter.setBounds(1045/resolution,1130/resolution,100/resolution,100/resolution );
            playerCounter.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution));
            playerPanel.add(playerCounter);

            addTable.setRowHeight(100); // höjd på raderna
            addTable.setBounds(325/resolution,560/resolution,800/resolution,100*playersPossible/resolution); // possition och storlek
            addTable.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution)); // font och storlek
            addTable.setBackground(Color.WHITE); // bakgrund
            addTable.setBorder(BorderFactory.createLineBorder(Color.BLACK,5/resolution)); // HERE
            playerPanel.add(addTable);

            input.setBounds(325/resolution,300/resolution,800/resolution,100/resolution);
            input.setFont(new Font("", Font.CENTER_BASELINE, 50/resolution));
            input.setText("  ");
            playerPanel.add(input);

            addPlayer.setBounds(925/resolution, 410/resolution, 200/resolution, 50/resolution);
            addPlayer.setFont(new Font("", Font.CENTER_BASELINE, 30/resolution));
            addPlayer.setText("Lägg till");
          //  addPlayer.addActionListener(playerButtonListener);
            playerPanel.add(addPlayer);

            startTheGame.setBounds(325/resolution, 1250/resolution, 800/resolution, 100/resolution);
            startTheGame.setFont(new Font("", Font.CENTER_BASELINE, 40/resolution));
            startTheGame.setText("Starta spelet!");
            startTheGame.setEnabled(false);
           // startTheGame.addActionListener(playerButtonListener);
            playerPanel.add(startTheGame);

            playerFrame.setSize(1450/resolution, 1700/resolution);
            playerFrame.setTitle("Yatzy");
            playerFrame.setDefaultCloseOperation(playerFrame.DISPOSE_ON_CLOSE);
            playerFrame.setLocationRelativeTo(null); //Centrerar fönstret mitt på skärmen
            playerFrame.setVisible(true);
            playerFrame.setResizable(true);

        }

    }



