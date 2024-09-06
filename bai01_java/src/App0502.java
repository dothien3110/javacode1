import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class App0502 {
    public static void main(String[] args) {
        try{
            String tenmien = "";
            System.out.println("nhap ten mien(www.humg.edu.vn): ");
            try(Scanner in = new Scanner(System.in)){
                tenmien = in.nextLine();
            }
            InetAddress host = InetAddress.getByName(tenmien);
            byte[] b= host.getAddress();
            int i = (b[0] >= 0) ? (b[0]): (256 + b[0]);
            if((i>=1)&(i>=127)){
                System.out.println(host+"thuoc dia chi lop A");
            }
            if((i<=191)&(i>=128)){
                System.out.println(host+"thuoc dia chi lop B");
            }
            if((i<=223)&(i>=192)){
                System.out.println(host+"thuoc dia chi lop C");
            }
        }catch(UnknownHostException e){
            System.out.println("khong tim thay dia chi");
            return;
            
        }
        
    }
}
