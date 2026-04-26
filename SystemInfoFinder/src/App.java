import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) {
        System.out.println("V.1.0.0");
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String IPAddress = inetAddress.getHostAddress();
            System.out.println("IP Address: " + IPAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
