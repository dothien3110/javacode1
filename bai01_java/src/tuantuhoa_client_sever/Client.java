package tuantuhoa_client_sever;

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
            Socket socket = new Socket("localhost", 23);

            // Gửi danh sách số đến server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            for (int so : danhSachSo) {
                out.println(so);
            }
            out.println("done");

            // Nhận kết quả từ server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine;
            List<Integer> soChiaHetCho3Va5 = new ArrayList<>();
            while ((inputLine = in.readLine()) != null) {
                soChiaHetCho3Va5.add(Integer.parseInt(inputLine));
            }

            System.out.println("So chia het cho 3 va 5: " + soChiaHetCho3Va5);

            // Đóng kết nối
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
