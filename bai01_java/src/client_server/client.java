package client_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 33);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            String message;
            while(true){
                //gui tin  nhan
                System.out.println("Client :");
                message =sc.nextLine();
                writer.println(message);
                writer.flush();
                //nhan tin nhan
                message=reader.readLine();
                System.out.println("Server :"+ message);
            }
        } catch (Exception e) {
            System.out.println("Ket noi that bai");
        }
    }
}
