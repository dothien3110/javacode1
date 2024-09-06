import java.net.*;
import java.util.Scanner;
public class App0503 {
    public static void main(String[] args) {
        try{
            String myUrl="";
            System.out.print("Nhap Url: ");
            try(Scanner in = new Scanner(System.in)){
                myUrl=in.nextLine();
            }
            @SuppressWarnings("deprecation")
            URL u = new URL(myUrl);
            System.out.println("URL is "+u);
            System.out.println("the protocol part is "+u.getProtocol());
            System.out.println("the host part is "+u.getHost());
            System.out.println("the file part is "+u.getFile());
        }catch(MalformedURLException e){
            System.err.println(e);  
    }
    }
}
