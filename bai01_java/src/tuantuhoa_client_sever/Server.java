package tuantuhoa_client_sever;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Thiết lập server
            ServerSocket serverSocket = new ServerSocket(23);
            System.out.println("Server san sang....");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Ket noi tu" + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                List<Integer> danhSachSo = new ArrayList<>();
                while (!(inputLine = in.readLine()).equals("done")) {
                    danhSachSo.add(Integer.parseInt(inputLine));
                }

                List<Integer> soChiaHetCho3Va5 = timSoChiaHetCho3Va5(danhSachSo);
                for (int so : soChiaHetCho3Va5) {
                    out.println(so);
                }

                // Đóng kết nối
                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean laSoChiaHetCho3Va5(int n) {
        return n % 3 == 0 && n % 5 == 0;
    }

    public static List<Integer> timSoChiaHetCho3Va5(List<Integer> danhSachSo) {
        List<Integer> ketQua = new ArrayList<>();
        for (int n : danhSachSo) {
            if (laSoChiaHetCho3Va5(n)) {
                ketQua.add(n);
            }
        }
        return ketQua;
    }
}
