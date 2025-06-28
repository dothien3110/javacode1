package client_server;

import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try {
            //lang nghe cong
            ServerSocket ss = new ServerSocket(33);
            //chap nhan n client
            while(true){
                Socket clientSocket = ss.accept();
                process pr = new process(clientSocket);
                pr.start();
            }

            //trao doi thong tin

            //ngat ket noi
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
