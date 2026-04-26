import javax.swing.*;
import java.awt.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame mainframe = new JFrame();
        mainframe.setTitle("Neofetch GUI");
        mainframe.setSize(1000, 1000);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setResizable(true);
        mainframe.setVisible(true);

        JPanel outarea = new JPanel();
        outarea.setLayout(null);

        JTextArea area = new JTextArea();
        area.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        area.setEditable(false);
        area.setBounds(0, 0, 900, 800);
        outarea.add(area);

        ProcessBuilder neofetch = new ProcessBuilder("neofetch", "--bold", "off", "--color_blocks", "off");
        neofetch.environment().put("TERM", "dumb");
        Process runneofetch = neofetch.start();
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(runneofetch.getInputStream()));
            String line;
            while((line = read.readLine()) != null){
                line = line.replaceAll("\u001B\\[[;\\d]*m", "");
                System.out.println(line);
                area.append(line + "/n");
            }
            runneofetch.waitFor();
        }
        catch(IOException | InterruptedException ex) {
            System.out.println("An error occured: " + ex);
        }
        
        JButton refresh = new JButton("Refresh");
        refresh.setBounds(1000, 900, 190, 30);
        outarea.add(refresh);

        mainframe.add(outarea);
    }
}
