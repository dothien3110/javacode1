import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class App0305 {
    public static void main(String[] args) throws IOException {
        PipedInputStream pi =new PipedInputStream();
        PipedOutputStream po= new PipedOutputStream(pi);
        System.out.println("du lie ghi duoc");
        for(int i=0; i<10; i++){
            int b =(int)Math.round(Math.random()*20);
            po.write(b);
            System.out.println(b+"");
        }
        po.flush();
        System.out.println();
        System.out.println("du lieu doc duoc");
        while(pi.available()>0){
            int b= pi.read();
            System.out.println(b+"");
        }
        System.out.println();
        pi.close();
        po.close();

    }
}
