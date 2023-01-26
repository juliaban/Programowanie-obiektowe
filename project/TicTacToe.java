import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.Timer;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    Timer timer = new Timer();
    boolean tie = true;;
    boolean playerOneTurn;
    int turns = 0;

    TicTacToe() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setTitle("TIC TAC TOE");

        textField.setBackground(new Color(50, 50, 50));
        textField.setForeground(new Color(3, 219, 252));
        textField.setFont(new Font("Monospaced", Font.BOLD, 70));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC TAC TOE ...");
        textField.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(50, 50, 50));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        titlePanel.add(textField);
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (playerOneTurn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0, 0, 0));
                        buttons[i].setText("X");
                        turns++;
                        playerOneTurn = false;
                        textField.setText("O TURN");
                        check();
                    }
                }
                if (buttons[i].getText() == "") {
                    buttons[i].setForeground(new Color(0, 0, 0));
                    buttons[i].setText("O");
                    turns++;
                    playerOneTurn = true;
                    textField.setText("X TURN");
                    check();
                }
            }
        }
    }

    public void firstTurn() {
        turns=0;

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (random.nextInt(2) == 0) {
                    playerOneTurn = true;
                    textField.setText("X TURN");
                } else {
                    playerOneTurn = false;
                    textField.setText("O TURN");
                }
                for (int i = 0; i < 9; i++) {
                    buttons[i].setEnabled(true);
                }
            }
        }, 3000);
    }

    public void check() {
        tie = true;

        if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
            xWins(0, 1, 2);
            tie = false;
        }
        if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
            oWins(0, 1, 2);
            tie = false;
        }
        if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
            xWins(3, 4, 5);
            tie = false;
        }
        if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
            oWins(3, 4, 5);
            tie = false;
        }
        if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
            xWins(6, 7, 8);
            tie = false;
        }
        if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
            oWins(6, 7, 8);
            tie = false;
        }
        if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
            xWins(0, 4, 8);
            tie = false;
        }
        if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
            oWins(0, 4, 8);
            tie = false;
        }
        if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
            xWins(2, 4, 6);
            tie = false;
        }
        if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
            oWins(2, 4, 6);
            tie = false;
        }
        if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
            xWins(0, 3, 6);
            tie = false;
        }
        if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
            oWins(0, 3, 6);
            tie = false;
        }
        if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
            xWins(1, 4, 7);
            tie = false;
        }
        if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
            oWins(1, 4, 7);
            tie = false;
        }
        if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
            xWins(2, 5, 8);
            tie = false;
        }
        if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
            oWins(2, 5, 8);
            tie = false;
        }
        if (tie && turns == 9) {
            draw();
        }
    }

    public void xWins(int a, int b, int c) {

        buttons[a].setBackground(Color.green);
        buttons[a].setBackground(Color.green);
        buttons[a].setOpaque(true);

        buttons[b].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[b].setOpaque(true);

        buttons[c].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        buttons[c].setOpaque(true);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textField.setText("X WINS THE GAME!");
        resetting();
    }

    public void oWins(int a, int b, int c) {

        buttons[a].setBackground(Color.green);
        buttons[a].setBackground(Color.green);
        buttons[a].setOpaque(true);

        buttons[b].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[b].setOpaque(true);

        buttons[c].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        buttons[c].setOpaque(true);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textField.setText("O WINS THE GAME!");
        resetting();
    }

    public void draw() {

        textField.setText("DRAW, TRY AGAIN !");

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        resetting();
    }

    public void resetting() {

        firstTurn();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    buttons[i].setEnabled(true);
                    buttons[i].setText("");
                    buttons[i].setBackground(null);
                }
            }
        }, 3000);

    }
}
