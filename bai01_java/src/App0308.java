import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App0308 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("nhap 1 chuoi ki tu");
        String st = br.readLine();
        System.out.println("chuoi ban da nhap"+st);
    }
}
