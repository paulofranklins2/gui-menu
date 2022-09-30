package frame;

import lombok.Data;
import panel.MenuPanel;

import javax.swing.*;

@Data
public class MainFrame {
    private DefaultFrame defaultFrame;

    public MainFrame() {
//        DefaultFrame defaultFrame = new DefaultFrame();
        this.defaultFrame = new DefaultFrame();
        defaultFrame.getScreenSettings();

        DefaultFrame.getInstance().add(new MenuPanel().getStartGame());
        DefaultFrame.getInstance().add(new MenuPanel().getScoreGame());
        DefaultFrame.getInstance().add(new MenuPanel().getExitGame());
    }
}
