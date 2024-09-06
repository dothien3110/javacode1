// DO NGOC THIEN -2121050259
import java.io.*;
public class BasicIO {
    public static void main(String[] args) throws IOException {
        byte bytearr[] = new byte[255];
        try{
            System.out.println("Enter a line of text");
            System.in.read(bytearr,0,255);
            System.out.println("The line type was : ");
            String str = new String(bytearr,"Default");
            System.out.println(str);
            }
            catch(Exception e){
                System.out.println("Error !");
            }
    }
}
