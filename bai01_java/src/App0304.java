import java.io.ByteArrayInputStream;
public class App0304 {
    public static void main(String[] args) {
        byte[]b = new byte[100];
        for(byte i=0; i<b.length; i++)b[i]=i;
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        for(byte i=0; i<b.length; i++){
            int data = input.read();
            System.out.println(data+"");
        }
        
    }
}
