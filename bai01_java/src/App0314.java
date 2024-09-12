import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
public class App0314 implements Serializable {
    protected int tu,mau;
    private transient float giatri = 0;
    public App0314() {tu=0;mau=1;}
    public App0314(int tu, int mau){
        this.tu=tu; this.mau=mau; giatri=(float)tu/mau;
    }
    public String toString(){
        return tu+"/"+mau+" ("+giatri+")";
    }
    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {
        FileOutputStream fo = new FileOutputStream("phansoApp0314.bin");
        BufferedOutputStream bo =new BufferedOutputStream(fo);
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        System.out.println("Nhap hai phan so: ");
        int tu, mau;
        try(Scanner inputScanner = new Scanner(System.in)) {
            for(int i=0;i<2;i++){
                System.out.println("Phan so:"+(i+1));
                System.out.println("Tu so 1: ");tu = inputScanner.nextInt();
                System.out.println("Mau  so: ");mau = inputScanner.nextInt();
                App0314 ps  = new App0314(tu, mau);
                oo.writeObject(ps);
                System.out.println(ps);
            }
        }
        oo.close(); 
        FileInputStream fi = new FileInputStream("phansoApp0314.bin");
        BufferedInputStream bi = new BufferedInputStream(fi);
        ObjectInputStream dtdoc = new ObjectInputStream(bi);
        System.out.println("\nDu lieu doc duoc: ");
        while (bi.available()>0) {
            App0314 ps = (App0314) dtdoc.readObject();
            System.out.println(ps);
        }
        dtdoc.close();
    }
}
