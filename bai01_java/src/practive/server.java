package practive;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(335);
            System.out.println("sever loading...");
            while (true) {
                Socket socket = server.accept();

                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                List<Integer> danhsach = (List<Integer>)in.readObject();
                List<Integer> sochiacho2 = timso(danhsach);

                ObjectOutputStream out =new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(sochiacho2);
                server.close();
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    public static List<Integer> timso (List<Integer> danhsach){
        List<Integer> ketqua = new ArrayList<>();
        for(int n:danhsach){
           if (n%2==0){
                ketqua.add(n);
           }
        }
            return ketqua;
    }
}
