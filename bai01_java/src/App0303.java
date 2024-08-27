import java.io.*;
public class App0303 {
    public static void main(String[] args) throws IOException {
        String fileName ="output0303.txt";
        byte[]a = new byte[10];
        System.out.println("tao mang ngau nhien cac so nguyen");
        for(int i=0; i<a.length; i++){
            a[i] = (byte)Math.round(Math.random()*10);
            System.out.println(a[i]+"");
        }
        System.out.println();
        FileOutputStream fo = new FileOutputStream(fileName);
        fo.write(a);
        fo.close();
        FileInputStream fi=new FileInputStream(fileName);
        byte[]b=new byte[fi.available()];
        fi.read(b);
        fi.close();
        System.out.println("du lieu da doc va luu trong mang b");
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]+"");
        }
        System.out.println();
    }
}
