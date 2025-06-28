package practive;

public class thread{
    public static void main(String[] args) {
      Runnable run1 = new MyRunnable();
      Runnable run2 = new MyRunnable();

      Thread th1 = new Thread(run1);
      Thread th2 = new Thread(run2);

      th1.start();
      th2.start();
    }
}
class MyRunnable  implements Runnable{
    public void run(){
        int tong=0;
        for(int i=0;i<100;i++){
            if(i%3==0){
                tong=tong+i;
                System.out.println(Thread.currentThread().getName()+":"+tong);
            }
        }
    }
}