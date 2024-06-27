package CoolStuff;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkStuff {
    public static void main(String[] arg) throws UnknownHostException {
        String URL = "www.simplilearn.com";
        InetAddress inetAddress = Inet4Address.getByName(URL);
        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host Address : " + inetAddress.getHostAddress());
        System.out.println();

    }
}
