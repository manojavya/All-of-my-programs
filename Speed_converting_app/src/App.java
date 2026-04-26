import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.sound.sampled.*;
import java.io.File;


public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    public App() {

        JFrame Mainframe = new JFrame();
        Mainframe.setTitle("Speed Converter");
        Mainframe.setSize(500, 200);
        Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mainframe.setResizable(false);

        ImageIcon icon = new ImageIcon("icon.png"); 
        Mainframe.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(null); 
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        JLabel label = new JLabel("Enter Speed in km/h: ");
        label.setBounds(10, 10, 150, 20); // x, y, width, height
        panel.add(label);

        JTextField kmhr = new JTextField();
        kmhr.setBounds(170, 10, 100, 20); // x, y, width, height
        panel.add(kmhr);

        JLabel result = new JLabel("Result in m/s: ");
        result.setBounds(10, 40, 300, 20); // x, y, width, height
        panel.add(result);

        JButton button = new JButton("Convert to m/s");
        button.setBounds(300, 10, 150, 20); // x, y, width, height
        button.setToolTipText("Click to convert speed to m/s");
        panel.add(button);

        button.addActionListener(e -> {
            try {
                double speedKmHr = Double.parseDouble(kmhr.getText());
                double speedMs = speedKmHr / 3.6;
                result.setText("Result in m/s: " + String.format("%.2f", speedMs));
            } catch (NumberFormatException ex) {
                result.setText("Error in input. Please enter a number.");
            }
        });

        JLabel label1 = new JLabel("Enter speed in m/s: ");
        label1.setBounds(10, 70, 150, 20); // x, y, width, height
        panel.add(label1);

        JTextField ms = new JTextField();
        ms.setBounds(170, 70, 100, 20); // x, y, width, height
        panel.add(ms);

        JButton button1 = new JButton("Convert to km/h");
        button1.setBounds(300, 70, 150, 20); // x, y, width, height
        button1.setToolTipText("Click to convert speed to km/h");
        panel.add(button1);

        JLabel result1 = new JLabel("Result in km/h: ");
        result1.setBounds(10, 100, 300, 20); // x, y, width, height
        panel.add(result1);

        button1.addActionListener(e -> {
            try {
                double speedMs = Double.parseDouble(ms.getText());
                double speedKmHr = speedMs * 3.6;
                result1.setText("Result in km/h: " + String.format("%.2f", speedKmHr));
            } catch (NumberFormatException ex) {
                result1.setText("Error in input. Please enter a number.");
            }
        });

        JButton clear = new JButton("Clear");
        clear.setBounds(10, 130, 100, 20); // x, y, width, height
        clear.setToolTipText("Click to clear all fields");
        panel.add(clear);

        clear.addActionListener(e -> {
            kmhr.setText("");
            ms.setText("");
            result.setText("Result in m/s: ");
            result1.setText("Result in km/h: ");
        });

        JButton exit = new JButton("Exit");
        exit.setBounds(120, 130, 100, 20); // x, y, width, height
        exit.setToolTipText("Click to exit the application");
        panel.add(exit);

        exit.addActionListener(e -> {
            System.exit(0);
        });

        JButton Help = new JButton("Help");
        Help.setBounds(230, 130, 100, 20); // x, y, width, height
        Help.setToolTipText("Click for help IDK what help you need in this simple app");
        panel.add(Help);

        Help.addActionListener(e -> {
        JOptionPane.showMessageDialog(Mainframe, "This is a simple speed converter application. If you cant figure out how to use this simple app well you are clearly dumb.", "Help", JOptionPane.INFORMATION_MESSAGE);
        });

        JButton Discord = new JButton("Discord");
        Discord.setBounds(340, 130, 100, 20); // x, y, width, height
        panel.add(Discord);
        Discord.setToolTipText("Join our discord server for more help and support.");
        Discord.addActionListener(e -> {
            JOptionPane.showMessageDialog(Mainframe, "Join our discord server for more help and support. https://discord.gg/W6R657XwtX", "Discord", JOptionPane.INFORMATION_MESSAGE);
        });

        JButton settings = new JButton();
        settings.setBounds(450, 100, 50, 50); // x, y, width, height
        settings.setToolTipText("Settings");
        ImageIcon settingsIcon = new ImageIcon("settings.png");
        Image img = settingsIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        settings.setIcon(new ImageIcon(img)); // Use setIcon() instead of setIconImage()

        settings.addActionListener(e -> {
            // Create a new JFrame for the settings panel
            JFrame settingsFrame = new JFrame("Settings");
            settingsFrame.setSize(400, 300);
            settingsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the settings window
            settingsFrame.setResizable(false);

            // Create the settings panel
            JPanel settingsPanel = new JPanel();
            settingsPanel.setLayout(null);

            // Create a JTabbedPane
            JTabbedPane tabbedPane = new JTabbedPane();
            tabbedPane.setBounds(10, 10, 360, 240); // Set bounds for the tabbed pane

             // Create tabs
            JPanel generalTab = new JPanel();
            generalTab.setLayout(null);
            JLabel generalLabel = new JLabel("General Settings");
            
            JRadioButton darkMode = new JRadioButton("Dark Mode");
            darkMode.addActionListener(e1 -> {
                darkMode.setBackground(java.awt.Color.BLACK);
                panel.setBackground(java.awt.Color.BLACK);
                settingsFrame.setBackground(java.awt.Color.BLACK);
                generalTab.setBackground(java.awt.Color.BLACK);
                generalLabel.setForeground(java.awt.Color.WHITE);
                settings.setForeground(java.awt.Color.WHITE);
                label.setForeground(java.awt.Color.WHITE);
                kmhr.setForeground(java.awt.Color.BLACK);
                result.setForeground(java.awt.Color.WHITE);
                button.setForeground(java.awt.Color.BLACK);
                label1.setForeground(java.awt.Color.WHITE);
                ms.setForeground(java.awt.Color.BLACK);
                result1.setForeground(java.awt.Color.WHITE);
                button1.setForeground(java.awt.Color.BLACK);
                clear.setForeground(java.awt.Color.BLACK);
                exit.setForeground(java.awt.Color.BLACK);
                Help.setForeground(java.awt.Color.BLACK);
                Discord.setForeground(java.awt.Color.BLACK);
                darkMode.isSelected(); 

                JLabel warning = new JLabel("Warning: Dark mode is still under development...");
                warning.setBounds(10, 150, 305, 20);
                warning.setForeground(java.awt.Color.RED);
                generalTab.add(warning);

                
            });
            darkMode.setBounds(10, 40, 150, 20);

            
            JRadioButton lightMode = new JRadioButton("Light Mode");
            lightMode.addActionListener(e1 -> {
                panel.setBackground(java.awt.Color.WHITE);//
                settingsFrame.setBackground(java.awt.Color.WHITE);//
                generalTab.setBackground(java.awt.Color.WHITE);//
                generalLabel.setForeground(java.awt.Color.BLACK);
                settings.setForeground(java.awt.Color.BLACK);
                label.setForeground(java.awt.Color.BLACK);
                kmhr.setForeground(java.awt.Color.BLACK);//
                result.setForeground(java.awt.Color.BLACK);
                button.setForeground(java.awt.Color.BLACK);//
                label1.setForeground(java.awt.Color.BLACK);
                ms.setForeground(java.awt.Color.BLACK);//
                result1.setForeground(java.awt.Color.BLACK);
                button1.setForeground(java.awt.Color.BLACK);//
                clear.setForeground(java.awt.Color.BLACK);//
                exit.setForeground(java.awt.Color.BLACK);//
                Help.setForeground(java.awt.Color.BLACK);//
                Discord.setForeground(java.awt.Color.BLACK);//
                lightMode.isSelected();

            });
            lightMode.setBounds(10, 70, 150, 20);

            JButton Playmusic = new JButton("Play Music");
            Playmusic.setBounds(10, 100, 150, 20);
            Playmusic.addActionListener(e1 -> {
                try {
                    // Load the audio file (WAV format)
                    File audioFile = new File("n.wav"); // Ensure the file is in the correct location
                    if (!audioFile.exists()) {
                        throw new Exception("Audio file not found: " + audioFile.getAbsolutePath());
                }

                AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
                Clip music = AudioSystem.getClip();
                music.open(audioStream);
                music.start(); // Start playing the music
                music.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music continuously (optional)
                } catch (UnsupportedAudioFileException ex) {
                    JOptionPane.showMessageDialog(settingsFrame, "Unsupported audio file format.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (LineUnavailableException ex) {
                    JOptionPane.showMessageDialog(settingsFrame, "Audio line unavailable.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(settingsFrame, "Error playing audio: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
            generalTab.add(Playmusic);

            JButton exitsettingsmenu = new JButton("Exit Settings Menu");
            exitsettingsmenu.setBounds(10, 130, 150, 20);
            exitsettingsmenu.addActionListener(e1 -> {
                settingsFrame.dispose();
            });
            
            generalTab.add(lightMode);
            generalTab.add(darkMode);
            generalTab.add(exitsettingsmenu);
            generalLabel.setBounds(10, 10, 150, 20);
            generalTab.add(generalLabel);

            JPanel advancedTab = new JPanel();
            advancedTab.setLayout(null);
            JLabel advancedLabel = new JLabel("Credits: ");
            JLabel advancedLabel1 = new JLabel("Thanks to icons8.com for icons");
            JLabel advancedLabel2 = new JLabel("Thanks to Manojavya for all the coding");
            advancedTab.add(advancedLabel1);
            advancedTab.add(advancedLabel2);
            advancedLabel1.setBounds(10, 40, 300, 20);
            advancedLabel2.setBounds(10, 70, 300, 20);
            advancedLabel.setBounds(10, 10, 150, 20);
            advancedTab.add(advancedLabel);

            if (darkMode.isSelected() == true) {
                lightMode.setBackground(java.awt.Color.BLACK);
                advancedTab.setBackground(java.awt.Color.BLACK);
                advancedLabel.setForeground(java.awt.Color.WHITE);
                advancedLabel1.setForeground(java.awt.Color.WHITE);
                advancedLabel2.setForeground(java.awt.Color.WHITE);
            } else if (lightMode.isSelected() == true){
                lightMode.setBackground(java.awt.Color.WHITE);
                advancedTab.setBackground(java.awt.Color.WHITE);
                advancedLabel.setForeground(java.awt.Color.BLACK);
                advancedLabel1.setForeground(java.awt.Color.BLACK);
                advancedLabel2.setForeground(java.awt.Color.BLACK);
            }


            // Add tabs to the tabbed pane
            tabbedPane.addTab("General", generalTab);
            tabbedPane.addTab("Credits", advancedTab);

            // Add the tabbed pane to the settings panel
            settingsPanel.setLayout(null);
            settingsPanel.add(tabbedPane);

            // Add the settings panel to the settings frame
            settingsFrame.add(settingsPanel);

            // Make the settings frame visible
            settingsFrame.setVisible(true);
        });
        

        panel.add(settings);

        Mainframe.add(panel);
        Mainframe.setVisible(true);
    }
}
