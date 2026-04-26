import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame mainframe = new JFrame();
        mainframe.setBounds(100, 100, 800, 600);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setTitle("MineBoxx");
        mainframe.setFont(new Font("cursive", Font.PLAIN, 20));
        mainframe.add(new ChatPanel());
        mainframe.setVisible(true);

    }
}
