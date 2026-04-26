import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class App {
    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        FlatMacDarkLaf.setup();
        UIManager.put("Button.arc", 100);
        UIManager.put("Component.arc", 100);
        UIManager.put("ProgressBar.arc", 100);
        UIManager.put("TextComponent.arc", 80);
        System.out.println("The Periodic table record. | V1.0.0");
        System.out.println("Enter the atomic number of the element you wish to see or type -1 to exit");
        int en = myscanner.nextInt();
        JFrame mainframe = new JFrame("Element");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(10000, 1000);
        mainframe.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 10000, 1000);
        panel.setLayout(null);
        //panel.setBackground(Color.WHITE);
        mainframe.add(panel);

        java.net.URL imgURL = App.class.getResource("images/error.jpg");
        ImageIcon pic = new ImageIcon(imgURL);
        JLabel img = new JLabel(pic);
        img.setBounds(0, 10, 550, 600);
        panel.add(img);

        Font myFont = new Font("Arial", Font.PLAIN, 50);
        Font myFont2 = new Font("Arial", Font.PLAIN, 40);

        JLabel elementname = new JLabel("ERROR! ATOMIC NUMBER NOT FOUND!");
        elementname.setBounds(900, 50, 950, 400);
        elementname.setFont(myFont);
        panel.add(elementname);

        JLabel l1 = new JLabel("\u2022 ERROR_EMPTY_PARAMETER");
        l1.setBounds(930, 120, 1000, 400);
        l1.setFont(myFont2);
        panel.add(l1);

        JLabel l2 = new JLabel("\u2022 Discovered on: ERROR_NULL_NOT_SPECIFIED");
        l2.setBounds(930, 190, 1000, 400);
        l2.setFont(myFont2);
        panel.add(l2);

        JLabel l3 = new JLabel("\u2022 ERROR_NULL_IS_NOT_A_DEFINED_PARAMETER!");
        l3.setBounds(930, 260, 1000, 400);
        l3.setFont(myFont2);
        panel.add(l3);

        JLabel l4 = new JLabel("\u2022 ERROR_NULL_IS_NOT_A_PARAMETER");
        l4.setBounds(930, 330, 1000, 400);
        l4.setFont(myFont2);
        l4.setForeground(Color.BLUE);
        panel.add(l4);

        //If the user types -1 the program will exit
        if (en == 1){
            img.setIcon(new ImageIcon(App.class.getResource("images/hydrogen.jpg")));
            elementname.setText("Hydrogen");
            l1.setText("\u2022 Non-Metal");
            l2.setText("\u2022 Discovered on: 1766");
            l3.setText("\u2022 Not Poisonus");
            l4.setText("\u2022 Lightest gas on earth");

        }
        else if (en == 2){
            java.net.URL url2 = App.class.getResource("images/helium.jpg");
            img.setIcon(new ImageIcon(url2));
            elementname.setText("Helium");
            l1.setText("\u2022 Noble gas");
            l2.setText("\u2022 Discovered on: 1868");
            l3.setText("\u2022 Not Poisonus");
        }
        else if (en == -1){
            System.exit(0);
        }
        else if (en == 23235){
            System.out.println("This is a hidden screen not supposed to be accesible to users, this is just a developer feature made to test the error screen!");
        }
        else if (en == 3){
            java.net.URL url3 = App.class.getResource("images/lithium.jpg");
            img.setIcon(new ImageIcon(url3));
            elementname.setText("Lithium");
            l1.setText("\u2022 Metal");
            l2.setText("\u2022 Discovered on: 1817");
            l3.setText("\u2022 Not Poisonus");
        }
        else if (en == 4){
            java.net.URL url4 = App.class.getResource("images/beryllium.jpg");
            img.setIcon(new ImageIcon(url4));
            elementname.setText("Beryllium");
            l1.setText("\u2022 Metal");
            l2.setText("\u2022 Discovered on: 1798");
            l3.setText("\u2022 Not Poisonus");
        }

        mainframe.setVisible(true);
    }
}
