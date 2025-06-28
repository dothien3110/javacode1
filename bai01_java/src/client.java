import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class client {
    public static void main(String[] args) throws Exception {
        try{
            Socket socket = new Socket("localhost",38);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //Lay du lieu tu user
            try(Scanner sc = new Scanner(System.in)){
                System.out.println("Nhap so Nguyen duong: ");
                int x = sc.nextInt();
                //gui du lieu sang server
                out.writeInt(x);
            }
            out.flush();
            //nhan du lieu
            System.out.println(in.readUTF());
            in.close();
            out.close();
            socket.close();
        }catch(Exception e){}

    }
}
