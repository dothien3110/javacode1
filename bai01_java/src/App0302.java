
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class App0302 {
    public static void main(String[] args)throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        int x;
        try {
            inputStream = new FileInputStream("input0302.txt");
            outputStream = new FileOutputStream("output0302.txt");
            while ((x= inputStream.read()) != -1) {
                outputStream.write(x);
            }
            System.out.println("\nDa ghi len tep tin dich output0302.txt");
        } finally {
            if (inputStream != null) {
                inputStream.close();                
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
    }
}
