import java.net.InetAddress;
import java.net.UnknownHostException;
public class App0501 {
    public static void main(String[] args) {
        try{
            if(args.length!=1){
                System.out.println("cach su dung: java App0501<Hostname>");
            }
            InetAddress host = InetAddress.getByName("www.humg.edu.vn");
            
            String hostname = host.getHostName();
            System.out.println("hostname"+hostname);
            System.out.println("dia chi ip: "+host.getHostAddress());

        }catch(UnknownHostException e){
            System.out.println("khong tim thay dia chi");
            return;
            
        }
    }
}
