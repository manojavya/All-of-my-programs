import java.util.Scanner;
import java.io.*;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String VNO = "Version: 0.0.1";
        System.out.println("Welcome to Networking Assist!");
        System.out.println(VNO);
        System.out.println("Type help for a list of commands or type command");
        String command = in.nextLine();
        if(command.equalsIgnoreCase("help")){
            System.out.println(VNO);
            try {
                BufferedReader loc = new BufferedReader(new FileReader("/home/manojavya/Desktop/Code/Networking-help/src/loc.txt"));
                String line;
                while((line = loc.readLine()) != null){
                    System.out.println(line);
                }
                loc.close();
            } catch(IOException e){
                System.out.println("Error reading help file.");
            }
        }
        else if(command.equalsIgnoreCase("myip")){
            
        }
    }
}
