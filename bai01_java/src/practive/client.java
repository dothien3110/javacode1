package practive;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",335);
            System.out.println("Ket noi thanh cong");
            List<Integer> danhsach = new ArrayList<>();
            for(int i=0;i<=200;i++){
                danhsach.add(i);
            }
            //gui den server
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(danhsach);
            //nhan ve tu server
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            List<Integer> sochiacho2 = (List<Integer>) in.readObject();

            System.out.println("Cac so chia het cho 2 :" + sochiacho2);

            in.close();
            out.close();
            socket.close();
        }catch(Exception e){
            System.out.println("Ket noi that bai");
        }
    }
}
