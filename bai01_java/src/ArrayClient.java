import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
public class ArrayClient{
	public static void main(String[] args)throws Exception{
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		int dat1[]={3,3,3,3,3,3,3};
		int dat2[]={5,5,5,5,5,5,5};
		Socket s=new Socket("localhost",1234);
		oos=new ObjectOutputStream(s.getOutputStream());
		ois=new ObjectInputStream(s.getInputStream());
		ArrayObject a1=new ArrayObject();
		a1.setArray(dat1);
		ArrayObject a2=new ArrayObject();
		a2.setArray(dat2);
		ArrayObject res=null;
		int r[]=new int[7]; // result
		oos.writeObject(a1); // socket
		oos.writeObject(a2);
		oos.flush();

		res=(ArrayObject)ois.readObject();
		r=res.getArray();
		System.out.println("The result received from server...");
		System.out.println();
		for(int i=0;i<r.length;i++)System.out.print(r[i]+" ");
	}
}