import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;;
public class App0504 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws MalformedURLException {
        try(Scanner sc = new Scanner(System.in)){
            String StrUrl;
            System.out.println("Nhap Url: ");
            StrUrl = sc.nextLine();
            URL u;
            String thisLine;
            if(StrUrl.length()>0){
                try{
                    u = new URL(StrUrl);
                    try{
                        DataInputStream dis = new DataInputStream(u.openStream());
                        while((thisLine = dis.readLine())!=null)
                            System.out.println(thisLine);
                    }catch(IOException e){
                        System.err.println(e);
                    }
                }catch(MalformedURLException e){
                    System.err.println(e);
                }
            }
        }
    }
}
