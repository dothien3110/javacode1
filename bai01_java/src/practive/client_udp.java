package practive;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class client_udp {
   public static void main(String[] args) {
    try {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        int port = 117;
        String mess = "Hello 123";
        byte[] guidata = mess.getBytes();
        DatagramPacket packet = new DatagramPacket(guidata,guidata.length,address, port);
        socket.send(packet);
        socket.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
