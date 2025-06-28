package btap_client_server;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Thiết lập server
            ServerSocket serverSocket = new ServerSocket(65432);
            System.out.println("Server san sang...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Ket noi tu" + clientSocket.getInetAddress());

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                List<Integer> danhSachSo = (List<Integer>) in.readObject();

                List<Integer> soChiaHetCho3Va5 = timSoChiaHetCho3Va5(danhSachSo);

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject(soChiaHetCho3Va5);

                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
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

  