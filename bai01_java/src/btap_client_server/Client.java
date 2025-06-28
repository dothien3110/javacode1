package btap_client_server;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Tạo danh sách từ 1 đến 100
            List<Integer> danhSachSo = new ArrayList<>();
            for (int i = 1; i <= 100; i++) {
                danhSachSo.add(i);
            }

            // Kết nối đến server
            Socket socket = new Socket("localhost", 65432);

            // Gửi danh sách số đến server
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(danhSachSo);

            // Nhận kết quả từ server
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            List<Integer> soChiaHetCho3Va5 = (List<Integer>) in.readObject();

            System.out.println("So chi het cho 3 va 5: " + soChiaHetCho3Va5);

            // Đóng kết nối
            in.close();
            out.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

