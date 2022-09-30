package frame;

import lombok.Data;
import settings.ScreenSettings;

import javax.swing.*;
import java.awt.*;

@Data
public class DefaultFrame {

    private static JFrame jFrame;
    private ScreenSettings screenSettings;

    public DefaultFrame() {
        jFrame = new JFrame();
        screenSettings = new ScreenSettings();
        jFrame.setTitle("MyApp");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(screenSettings.getWidth(), screenSettings.getHeight());
        jFrame.getContentPane().setBackground(new Color(13, 83, 72));
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
    }

    public static JFrame getInstance(){
        if(jFrame == null){
            jFrame = new JFrame();
        }
        return jFrame;
    }

}
