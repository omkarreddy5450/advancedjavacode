import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            // 1. Get InetAddress of local host
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Information:");
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());

            // 2. Get InetAddress using host name (factory method: getByName)
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Information:");
            System.out.println("Host Name: " + google.getHostName());
            System.out.println("IP Address: " + google.getHostAddress());

            // 3. Get all IP addresses of a host (factory method: getAllByName)
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            System.out.println("\nAll IP Addresses of www.google.com:");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

            // 4. Create InetAddress using IP directly
            InetAddress ipAddr = InetAddress.getByName("8.8.8.8");
            System.out.println("\nUsing IP Address:");
            System.out.println("Host Name: " + ipAddr.getHostName());
            System.out.println("IP Address: " + ipAddr.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Error: Unable to resolve host.");
        }
    }
}