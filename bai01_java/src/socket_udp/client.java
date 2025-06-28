package socket_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class client {
    public static void main(String[] args) {
        try {
            int i = 0;
            while(i<1000){
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");

            int serverPort = 123;
            String message = "Hello Server "+i;
            byte[] sendData = message.getBytes();
            
            DatagramPacket packet = new DatagramPacket(sendData, sendData.length,serverAddress,serverPort);
            socket.send(packet);
            socket.close();
            i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
