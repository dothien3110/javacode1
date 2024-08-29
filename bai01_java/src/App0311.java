import java.io.*;


public class App0311{
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        int c; 
        try{
            in = new FileReader("input0311.txt");
            out = new FileWriter("output0311.txt");
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally{
            if (in !=null) {
                in.close();
            }
            if (out !=null) {
                out.close();
            }
        }
    }
}