import java.awt.*;
import javax.swing.*;
public class gui{
    public static void initialise(){
        JFrame mainframe = new JFrame("GUI Practice");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(2000, 1500);
        mainframe.setLayout(null);

        JPanel mypanel = new JPanel();
        mypanel.setSize(2000, 1500);
        mypanel.setLayout(null);

        JLabel nameprompt = new JLabel("Enter your name below: ");
        nameprompt.setBounds(100, 120, 500, 25);
        mypanel.add(nameprompt);

        JTextField usrname = new JTextField("Name");
        usrname.setBounds(100, 190, 500, 27);
        mypanel.add(usrname);

        JLabel name = new JLabel();
        name.setBounds(100, 260, 500, 25);
        mypanel.add(name);

        JButton mybutton = new JButton("Save name");
        mybutton.setBounds(100, 50, 150, 25);
        mybutton.addActionListener(e -> {
            System.out.println("Update name");
            String uname = usrname.getText();
            String cnfrminit = JOptionPane.showInputDialog(null, "Is \"" + uname + "\" your name?", "Confirm Name", JOptionPane.PLAIN_MESSAGE);
            boolean cnfrm = false;
            if (cnfrminit.equalsIgnoreCase("yes")){
                cnfrm = true;
                final String username = uname;
                name.setText("Your name has been updated to: " + username);
            }
            else if(cnfrminit.equalsIgnoreCase("no")){
                cnfrm = false;
                while(cnfrm == false){
                    uname = JOptionPane.showInputDialog(null, "Re-enter name: ", "Change Name", JOptionPane.PLAIN_MESSAGE);
                    cnfrminit = JOptionPane.showInputDialog(null, "Is \"" + uname + "\" your name?", "Confirm Name", JOptionPane.PLAIN_MESSAGE);
                    if (cnfrminit.equalsIgnoreCase("yes")){
                        cnfrm = true;
                        final String username = uname;
                        name.setText("Your name has been updated to: " + username);
                    }
                    else if(cnfrminit.equalsIgnoreCase("no")){
                        cnfrm = false;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        mypanel.add(mybutton);

        mainframe.add(mypanel); 
        mainframe.setVisible(true);
    }
}