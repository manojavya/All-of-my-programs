import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        new App().maingui();
    }

    public void maingui() {
        JFrame frame = new JFrame("Hash Converter");
        frame.setBounds(0, 0, 600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hash Converter");
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 200);
        panel.setLayout(null);

        JTextField hashinput = new JTextField();
        hashinput.setBounds(10, 10, 500, 30);
        hashinput.setText("Enter your text here and we will convert it into hash!");
        panel.add(hashinput);

        JButton convert = new JButton("Convert to hash");
        convert.setBounds(520, 10, 150, 30);
        convert.addActionListener(e -> {
            String inputText = hashinput.getText();
            String hash = HashConverter.convertToHash(inputText);
            JOptionPane.showMessageDialog(frame, "Hash: " + hash, "Warning this cannot be reversed \n the hash will be stored in a file", JOptionPane.WARNING_MESSAGE);
            ProcessBuilder convertintohash = new ProcessBuilder("echo -n " + inputText + " | sha256sum");
            convertintohash.redirectErrorStream(true);
            try {
                Process process = convertintohash.start();
                process.waitFor();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        panel.setVisible(true);
        frame.setVisible(true);
        frame.add(panel);
    }
}
