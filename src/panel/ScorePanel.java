package panel;

import frame.DefaultFrame;

import javax.swing.*;

public class ScorePanel {
    JButton jButton = new JButton("Test Panel");

    private DefaultFrame defaultFrame;

    public ScorePanel() {
        this.defaultFrame = new DefaultFrame();
        DefaultFrame.getInstance().add(test());
    }

    public JButton test() {
        jButton.setBounds(200, 250, 200, 50);
        jButton.setFocusable(false);
        jButton.addActionListener(e -> {
            System.out.println("Getting there...");
        });
        return jButton;
    }
}
