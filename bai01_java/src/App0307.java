import java.io.IOException;
import java.util.Scanner;
public class App0307 {
    public static void main(String[] args) throws IOException {
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("ho ten cua ban la");
            String hoten = sc.nextLine();
            System.out.println("nhap so tuoi: ");
            int tuoi = sc.nextInt();
            System.out.println("Xin chao " + hoten + tuoi+" tuoi");
        }
    }
}
