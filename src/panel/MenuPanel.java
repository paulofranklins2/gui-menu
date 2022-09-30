package panel;

import frame.DefaultFrame;
import frame.MainFrame;

import javax.swing.*;

public class MenuPanel {
    private JButton startGame = new JButton("New Game");
    private JButton scoreGame = new JButton("Score Game");
    private JButton exitGame = new JButton("Exit Game");
    private int buttonWidth = 200;
    private int buttonHeight = 50;

    public JButton getStartGame() {
        startGame.setBounds(200, 200, buttonWidth, buttonHeight);
        startGame.setFocusable(false);
        startGame.addActionListener(e -> {
            System.out.println("Starting Game");
        });
        return startGame;
    }

    public JButton getScoreGame() {
        scoreGame.setBounds(200, 250, buttonWidth, buttonHeight);
        scoreGame.setFocusable(false);
        scoreGame.addActionListener(e -> {
            System.out.println("Scoring Game");
            DefaultFrame.getInstance().dispose();
            new ScorePanel();
            System.out.println("Closing preview Frame");
        });
        return scoreGame;
    }

    public JButton getExitGame() {
        exitGame.setBounds(200, 300, buttonWidth, buttonHeight);
        exitGame.setFocusable(false);
        exitGame.addActionListener(e -> {
            System.out.println("Exiting Game");
            System.exit(0);
        });
        return exitGame;
    }

}
