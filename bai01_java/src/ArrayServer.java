import java.net.Socket;
import java.net.ServerSocket;
public class ArrayServer extends Thread {
	private ServerSocket ss;
	public static void main(String args[])throws Exception
	{
		new ArrayServer();
	}
	public ArrayServer()throws Exception{
		ServerSocket ss = new ServerSocket(1234);
		System.out.println("Server running on port "+1234);
		this.start();
	}
	public void run(){
		while(true){
			try{
			System.out.println("Waiting for client...");
			Socket s=ss.accept();
			System.out.println("Accepting a connection from:"+s.getInetAddress());
			Connect c=new Connect(s);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}