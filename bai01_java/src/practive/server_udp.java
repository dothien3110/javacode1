package practive;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server_udp {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(117);
            System.out.println("Server san sang");

            byte[] nhandata = new byte[1024];
            DatagramPacket packet = new DatagramPacket(nhandata, nhandata.length);
            socket.receive(packet);
            String message = new String(packet.getData(),0,packet.getLength());
                if(message.length()>0){
                    System.out.println(message);
                }
                socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}
