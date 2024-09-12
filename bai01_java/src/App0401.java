
public class App0401 {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();
        t0.start();
        t1.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<100)
        {
    System.out.println(getName()+" "+i);
    i++;
    }  
  }
}