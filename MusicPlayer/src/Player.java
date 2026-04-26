import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Player {
    public JPanel createPlayerPanel(JFrame frame) {
        // Create a JPanel to hold the button
        JPanel panel = new JPanel();

        // Create a JButton for selecting and playing music
        JButton playButton = new JButton("Select and Play Music");
        playButton.addActionListener(e -> {
            // Open a file chooser to select the audio file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select an Audio File");
            int result = fileChooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                playMusic(selectedFile);
            }
        });

        // Add the button to the panel
        panel.add(playButton);

        // Add the panel to the frame
        frame.add(panel);

        return panel;
    }

    private void playMusic(File musicFile) {
        try {
            // Create an AudioInputStream from the selected file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);

            // Get a Clip object to play the audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Start playing the audio
            clip.start();
            System.out.println("Playing: " + musicFile.getName());

            // Close the clip when the audio finishes
            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                }
            });
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            JOptionPane.showMessageDialog(null, "Error playing music: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the Player and add the panel to the frame
        Player player = new Player();
        player.createPlayerPanel(frame);

        // Make the frame visible
        frame.setVisible(true);
    }
}