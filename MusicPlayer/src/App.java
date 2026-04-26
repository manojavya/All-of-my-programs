import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("Music Player");
        

        Player player = new Player();
        frame.setVisible(true);
    }
}