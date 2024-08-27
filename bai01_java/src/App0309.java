import java.io.FileReader;
public class App0309 {
    public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader("input0309.txt");
        int i;
        while ((i=fr.read())!=-1) {
            System.out.println((char)i);
        }
        fr.close();
    }
    
}
