import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;

class Connect extends Thread{
	private Socket client=null;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public Connect(){
	}
	public Connect(Socket client){
		this.client=client;
		try{
			ois=new ObjectInputStream(client.getInputStream());
			oos=new ObjectOutputStream(client.getOutputStream());
		}
		catch(Exception e){
			System.err.println(e);
		}
		this.start();
	}
	public void run(){
		ArrayObject x=null;
		ArrayObject y=null;
		int a1[]=new int[7];
		int a2[]=new int[7];
		int r[]=new int[7];
		try{
			x=(ArrayObject)ois.readObject();
			y=(ArrayObject)ois.readObject();
			a1=x.getArray();
			a2=y.getArray();
			for(int i=0;i<a1.length;i++)r[i]=a1[i]*a2[i];
			ArrayObject res=new ArrayObject();
			res.setArray(r);
			oos.writeObject(res);//
			oos.flush();
			ois.close();
			client.close();
			}
		catch(Exception e){
			}
	}
 }