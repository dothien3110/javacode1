package socket_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(123);

            byte[] receiveData =  new byte[1024];
            int count=0;
            while(true){
            DatagramPacket packet = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(packet); 
            String receiveMessage = new String(packet.getData(),0,packet.getLength());
                if(receiveMessage.length()>0){
                    System.out.println("message: "+receiveMessage);}
            count++;
            if(count==1000){
                break;
            }
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
