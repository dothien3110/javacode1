package client_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class process extends Thread {
    private Socket socket;
    public process(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String message;
            while(true){
                //nhan tin nhan
                message=reader.readLine();
                System.out.println("Client :"+ message);
                //gui tin  nhan
                System.out.println("Server :");
                message =sc.nextLine();
                writer.println(message);
                writer.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }
}
