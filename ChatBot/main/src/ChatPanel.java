import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    public ChatPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.DARK_GRAY);

        // Create a non-editable chat area with a scroll pane
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setBackground(Color.LIGHT_GRAY);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        this.add(scrollPane, BorderLayout.CENTER);

        // Create an input field for user messages
        JTextField inputField = new JTextField();
        this.add(inputField, BorderLayout.SOUTH);

        // Set font for input field and chat area
        inputField.setFont(new Font("cursive", Font.PLAIN, 20));
        chatArea.setFont(new Font("cursive", Font.PLAIN, 20));
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        // Display a welcome message in the chat area
        chatArea.append("Welcome to ChatBoxx!\n");

        // Add action listener for the input field
        inputField.addActionListener(e -> {
            String message = inputField.getText().trim();

            if (message.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else if (message.equalsIgnoreCase("clear")) {
                chatArea.setText("");
            } else if (message.equalsIgnoreCase("Hi")) {
                chatArea.append("Bot: Hello! How can I help you?\n");
            } else {
                chatArea.append("You: " + message + "\n");
                chatArea.append("Bot: I am still under Development so right now I cant help you with what you just said as i am unable to catch you. \n");
            }
            else if (message.equalsIgnoreCase("/Seed")) {
                chatArea.append("Bot: Sorry this isint minecraft so i cant load any seed right now\n");
            }
            else if (message.equalsIgnoreCase("/help")) {
                chatArea.append("Bot: Just type any thing and then it depends if i am able to process it. \n");
            }

            inputField.setText("");
        });
    }
}